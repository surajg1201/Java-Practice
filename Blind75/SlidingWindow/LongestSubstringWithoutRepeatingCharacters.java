package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }

    static int longestSubstring(String s){
        int l = 0;
        int res = 0;
        Set<Character> seen= new HashSet<>();
        int r=0;
        while(r<s.length()){
            while(seen.contains(s.charAt(r))) {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            res = Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}
