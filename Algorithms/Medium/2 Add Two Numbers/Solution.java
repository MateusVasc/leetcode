/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int l1Value = (l1 != null) ? l1.val : 0;
        int l2Value = (l2 != null) ? l2.val : 0;
        int sum = l1Value + l2Value + carry;
        carry = sum / 10;

        ListNode head = new ListNode(sum % 10);
        head.next = addTwoNumbers((l1 != null) ? l1.next : null, (l2 != null) ? l2.next : null, carry);

        return head;
    }
}