package com.suraj.PracticeAccenture;
//Implement the following functions.a
//
//char*MoveHyphen(char str[],int n);
//
//The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-)
// in the string to the front of the given string.
//
//NOTE:- Return null if str is null.
//
//Example :-
//
//Input:
//str.Move-Hyphens-to-Front
//Output:
//—MoveHyphenstoFront
//Explanation:-
//
//The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”
//
//Sample Input
//
//Str: String-Compare
//Sample Output-
//
//-StringCompare
public class Q9 {
    public static void main(String[] args) {
        String str = "String-Compare";
        int n = str.length();
        System.out.println(moveHyphen(str,n));
    }
    static String moveHyphen(String str,int n){
        if(str.isEmpty()){
            return null;
        }
        String res = "";
        for(int i =0; i<n;i++){
            if(str.charAt(i) == '-'){
                res = str.charAt(i) + res;
            }
            else{
                res= res+ str.charAt(i);
            }
        }

        return res;
    }

}
