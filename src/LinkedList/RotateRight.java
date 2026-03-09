package LinkedList;

public class RotateRight {

    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || k == 0){
            return head;
        }

        int size = getSize(head);

        if(k > size){
            k = k % size;
        }

        if(k == 0){
            return head;
        }

        ListNode newh = reverse(head);

        ListNode temp = newh;
        ListNode kNode = traverseKNodes(temp, k);

        ListNode nextNode = kNode.next;
        kNode.next = null;

        ListNode mainHead = reverse(temp);

        ListNode prev = temp;

        ListNode nexthead = reverse(nextNode);

        prev.next = nexthead;

        return mainHead;

    }

    public int getSize(ListNode head){

        int s = 0;

        while(head != null){
            head = head.next;
            s++;
        }

        return s;
    }

    public ListNode traverseKNodes(ListNode head, int k) {

        --k;

        while(head != null && k > 0){
            head = head.next;
            k--;
        }

        return head;
    }

    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
