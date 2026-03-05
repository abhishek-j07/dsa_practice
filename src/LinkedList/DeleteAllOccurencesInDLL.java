package LinkedList;

public class DeleteAllOccurencesInDLL {

    class Node {
        public int data;
        public Node next;
        public Node prev;

        Node()
        {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        Node(int data, Node next, Node prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {

    }

    public static Node deleteAllOccurrences(Node head, int k) {

        if (head == null) {
            return null;
        }

        Node temp = head;

        while(temp != null && temp.data == k){

            temp = temp.next;

        }

        if(temp == null){
            return null;
        }

        head = temp;
        head.prev = null;


        while(temp != null && temp.next != null){

            if (temp.data == k) {

                Node pre = temp.prev;
                Node nex = temp.next;

                pre.next = nex;
                nex.prev = pre;
            }

            temp = temp.next;
        }

        if(temp != null && temp.data == k){
            temp = temp.prev;
            temp.next = null;
        }

        return head;
    }
}
