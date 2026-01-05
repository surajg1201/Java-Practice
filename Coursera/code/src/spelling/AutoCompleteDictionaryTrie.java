
package spelling;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

    public class AutoCompleteDictionaryTrie implements Dictionary, AutoComplete {

        private TrieNode root;
        private int size;


        public AutoCompleteDictionaryTrie() {
            root = new TrieNode();
        }

        public boolean addWord(String word) {
            TrieNode preNode = root;
            word = word.toLowerCase();
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (preNode.getChild(c) == null) {
                    preNode = preNode.insert(chars[i]);
                } else {
                    preNode = preNode.getChild(c);
                }
                if (i == (chars.length - 1) && !preNode.endsWord()) {
                    preNode.setEndsWord(true);
                    this.size++;
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return size;
        }

        public boolean isWord(String s) {
            s = s.toLowerCase();
            char[] chars = s.toCharArray();
            TrieNode preNode = root;
            for (int i = 0; i < chars.length; i++) {
                preNode = preNode.getChild(chars[i]);
                if (preNode == null)
                    return false;
            }
            return preNode.endsWord();
        }

        @Override
        public List<String> predictCompletions(String prefix, int numCompletions) {
            List<String> completions = new LinkedList<String>();
            char[] chars = prefix.toCharArray();
            TrieNode preNode = root;
            for (char c : chars) {
                preNode = preNode.getChild(c);
                if (preNode == null) {
                    return completions;
                }
            }
            LinkedList<TrieNode> queue = new LinkedList<TrieNode>();
            queue.add(preNode);
            while (queue.size() > 0 && completions.size() < numCompletions) {
                TrieNode node = queue.removeFirst();
                if (node.endsWord()) {
                    completions.add(node.getText());
                }
                Set<Character> charSet = node.getValidNextCharacters();
                for (Character c : charSet) {
                    queue.add(node.getChild(c));
                }
            }

            return completions;
        }

        public void printTree() {
            printNode(root);
        }

        public void printNode(TrieNode curr) {
            if (curr == null)
                return;

            System.out.println(curr.getText());

            TrieNode next = null;
            for (Character c : curr.getValidNextCharacters()) {
                next = curr.getChild(c);
                printNode(next);
            }
        }

    }

