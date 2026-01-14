package com.suraj;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(largestPalindromicSs("babad"));
    }

    static String largestPalindromicSs(String str) {

        String res = "";
        int resLen = 0;

        for (int i = 0; i < str.length(); i++) {
            // odd
            int r = i;
            int l = i;

            while ((l >= 0 && r < str.length()) && str.charAt(l) == str.charAt(r)) {
                if ((r - l + 1) > resLen) {
                    res = str.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                r++;
                l--;
            }

            r = i + 1;
            l = i;
            //even
            while ((l >= 0 && r < str.length()) && str.charAt(l) == str.charAt(r)) {
                if ((r - l + 1) > resLen) {
                    res = str.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                r++;
                l--;
            }

        }
        return res;
    }
}
