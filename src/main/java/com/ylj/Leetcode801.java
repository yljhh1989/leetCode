package com.ylj;

public class Leetcode801 {

    public static void main(String[] args) {
        int[] nums1 = {0,7,8,10,10,11,12,13,19,18};
        int[] nums2 = {4,4,5,7,11,14,15,16,17,20};
        int i = minSwap(nums1, nums2);
        System.out.println(i);
    }

    public static int minSwap(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            int at = a,bt =b;
            if ((nums1[i] > nums1[i-1] && nums2[i] > nums2[i-1]) && (nums1[i] > nums2[i-1] && nums2[i] > nums1[i-1]) ){
                a = Math.min(at,bt);
                b = Math.min(at,bt) + 1;
            }else {
                if (nums1[i] > nums1[i - 1] && nums2[i] > nums2[i - 1]) {
                    a = at;
                    b = bt + 1;
                } else {
                    a = bt;
                    b = at + 1;
                }
            }
        }
        return Math.min(a, b);
    }
}
