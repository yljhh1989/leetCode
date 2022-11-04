package com.ylj;

public class Leetcode322 {


    public int coinChange(int[] coins, int amount) {

        int[] mun = new int[amount+1];
        mun[0] = 0;
        for (int i = 1; i < amount; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++){
                int k = i-coins[j];
                if(k >= 0 &&  mun[k]<min){
                  min = mun[k] +1;
                }
            }
            mun[i] = min;
        }
        return mun[amount] == Integer.MAX_VALUE ? -1 : mun[amount];
    }

}
