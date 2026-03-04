package LinkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        ListNode sum = new ListNode(0);
        ListNode sumHead = sum;

        while(l1 != null && l2 != null){

            int s =  l1.val + l2.val + carry;

            if(s > 9){
                s = s % 10;
                carry = 1;
            }else{
                carry = 0;
            }

            ListNode temp = new ListNode(s);
            sum.next = temp;
            sum = sum.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){

            int s =  l1.val + carry;

            if(s > 9){
                s = s % 10;
                carry = 1;
            }else{
                carry = 0;
            }

            ListNode temp = new ListNode(s);
            sum.next = temp;
            sum = sum.next;

            l1 = l1.next;

        }

        while(l2 != null){

            int s =  l2.val + carry;

            if(s > 9){
                s = s % 10;
                carry = 1;
            }else{
                carry = 0;
            }

            ListNode temp = new ListNode(s);
            sum.next = temp;
            sum = sum.next;

            l2 = l2.next;

        }

        if(carry > 0){
            ListNode temp = new ListNode(carry);
            sum.next = temp;
        }

        return sumHead.next;
    }
}
