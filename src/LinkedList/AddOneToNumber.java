package LinkedList;

public class AddOneToNumber {

    public static void main(String[] args) {

    }

    public static Node addOne(Node head) {

        int carry = helper(head);

        if(carry > 0){
            Node node = new Node(1);
            node.next = head;
            head = node;
        }

        return head;
    }

    public static int helper(Node head){

        if(head == null){
            return 1;
        }

        int carry = helper(head.next);

        head.data = carry + head.data;

        if(head.data == 10){

            head.data = 0;
            return 1;
        }

        return 0;
    }
}
