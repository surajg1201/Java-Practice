package com.suraj;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(longestRepeatingCharRep(s,1));
    }

    static int longestRepeatingCharRep(String s, int k){
        int res = 0;
        int maxF = 0;
        int l = 0;
        Map<Character,Integer> count = new HashMap<>();
        for(int r = 0; r<s.length(); r++){
            char c = s.charAt(r);
            count.put(c,count.getOrDefault(c,0)+1);
            maxF = Math.max(maxF, count.get(c));

            while((r-l+1) - maxF > k){
                char leftC = s.charAt(l);
                count.put(leftC,count.get(leftC)-1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
     return res;
    }
}
