/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode p = l1, q = l2, head = result;
        int carryover = 0;

        while (p != null || q != null || carryover > 0) {
            if (p == null) p = new ListNode(0);
            if (q == null) q = new ListNode(0);

            int sum = p.val + q.val + carryover;
            carryover = sum / 10;

            head.next = new ListNode(sum % 10);

            head = head.next;
            p = p.next;
            q = q.next;
        }
        return result.next;
    }
}