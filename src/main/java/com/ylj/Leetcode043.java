package com.ylj;

public class Leetcode043 {

    public static void main(String[] args) {
        System.out.println(multiply(  "3866762897776739956", "15975363164662"));
    }
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        long[] result = new long[num2.length()];
        long[] result1 = new long[num2.length() + num1.length()];
        long x =0;
        for(int i = 0; i <num2.length();i++){
            char c = num2.charAt(num2.length() - 1 - i);
            int k = c - '0';
            long j = k;
            long f = 0;
            for (int l = 0; l < num1.length(); l++) {
                char c1 = num1.charAt(num1.length() - 1 - l);
                int k1 = c1-'0';
                long l1 = j * k1;
                long  y = (l1+x + f)%10;
                x = (l1+x +f)/10;
                if(l == 0){
                    result[result.length-1-i] = y;
                } else {
                   long r = result1[result1.length-l] + y;
                    result1[result1.length-l] = r%10;
                    f = r/10;
                }
            }

        }

         String  str= "";
        if(x != 0){
            str +=x;
        }
        for(long i:result){
            str += i;
        }
       return str;

    }
}
