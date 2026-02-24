package LinkedList;

public class LengthOfLoop {

    public static void main(String[] args) {

    }

    public static int lengthOfLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null && fast.next.next != null && slow.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                return len(slow,fast);
            }
        }

        return 0;
    }

    private static int len(Node slow, Node fast) {

        int len = 1;
        Node temp = slow.next;

        while(temp != fast) {
            len++;
            temp = temp.next;
        }

        return len;
    }
}
