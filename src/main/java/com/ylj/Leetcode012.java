package com.ylj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode012 {

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        List<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(100);
        list.add(10);
        list.add(1);
        StringBuffer sb = new StringBuffer();
        int last = 0;
        for(Integer i : list){
            int k =num/i;
            num = num%i;
            if(last != 0){

                if(k%5 ==4){
                    sb.append(map.get(i));
                    if( k >=5 ){
                        sb.append(map.get(last));
                    } else {
                        sb.append(map.get(5*i));
                    }
                } else {
                    if( k >=5 ){
                        sb.append(map.get(5*i));
                        k = k -5;
                    }
                    if (k >0){
                        for(int j =0;j<k;j++){
                            sb.append(map.get(i));
                        }
                    }

                }
            } else {
                if( k >=5 ){
                    sb.append(map.get(5*i));
                    k = k -5;
                }
                if (k >0){
                    for(int j =0;j<k;j++){
                        sb.append(map.get(i));
                    }
                }
            }
            last = i;
        }
        return sb.toString();

    }
}
