package Trees;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {

    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(InorderTraversal.TreeNode root) {

        List<Integer> res = new ArrayList<>();

        preorder(root, res);

        return res;
    }

    public void preorder(InorderTraversal.TreeNode root, List<Integer> res){

        if (root == null) return;

        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}
