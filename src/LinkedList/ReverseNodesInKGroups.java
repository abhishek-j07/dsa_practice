package LinkedList;

public class ReverseNodesInKGroups {

    public static void main(String[] args) {

    }

    public ListNode reverseKGroup(ListNode head, int k) {


        ListNode temp = head;
        ListNode prevNode = null;


        while(temp != null){

            ListNode kNode = traverseKNodes(temp, k);

            if(kNode == null){

                if(prevNode != null){
                    prevNode.next = temp;
                }
                break;
            }

            ListNode nextNode = kNode.next;
            kNode.next = null;

            reverse(temp);

            if(temp == head){

                head = kNode;

            }else{

                prevNode.next = kNode;

            }

            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }

    public ListNode traverseKNodes(ListNode temp, int k) {

        k -= 1;

        while(temp != null && k > 0){
            temp = temp.next;
            k--;
        }

        return temp;
    }

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
