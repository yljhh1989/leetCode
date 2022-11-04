package com.ylj;



public class Leetcode050 {

    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2147483648));
    }

    public  static double myPow(double x, int n) {

        int k = 1;
        double result = 1;
        if (x == 1.0){
            return result;
        }
        if (x == -1.0){
            if (n%2 == 0) {
                return result;
            }else {
                return -result;
            }
        }
        if(n <0){
            if(n == -2147483648){
                return 0.0;
            }
            k = -1;
            n= Math.abs(n);
        }
        if(n == 0){
            return result;
        }
        for(int i = 0; i < n;i++){
            result *= x;
        }
        if(k == -1){
            return 1/result;
        }
        return result;
    }
}
