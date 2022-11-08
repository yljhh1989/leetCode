package com.ylj;

public class Leetcode019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0){
            return head;
        }
        int len = 1;
        ListNode p = head;
        while (p.next != null){
            len ++;
            p=p.next;
        }

        if(n > len){
            return  head;
        }
       int k = len - n;
        if(k == 0 && head.next == null){
            return null;
        }
        if(k ==0){
            p =head.next;
            head.next = null;
            return  p;
        }
        p = head;
        int i =0;
        while (i !=k-1){
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}
