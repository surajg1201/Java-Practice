package document;

import java.util.List;

public class EfficientDocument extends Document {

    private int numWords;
    private int numSentences;
    private int numSyllables;

    public EfficientDocument(String text) {
        super(text);
        processText();
    }

    private boolean isWord(String tok) {
        return tok.matches("[a-zA-Z]+");
    }

    protected int countSyllables(String word) {
        word = word.replaceAll("[^a-zA-Z]", "");

        int syllables = 0;
        boolean prevVowel = false;
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            boolean isVowel = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';

            if (isVowel && !prevVowel) {
                syllables++;
            }
            prevVowel = isVowel;
        }

        if (word.endsWith("e") && syllables > 1) {
            char secondLastChar = word.charAt(word.length() - 2);
            boolean secondLastCharIsVowel = "aeiouy".indexOf(Character.toLowerCase(secondLastChar)) != -1;

            if (!secondLastCharIsVowel) {
                syllables--;
            }
        }

        if (syllables == 0) {
            syllables = 1;
        }

        return syllables;
    }

    private void processText() {
        List<String> tokens = getTokens("[!?.]+|[a-zA-Z]+");

        numWords = 0;
        numSentences = 0;
        numSyllables = 0;
        for (int i = 0; i < tokens.size(); i++) {
            if (isWord(tokens.get(i))) {
                numWords++;
                numSyllables += countSyllables(tokens.get(i));
                if (i == tokens.size() - 1) {
                    numSentences++;
                }
            } else {
                numSentences++;
            }
        }
    }

    @Override
    public int getNumSentences() {
        return numSentences;
    }

    @Override
    public int getNumWords() {
        return numWords;
    }

    @Override
    public int getNumSyllables() {
        return numSyllables;
    }

    public static void main(String[] args) {
        testCase(new EfficientDocument("This is a test.  How many???  "
                        + "Senteeeeeeeeeences are here... there should be 5!  Right?"),
                16, 13, 5);
        testCase(new EfficientDocument(""), 0, 0, 0);
        testCase(new EfficientDocument("sentence, with, lots, of, commas.!  "
                + "(And some poaren)).  The output is: 7.5."), 15, 11, 4);
        testCase(new EfficientDocument("many???  Senteeeeeeeeeences are"), 6, 3, 2);
        testCase(new EfficientDocument("Here is a series of test sentences. Your program should "
                + "find 3 sentences, 33 words, and 49 syllables. Not every word will have "
                + "the correct amount of syllables (example, for example), "
                + "but most of them will."), 49, 33, 3);
        testCase(new EfficientDocument("Segue"), 2, 1, 1);
        testCase(new EfficientDocument("Sentence"), 2, 1, 1);
        testCase(new EfficientDocument("Sentences?!"), 3, 1, 1);
        testCase(new EfficientDocument("Lorem ipsum dolor sit amet, qui ex choro quodsi moderatius, nam dolores explicari forensibus ad."),
                32, 15, 1);
    }
}