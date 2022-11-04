package com.ylj;

import java.util.HashSet;
import java.util.Set;

public class Leetcode817 {


    public int numComponents(ListNode head, int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }

        int k = 0;
        boolean flag = false;
        do {
        if(set.contains(head.val)) {
            flag =true;
        } else {
            if (flag) {
                k++;
                flag = false;
            }
        }
        } while ((head = head.next )!=null);
        if(flag){
            k++;
        }
        return k;
    }



}
