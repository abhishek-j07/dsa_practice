package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PairSumDLL {

    class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {

    }

    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target)  {

        List<List<Integer>> res = new ArrayList<>();

        ListNode left = head;
        ListNode right = head;

        if(head == null){
            return res;
        }

        while(right.next != null){
            right = right.next;
        }

        while(left.val < right.val){

            if(left.val + right.val == target){

                ArrayList<Integer> list = new ArrayList<>();
                list.add(left.val);
                list.add(right.val);

                left = left.next;
                right = right.prev;

                res.add(list);
            }else if(left.val + right.val < target){
                left = left.next;
            }else {
                right = right.prev;
            }
        }

        return res;
    }
}
