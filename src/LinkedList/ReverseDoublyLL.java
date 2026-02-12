package LinkedList;

class Node {
    int data;
    Node next;
    Node back;

    // Constructor to initialize data only
    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    // Constructor to initialize data, next, and back
    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
}

// Solution class that contains core logic
class Solution {

    // Function to convert an array into a doubly linked list
    public Node convertArr2DLL(int[] arr) {

        // Creating the head of the DLL using the first array element
        Node head = new Node(arr[0]);

        // Initializing previous pointer to head
        Node prev = head;

        // Loop through rest of the array to construct DLL
        for (int i = 1; i < arr.length; i++) {

            // Create new node with current value, null next, and prev back pointer
            Node temp = new Node(arr[i], null, prev);

            // Connect previous node's next to this new node
            prev.next = temp;

            // Move prev to this new node
            prev = temp;
        }

        // Return the head of the constructed DLL
        return head;
    }

    // Function to reverse the doubly linked list
    public Node reverseDLL(Node head) {

        Node curr = head;

        Node last = null;

        while(curr != null) {

            last = curr.back;
            curr.back = curr.next;
            curr.next = last;

            curr = curr.back;
        }

        return last.back;
    }

    // Function to print the DLL from head to end
    public void printDLL(Node head) {

        // Traverse till end
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
}
// driver class
public class ReverseDoublyLL {
    public static void main(String[] args) {

        // Create an instance of Solution class
        Solution sol = new Solution();

        // Sample array input
        int[] arr = {1, 2, 3, 4, 5};

        // Convert array to DLL
        Node head = sol.convertArr2DLL(arr);

        // Print the original DLL
        System.out.print("Original DLL: ");
        sol.printDLL(head);

        // Reverse the DLL
        Node reversed = sol.reverseDLL(head);

        // Print the reversed DLL
        System.out.print("Reversed DLL: ");
        sol.printDLL(reversed);
    }
}