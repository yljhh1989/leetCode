package com.ylj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode017 {

    public static final Map<String,String> MAP = new HashMap<>();
    static {
        MAP.put("2","abc");
        MAP.put("3","def");
        MAP.put("4","ghi");
        MAP.put("5","jkl");
        MAP.put("6","mno");
        MAP.put("7","pqrs");
        MAP.put("8","tuv");
        MAP.put("9","wxyz");

    }

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if( digits ==null ||"".equals(digits) ){
            return result;
        }
        if(digits.length() == 1){
            String s = MAP.get(digits);
            char[] chars = s.toCharArray();
            for(char c:chars){
                result.add(String.valueOf(c));
            }

        } else {
            char c0 = digits.charAt(0);
            String s = MAP.get(c0 + "");
            char[] chars = s.toCharArray();
            List<String> strings = letterCombinations(digits.substring(1));
            for(char c:chars){
                for(String str:strings){
                    result.add(c+str);
                }
            }
        }
        return result;
    }
}
