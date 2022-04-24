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
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, head = result;

        int carry = 0;
        while(p != null || q != null){
            if(p == null){
                p = new ListNode(0);
            }
            if(q == null){
                q = new ListNode(0);
            }

            int sum = carry + p.val + q.val;
            carry = sum / 10;

            head.next = new ListNode(sum % 10);
            head = head.next;

            if (p!=null) p = p.next;
            if (q!=null) q = q.next;
        }

        if (carry > 0){
            head.next = new ListNode(carry);
        }

        return result.next;

    }
}