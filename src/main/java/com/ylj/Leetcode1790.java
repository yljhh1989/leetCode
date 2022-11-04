package com.ylj;

public class Leetcode1790 {

    public boolean areAlmostEqual(String s1, String s2) {
        int m = 0;
        char[] c1 = new char[2];
        char[] c2 = new char[2];
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!= s2.charAt(i)){
                m ++;
                if(m >2){
                    return false;
                }
                c1[m-1] = s1.charAt(i);
                c2[m-1] = s2.charAt(i);
            }
        }
        if(m==0 || (m ==2 && c1[0] == c2[1] && c1[1] == c2[0])){
            return true;
        }
        return false;
    }
}
