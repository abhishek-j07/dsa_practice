package LinkedList;

public class DeleteMiddleNode {

    public static void main(String[] args) {

    }

    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next == null){
            ListNode temp = slow.next;
            slow = temp;
            slow.next = slow.next.next;
        }else{
            slow.next = slow.next.next;
        }

        return head;
    }
}
