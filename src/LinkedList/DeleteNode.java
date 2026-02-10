package LinkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


public class DeleteNode {

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {

        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }
}
