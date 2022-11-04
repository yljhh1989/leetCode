package com.ylj;

public class Leetcode002 {

    public static void main(String[] args) {
         ListNode l03 =   new ListNode(9);
         ListNode l02 =  new ListNode(9);
         l02.next=l03;
         ListNode l1 =  new ListNode(9);
         l1.next=l02;
         ListNode l13 =   new ListNode(4);
         ListNode l12 =  new ListNode(6);
         l12.next=l13;
         ListNode l2 =  new ListNode(5);
       //  l2.next=l12;
         addTwoNumbers(l1,l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p =null;
        ListNode m = null;
        int k = 0;
        while (l1 !=null || l2 !=null){
            int i = 0;
            int j = 0;
            if(l1 != null){
               i =  l1.val;
               l1=l1.next;
            }
            if(l2 != null){
                j =  l2.val;
                l2=l2.next;
            }
            int n =i+j;
            if (m == null) {
               m =  new ListNode();
               m.val =   n %10 +k;
               k = n/10;
               p = m;
            } else {
                ListNode x =  new ListNode();
                x.val =   (n+k) %10;
                k = (n+k)/10;
                p.next = x;
                p =x;
            }
        }
        // 处理最后的进位
        if(k == 1){
            ListNode x =  new ListNode();
            x.val =  1;
            p.next = x;
        }
        return m;

    }
}



   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
