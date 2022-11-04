package com.ylj;

public class Leetcode007 {

    public int reverse(int x) {

        int result = 0;
        String str = x +"";
        char c = str.charAt(0);
        String flag = "";
        if(c == '-'){
            flag +=c;
            str=str.substring(1);
        }
        StringBuffer sb = new StringBuffer();
        for(int i =str.length()-1 ;i >= 0;i--){
            sb.append(str.charAt(i));
        }
        str = sb.toString();
        str = flag + str;
        try {
            result = Integer.parseInt(str);
        }catch (Exception e){
            result = 0;
        }
        return result;
    }
}
