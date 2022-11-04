package com.ylj;

public class Leetcode014 {



    public String longestCommonPrefix(String[] strs) {
        int min =Integer.MAX_VALUE;
        for(String str : strs){
            min = Math.min(min,str.length());
        }
        StringBuffer sb = new StringBuffer();
        char c = ' ';
        l1:
        for (int i = 0;i <min;i++){
            for(String str :strs){
                 if(c == ' '){
                     c =  str.charAt(i);
                 }
                 if (c != str.charAt(i)){
                     break l1;
                 }
            }
            sb.append(c);
            c =' ';
        }
        return sb.toString();
    }
}
