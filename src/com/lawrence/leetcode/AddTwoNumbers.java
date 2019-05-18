package com.lawrence.leetcode;


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int bCarryOver = 0;
        ListNode head = null, current = null, previous = null;

        while( l1 != null && l2 != null)
        {
            int value = l1.val + l2.val + bCarryOver;
            if(value >= 10)
            {
                bCarryOver = 1;
                value -= 10;
            }
            current = new ListNode(value);
            if(previous == null)
                head = current;
            else
                previous.next = current;

            previous = current;

            l1 = l1.next;
            l2 = l2.next;
        }
        return head;
    }
}
