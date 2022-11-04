package com.ylj;

public class Leetcode006 {

    public String convert(String s, int numRows) {
        StringBuffer sb = new StringBuffer();
        if (numRows == 1){
            return s;
        }
        int m = numRows- 2;
        int step = 2*(m +1);
        int i = 0;
        while (i <s.length()){
            sb.append(s.charAt(i));
            i += step;
        }
        for (int j = 0;j<m;j++){
            i = 0;
            while (i <s.length()){
                int  k = i+j+1;
                if(k >= s.length()){
                    break;
                }
                sb.append(s.charAt(k));
                k = i+step-j-1;
                if(k >= s.length()){
                    break;
                }
                sb.append(s.charAt(k));
                i += step;
            }
        }
         i = 0;
        while (i <s.length()){
           int  k = i+numRows-1;
            if(k >= s.length()){
                break;
            }
            sb.append(s.charAt(k));
            i += step;
        }
        return sb.toString();
    }
}
