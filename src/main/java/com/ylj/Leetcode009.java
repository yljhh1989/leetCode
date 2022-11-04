package com.ylj;

public class Leetcode009 {

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String str = x+"";
        for(int i = 0; i <str.length(); i ++){
            if(i >str.length()-1-i){
                break;
            }
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
