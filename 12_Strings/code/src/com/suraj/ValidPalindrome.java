package com.suraj;

public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s));
    }

    static boolean isValidPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            while(l<r && !alphaNum(s.charAt(l))){
                l++;
            }
            while(r>l && !alphaNum(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    static boolean alphaNum(char c){
        return c>='A' && c<='Z' || c>='a' && c<='z'|| c>='0' && c<='9';
    }
}
