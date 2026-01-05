package spelling;


import java.util.LinkedList;

public class DictionaryLL implements Dictionary {

    private LinkedList<String> dict;

    DictionaryLL() {
        dict = new LinkedList<String>();
    }

    public boolean addWord(String word) {
        String lowercaseWord = word.toLowerCase();
        if (!dict.contains(lowercaseWord)) {
            dict.add(lowercaseWord);
            return true;
        } else {
            return false;
        }
    }

    public int size() {

        return dict.size();
    }

    public boolean isWord(String s) {

        return dict.contains(s.toLowerCase());
    }

}