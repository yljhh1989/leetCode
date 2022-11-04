package com.ylj;

public class Leetcode518 {


    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};
        System.out.println(change(amount,coins));
    }

    public static int change(int amount, int[] coins) {


        int[] count = new int[amount+1];
        count[0]= 1;
        for(int j = 0;j<coins.length;j++) {
            for(int i =1; i<=amount;i++){
                if (i-coins[j]>=0){
                    count[i] += count[i-coins[j]];
                }
            }
        }
        return count[amount];
    }
}
