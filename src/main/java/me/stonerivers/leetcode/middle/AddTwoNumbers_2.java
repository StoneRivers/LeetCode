package me.stonerivers.leetcode.middle;

/**
 * 不要想着用int或者long作为转换媒介,因为会超过其大小限制
 * Created by ZhangYuanan on 2018/5/1.
 */
public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode now1 = l1;
        ListNode now2 = l2;

        int carry = 0;

        ListNode result = null;
        ListNode nodeLast = null;
        while (now1 != null || now2 != null || carry !=0) {
            int val1 = 0;
            int val2 = 0;
            if (now1 != null) {
                val1 = now1.val;
                now1 = now1.next;
            }
            if (now2 != null) {
                val2 = now2.val;
                now2 = now2.next;
            }

            int sum = val2 + val1 + carry;
            carry = sum >= 10 ? 1 : 0;
            ListNode nodeNow = new ListNode(sum % 10);
            if (result == null) {
                result = nodeNow;
            } else {
                nodeLast.next = nodeNow;
            }
            nodeLast = nodeNow;
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
