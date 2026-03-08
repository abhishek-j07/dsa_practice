package LinkedList;

public class RemoveDuplicatesFromDLL {

    public static void main(String[] args) {

    }

    public static Node uniqueSortedList(Node head) {

        Node i = head;
        Node j = head.next;

        while(i != null && j != null){

            if(i.data == j.data){
                j = j.next;
            }else{
                i = i.next;
                i.data = j.data;
                j = j.next;
            }
        }

        i.next = null;

        return head;
    }
}
