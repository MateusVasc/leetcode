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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        } else if (head.next != null && head.val == head.next.val) {
            ListNode next = head.next;

            while (next != null && head.val == next.val) {
                next = next.next;
            }

            head.next = deleteDuplicates(next);
        } else {
            head.next = deleteDuplicates(head.next);
        }

        return head;
    }
}