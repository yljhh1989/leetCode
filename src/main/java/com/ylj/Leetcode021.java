package com.ylj;

public class Leetcode021 {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)  return list2;
        if (list2 == null)  return list1;
        ListNode head  =new ListNode();
        ListNode p = head;
       while (true){
           if(list1.val > list2.val){
               p.next= list2;
               p=p.next;
              list2 = list2.next;
           } else {
               p.next= list1;
               p=p.next;
               list1 = list1.next;
           }
           if(list1 == null){
               p.next = list2;
               break;
           }
           if(list2 == null){
               p.next = list1;
               break;
           }
       }
       head=head.next;
       return head;
    }
}
