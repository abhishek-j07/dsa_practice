package LinkedList;

public class SortList {

    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode middleNode = getMiddleNode(head);

        ListNode lefthead = head;
        ListNode righthead = middleNode.next;

        righthead = sortList(righthead);
        middleNode.next = null;
        lefthead = sortList(lefthead);

        return merge(lefthead, righthead);
    }

    public ListNode getMiddleNode(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode head1, ListNode head2){

        ListNode dummyHead = new ListNode(-1);
        ListNode temp = dummyHead;

        while(head1 != null && head2 != null){

            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }


        if(head1 != null){
            temp.next = head1;
        }else{
            temp.next = head2;
        }

        return dummyHead.next;
    }
}
