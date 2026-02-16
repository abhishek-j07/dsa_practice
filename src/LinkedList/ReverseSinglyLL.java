package LinkedList;

public class ReverseSinglyLL {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {

            ListNode ahead = curr.next;
            curr.next = prev;

            prev = curr;
            curr = ahead;
        }

        return prev;
    }
}
