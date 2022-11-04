package com.ylj;

public class Leetcode769 {

    public static void main(String[] args) {
        int[] arr = {1,2,0,3};
        System.out.println(maxChunksToSorted(arr));
    }

    public static int maxChunksToSorted(int[] arr) {
        int[]  arr1 = new int[arr.length];
        int[]  arr2 = new int[arr.length];
        int max = arr[0];;
        for (int i =0;i < arr.length;i++){
                if(max <arr[i]) {
                    max = arr[i];
                }
                arr1[i] = max;
        }
        int min = arr1[arr.length-1];
        for(int i = arr.length-1; i >=0;i--){
                if(min >arr[i]) {
                    min = arr[i];
                }
                arr2[i] = min;
        }
        int result = 1;
        int a = arr2[0];
        for (int i =0;i < arr.length;i++){
           if(arr2[i] !=a  ){
               a = arr2[i];
               if(arr2[i] > arr1[i-1]){
                   result ++;
               }
           }
        }
        return result;
    }

    public static void printArr(int[] arr){
        for(int a :arr) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }
}
