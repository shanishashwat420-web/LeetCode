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
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            if (list.size() == 0 || list.get(list.size() - 1) != temp.val) {
                list.add(temp.val);
            }
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int x : list) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }
}