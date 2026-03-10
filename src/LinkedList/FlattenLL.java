package LinkedList;

public class FlattenLL {


    static class Node {
        public int data;
        public Node next;
        public Node child;

        Node()
        {
            this.data = 0;
            this.next = null;
            this.child = null;
        }
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.child = null;
        }
        Node(int data, Node next, Node child)
        {
            this.data = data;
            this.next = next;
            this.child = child;
        }
    }

    public static void main(String[] args) {

    }

    public static Node flattenLinkedList(Node head) {

        if(head == null || head.next == null){
            return head;
        }

        Node newHead = flattenLinkedList(head.next);

        return merge(head, newHead);
    }

    public static Node merge(Node head1, Node head2){

        Node dummyNode = new Node(-1);
        Node head = dummyNode;

        while(head1 != null && head2 != null){

            if(head1.data <= head2. data){
                dummyNode.child = head1;
                dummyNode = head1;
                head1 = head1.child;
            }else {
                dummyNode.child = head2;
                dummyNode = head2;
                head2 = head2.child;
            }

            dummyNode.next = null;
        }

        if(head1 != null){
            dummyNode.child = head1;
        }else{
            dummyNode.child = head2;
        }

        return head.child;
    }
}
