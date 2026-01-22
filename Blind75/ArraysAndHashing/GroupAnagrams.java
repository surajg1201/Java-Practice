package ArraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
