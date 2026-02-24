package LinkedList;

public class DetectCycle {

    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {


        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null && fast.next.next != null && slow.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                ListNode newSlow = head;
                while(newSlow != fast) {
                    newSlow = newSlow.next;
                    fast = fast.next;
                }

                return newSlow;
            }
        }

        return null;

    }
}
