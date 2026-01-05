package com.suraj;
class Solution {

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t) {

        StringBuilder str1 = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder(t);
        for(int i=s.length()-1; i>=0;i--){
            if(s.charAt(i)=='#'){
                if(s.charAt(i-1)=='#'){
                    str1.deleteCharAt(i-1);
                    i--;
                    str1.deleteCharAt(i-1);
                }
                else{
                    str1.deleteCharAt(i-1);
                }
            }
        }
        for(int i=t.length()-1; i>=0;i--){
            if(t.charAt(i)=='#'){
                if(t.charAt(i-1)=='#'){
                    str2.deleteCharAt(i-1);
                    i--;
                    str2.deleteCharAt(i-1);
                }
                else{
                    str2.deleteCharAt(i-1);
                }
            }
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;

    }
}