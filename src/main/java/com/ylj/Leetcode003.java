package com.ylj;

import java.util.HashSet;
import java.util.Set;

public class Leetcode003 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int k = 0;
        for(int i = 0; i< s.length();i++){
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(k++));
            }
            set.add(s.charAt(i));
            max = Math.max(i-k +1,max);

        }
        return max;
    }
}
