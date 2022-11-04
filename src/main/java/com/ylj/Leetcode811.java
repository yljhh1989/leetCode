package com.ylj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Leetcode811 {


    public static void main(String[] args) {
        String[] strs = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> strings = subdomainVisits(strs);
        for(String s : strings) {
            System.out.println(s);
        }
    }


    public  static List<String> subdomainVisits(String[] cpdomains) {

        List<String> result = new ArrayList<>();
        Map<String,Integer> resultMap = new HashMap<>();

        for(String s: cpdomains){
            String[] splits = s.split(" ");
            String m = splits[1];
            Integer i = Integer.parseInt(splits[0]);
            do {
                if( resultMap.containsKey(m)){
                    resultMap.put(m,resultMap.get(m) + i);
                } else {
                    resultMap.put(m, i);
                }
                int index = m.indexOf(".");
              if (index <= 0){
                  break;
              } else {
                  m = m.substring(index +1);
              }
            }while (true);
        }

        for(Map.Entry<String,Integer> entry: resultMap.entrySet()){
            result.add(entry.getValue() + " "+ entry.getKey());
        }

        return result;
    }
}
