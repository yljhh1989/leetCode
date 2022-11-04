package com.ylj;

public class Leetcode008 {

    public int myAtoi(String s) {

        int flag = 2;
        StringBuffer  sb = new StringBuffer();
        for(int i =0; i<s.length();i++){
            char c =s.charAt(i);
            if (flag == 2){
                switch (c){
                    case ' ':
                        continue;
                    case '-':
                        flag = 0;
                        break;
                    case '+':
                        flag = 1;
                        break;
                    default:
                        flag = 1;
                        if(isNumber(c)){
                            sb.append(c);
                        } else {
                            return 0;
                        }
                        break;
                }
            } else {
                if(isNumber(c)){
                    sb.append(c);
                } else {
                    break;
                }
            }
        }
        String s2 = sb.toString();
        if(s2.length() ==0){
            return 0;
        }
        if(flag == 0){
            s2 = "-"+s2;
        }
        try {
            int result = Integer.parseInt(s2);
            return result;
        }catch (Exception e){
            return flag==0? Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
    }

    public boolean isNumber(char c){
        return c -'0'>=0 && c-'0'<10;
    }
}
