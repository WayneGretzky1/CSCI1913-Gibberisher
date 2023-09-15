//CSCI 1913 Fall 2022 Project 3
//Author: Brock Bye


/**
 * This class is where all the pieces are put together.
 * We essentially show the "model" every English word in the dictionary, and have it count each letter transition.
 * We train our "model" once and then can re-use it to generate many words.
 *
 */
public class Gibberisher {
    private Trie<CharBag> model;            //Stores the assorted letter counts for each possible word segment
    private int segment_length;
    private int LetterSamplesCount;         //Tracks how many LetterSamples it’s processed


    /**
     * A constructor that takes the value of the segment length, and initializes the Trie and sample count variables.
     * @param segment_length
     */
    public Gibberisher(int segment_length) {
        this.segment_length = segment_length;
        this.model = new Trie<>();
        this.LetterSamplesCount = 0;
    }


    /**
     *  For each string -
     *  Use the LetterSample class to generate LetterSamples, and then, for each resulting LetterSample:
     *      ∗ Add the sample into the model by using the string from the LetterSample to get the appropriate CharBag, and then adding the char from the LetterSample to that CharBag.
     *      ∗ For the first sample for a given string segment, we need to give that specific segment a new CharBag().
     * @param stringArray
     */
    public void train(String[] stringArray) {
        LetterSample[] sample;                         //Instantiate the variable Letter Samples

        for (int i = 0; i < stringArray.length; i++) {
            sample = LetterSample.toSamples(stringArray[i], segment_length);       //Sample is now a small segment of english text, and what letter tends to follow it.


            for(int j = 0; j < sample.length; j++) {    //Iterating through the sample
                if (model.get(sample[j].getSegment()) == null) {
                    model.put(sample[j].getSegment(), new CharBag());

                }

                model.get(sample[j].getSegment()).add(sample[j].getNextLetter());
                LetterSamplesCount++;
            }
        }
    }


    /**
     * A public method that gets the number of distinct LetterSamples used so far to train the model.
     * @return LetterSamplesCount
     */
    public int getSampleCount() {
         return LetterSamplesCount;
    }


    /**
     * This is where we generate a random character at each segment, to which at this point we should have a lot of charBags() for a lot of different segments and have a good understanding of the english dictionary and what characters (and segments) probably come after one another
     * Remove the STOP character at the end of the string
     * @return word
     */
    public String generate() {
        String word = "";
        word += model.get(word).getRandomChar();

        while (word.charAt(word.length() - 1) != LetterSample.STOP) {
            String sample = word;

            if (word.length() <= segment_length) {
                sample = word;
            }

            if (word.length() > segment_length) {
                sample = word.substring(word.length() - segment_length);
            }

            if (model.get(sample) == null) {
                return word;
            }

            word += model.get(sample).getRandomChar();
        }

        word = word.substring(0, word.length() - 1);
        return word;
    }
}
