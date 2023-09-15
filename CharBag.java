//CSCI 1913 Fall 2022 Project 3
//Author: Brock Bye
import java.util.*;


/**
 * CharBag - a datastructure for counting characters.
 */
public class CharBag {


    private int[] charBag;
    private int Count;      //Used later on to return the size of the charbag


    /**
     *  A default constructor which creates an empty CharBag
     */
    public CharBag() {
        charBag = new int[27];          //Empty bag a through z, including '.'
        Count = 0;
    }


    /**
     * This function should add a char to the charBag.
     * If the char is an uppercase letter, it should be converted to a lowercase letter before adding (uppercase letters
     * and lowercase letters should be treated as equal)
     * If the char is not an English alphabet letter (’a’ through ’z’) it should be converted to the STOP character ’.’
     * @param c
     */
    public void add(char c) {
        c = Character.toLowerCase(c);
        if ( !( 'a' <= c && c <= 'z') ) {
            charBag[26] += 1;
            Count++;
        }


        else {
            int index = (c - 'a');
            charBag[index] += 1;
            Count++;
        }
    }


    /**
     *  This function should remove a char from the charBag.
     *  If the input letter is not in the charBag no change should happen.
     *  If the letter is in the charBag multiple times, only one copy should be removed, not all copies.
     *  The input char should be converted as noted on add, uppercase letters should be treated as lowercase letters, and non-letters should all be treated like ’.’
     * @param c
     */
    public void remove(char c) {
        c = Character.toLowerCase(c);
        if ( !( 'a' <= c && c <= 'z') ) {
            if (charBag[26] > 0) {
                charBag[26] -= 1;
                Count--;
            }
        }

        else {
            int index = (c - 'a');
            if (charBag[index] > 0) {
                charBag[index] -= 1;
                Count--;
            }
        }

    }


    /**
     * This function gets how many times a given char is in the CharBag.
     * If a letter is not in the CharBag this function should return 0.
     * @param c
     * @return charbag[index]
     */
    public int getCount(char c) {
        c = Character.toLowerCase(c);
        if ('a' <= c && c <= 'z') {
            int index = (c - 'a');
            return charBag[index];
        }

        else {
            return charBag[26];
        }
    }


    /**
     * This function returns the total size of the charBag
     * (I.E. the number of adds minus the number of successful removes)
     * @return Count
     */
    public int getSize() { return Count; }


    /**
     * This function  should return a string noting the count of each letter.
     * @return bagOfChars
     */
    public String toString() {
        String bagOfchars = "CharBag{";
        bagOfchars += "a:" + charBag[0];

        for (char ch = 'b'; ch <= 'z'; ch++) {
            int index = (ch - 'a');
            bagOfchars += ", " + ch + ":" + charBag[index];
        }

        bagOfchars += ", .:" + charBag[26] + '}';
        return bagOfchars;
    }


    /**
     * This function should return a randomly chosen char from the chars in the char bag.
     * This should be chosen in proportion to the number of times a given char is in the datastructre.
     * If the CharBag is empty, this function should return the stop character ’.’
     * @return
     */
    public char getRandomChar() {
        Random rng = new Random ();

        if (getSize() == 0) {
            return LetterSample.STOP ;
        }

        int count = rng.nextInt(getSize());

        for (char ch = 'a'; ch <= 'z'; ch++) {
            count -= getCount(ch);
            if (count < 0) {
                return ch;
            }
        }

        return LetterSample.STOP ;
    }
}
