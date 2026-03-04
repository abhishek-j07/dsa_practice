package LinkedList;

public class IntersectionNode {

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode listA = headA;
        ListNode listB = headB;
        int lenA = getLLLength(listA);
        int lenB = getLLLength(listB);

        int abs = Math.abs(lenA - lenB);

        if(lenA > lenB){

            for(int i = 0; i < abs; i++){
                headA = headA.next;
            }
        }else{

            for(int i = 0; i < abs; i++){
                headB = headB.next;
            }
        }

        while (headA != null && headB != null){

            if(headA == headB){
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public int getLLLength(ListNode head){

        int  len = 0;

        while(head != null){
            len++;
            head = head.next;
        }

        return len;
    }
}
