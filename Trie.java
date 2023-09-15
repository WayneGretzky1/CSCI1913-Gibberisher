//CSCI 1913 Fall 2022 Project 3
//Author: Brock Bye


/**
 * The Trie class will be our organizational tool to hold the thousands of CharBags and associate them with their preceding letters.
 * The purpose of this class is to keep TrieNodes organized, and provide an easy-to-use interface on this data storage.
 * @param <T>
 */
public class Trie<T> {
    private TrieNode<T> root;

    /**
     * A default constructor that initializes the root to a new node
     */
    public Trie() {
        this.root = new TrieNode<>();
    }


    /**
     * A private getNode function that takes a string and returns the appropriate trieNode.
     * @param s
     * @return trieNode
     */
    private TrieNode<T> getNode(String s) {
        char[] word = s.toCharArray();
        TrieNode<T> trieNode = root;

        for (int i = 0; i < s.length(); i++) {
            trieNode = trieNode.getChild(word[i]);
        }

        return trieNode;
    }


    /**
     * A public method that gets the data currently stored on the TrieNode associated with the input string
     * @param s
     * @return myNode.getData()
     */
    public T get(String s) {
        TrieNode<T> myNode = getNode(s);

        if (myNode == null) {
            myNode = new TrieNode<>();
            return myNode.getData();
        }

        else {
            return myNode.getData();
        }
    }


    /**
     * A public method that sets the data currently stored on the TrieNode associated with the input string to the T value provided.
     * @param s
     * @param sData
     * @return (T) myNode
     */
    public T put(String s, T sData) {
        TrieNode<T> myNode = getNode(s);

        if (myNode == null) {
            myNode = new TrieNode<>();
        }

        myNode.setData(sData);
        return (T) myNode;          //Type casted myNode
    }
}
