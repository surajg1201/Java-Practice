package com.suraj;

import java.util.Arrays;

public class LongestCommonPrefix
{
    public static void main(String[] args)
    {
        String[] arr = {"flower", "flow", "flight"};
        String ans = longestCommonPrefix(arr);
        System.out.println(ans);
    }

    static String longestCommonPrefix(String[] arr)
    {
        Arrays.sort(arr);
        String s = arr[0];
        String e = arr[arr.length - 1];
        int i = 0;
        while (i < s.length() && i < e.length())
        {
            if (s.charAt(i) == e.charAt(i))
            {
                i++;
            } else
            {
                break;
            }
        }
        return s.substring(0, i);
    }
}
