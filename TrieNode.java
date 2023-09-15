//CSCI 1913 Fall 2022 Project 3
//Author: Brock Bye


public class TrieNode<T> {
    private T data;         //Storing the current value associated with this node.
    private TrieNode<T> children[];         //Storing the children (next links) of this node. Initially this array will be full of 26 nulls as we will only “fill in” child nodes as needed.


    /**
     * A default constructor which will initialize data to null, and initialize the children to an array with 26 spaces (all null).
     */
    public TrieNode() {
        this.data = null;
        children = new TrieNode[26];
        //(Type cast: T) (T[]) new Object[26]
    }


    /**
     * Getter method that gets the data.
     * @return
     */
    public T getData() {
        return data;
    }


    /**
     * Setter method that sets the data.
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }


    /**
     * A public method which returns the TrieNode<T> associated with the given letter.
     *
     * – If not given a lowercase English letter (’a’ through ’z’) it should return null.
     *
     * – Otherwise you will be returning a TrieNode from the children array.
     *      The letters ’a’ through ’z’ map to children[0] to children[25] so you will need to convert the char to an index into this array.
     *
     * – If the correct array element is null, a new TrieNode should be put in the array and returned.
     *   Otherwise the current TrieNode in the array should be returned.
     * @param letter
     * @return
     */
    public TrieNode<T> getChild(char letter) {
        if (!('a' <= letter && letter <= 'z')) {
            return null;
        }


        else {
            int index = (letter - 'a');

            if (children[index] == null) {
                children[index] = new TrieNode();
            }

            return children[index];
        }
    }
}