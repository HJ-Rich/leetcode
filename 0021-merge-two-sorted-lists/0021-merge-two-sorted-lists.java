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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        final ListNode answer = new ListNode();
        ListNode current = answer;

        while (list1 != null || list2 != null) {
            int nextVal;
            if (list1 == null) {
                nextVal = list2.val;
                list2 = list2.next;
            } else if (list2 == null) {
                nextVal = list1.val;
                list1 = list1.next;
            } else {
                nextVal = Math.min(list1.val, list2.val);
                if (nextVal == list1.val) {
                    list1 = list1.next;
                } else {
                    list2 = list2.next;
                }
            }

            current.next = new ListNode(nextVal);
            current = current.next;
        }

        return answer.next;
    }
}