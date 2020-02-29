package DATA_STRUCTURES.LinkedList;

/*
Given a linked list, remove the n-th node from the end of list and return its head.
        Example:

        Given linked list: 1->2->3->4->5, and n = 2.

        After removing the second node from the end, the linked list becomes 1->2->3->5.
        Note:
        Given n will always be valid.

        Follow up:
        Could you do this in one pass?


 */

public class removeNthNode {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(4);
        return result;
    }
}
