public class BoggleSolver {
    SET<String> dictionary;
    
    // Initializes the data structure using the given array of strings as the dictionary.
    // (you can assume each word in the dictionary contains only the uppercase letters A through Z.)
    public BoggleSolver(String[] dictionary) {
        this.dictionary = new SET<>();
        for (String word: dictionary) 
            this.dictionary.add(word);
    }
    
    // Returns the set of all valid words in the given Boggle board, as an Iterable.
    public Iterable<String> getAllValidWords(BoggleBoard board) {
        return null;
    }
    
    // Returns the score of the given word if it is in the dictonary, zero otherwise.
    // (You can assume the word conatins only the uppercase letters A through Z.)
    public int scoreOf(String word) {
       return 0; 
    }  
}