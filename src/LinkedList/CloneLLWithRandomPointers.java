package LinkedList;

public class CloneLLWithRandomPointers {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {

        Node temp = head;

        //copy nodes
        while(temp != null){
            Node n = new Node(temp.val);
            n.next = temp.next;
            temp.next = n;
            temp = temp.next.next;
        }

        //copy nodes random
        temp = head;
        while(temp != null){

            if(temp.random != null){
                temp.next.random = temp.random.next;
            }else{
                temp.next.random = null;
            }
            temp = temp.next.next;
        }


        //copy next nodes

        Node dummy = new Node(-1);
        Node res = dummy;
        temp = head;

        while(temp != null){

            dummy.next = temp.next;
            dummy = dummy.next;
            temp.next = temp.next.next;
            temp = temp.next;

        }

        return res.next;

    }
}
