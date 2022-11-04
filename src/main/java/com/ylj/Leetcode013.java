package com.ylj;

import java.util.HashMap;
import java.util.Map;

public class Leetcode013 {

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
    public static int romanToInt(String s) {
        int result =0;
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        for(int i = 0; i <s.length();i ++){
            String c = String.valueOf(s.charAt(i));
            if(i != s.length()-1){
                String c1 = String.valueOf(s.charAt(i + 1));
                if(map.get(c1)> map.get(c)){
                    result += map.get(c1)- map.get(c);
                    i++;
                } else {
                    result += map.get(c);
                }
            }else {
                result += map.get(c);
            }
        }
        return result;

    }
}
