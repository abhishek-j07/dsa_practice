package LinkedList;

import java.util.Stack;

public class CheckPalindrome {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {

        Stack<ListNode> stack = new Stack<>();

        ListNode slow = head;
        ListNode fast = head;
        stack.push(slow);

        while(fast != null && fast.next != null && fast.next.next != null){

            slow = slow.next;
            fast = fast.next.next;
            stack.push(slow);

        }

        if(fast.next != null){
            slow = slow.next;
        }else{
            stack.pop();
            slow = slow.next;
        }

        while(!stack.isEmpty()){
            if(stack.pop().val != slow.val){
                return false;
            }else{
                slow = slow.next;
            }
        }

        return true;

    }
}
