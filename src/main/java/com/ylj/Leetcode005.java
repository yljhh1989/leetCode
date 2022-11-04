package com.ylj;

public class Leetcode005 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aacabdkacaa"));
    }

    public static String longestPalindrome(String s) {
      boolean[][] dp = new boolean[s.length()][s.length()];
      for(int i = 0;i<s.length();i++){
          dp[i][i] = true;
      }
      int max = 1;
        String result =  s.charAt(0)+"";
        for(int i = s.length()-2;i>=0;i--){
            for (int j = i+1; j < s.length(); j++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if (c1 == c2 ) {
                    if(j -i >1) {
                        dp[i][j] = dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = true;
                    }

                } else {
                    dp[i][j] = false;
                }
                if (dp[i][j] && j-i +1> max){
                    System.out.println(i +"----"+ j);
                    max = j-i+1;
                     result = s.substring(i, j + 1);
                }
            }
        }
        return result;
    }
}
