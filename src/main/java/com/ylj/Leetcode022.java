package com.ylj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode022 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n ==0){
           return result;
        }
        if(n == 1){
            result.add("()");
            return result;
        }
        Set<String> set = new HashSet<>();
        List<String> strings = generateParenthesis(n - 1);
        for(String str:strings){
            for(int i = 0; i < str.length();i ++){
                char c = str.charAt(i);
                if(c =='('){
                    StringBuffer sb = new StringBuffer(str);
                    sb.insert(i,")");
                    set.add("("+sb.toString());

                    StringBuffer sb1 = new StringBuffer(str);
                    sb1.insert(i+1,")");
                    set.add("("+sb1.toString());
                } else {
                    continue;
                }
            }
        }
        result.addAll(set);
        return result;
    }
}
