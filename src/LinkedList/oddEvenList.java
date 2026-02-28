package LinkedList;

public class oddEvenList {

    public static void main(String[] args) {

    }

    public ListNode oddoddList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddHead = head;
        ListNode evenHead = head.next;

        while(even != null && even.next != null){

            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenHead;

        return oddHead;
    }
}
