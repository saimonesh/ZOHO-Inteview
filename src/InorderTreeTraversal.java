import java.util.ArrayList;
import java.util.List;

public class InorderTreeTraversal {
    List<Integer> res=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        else
        {
            inorder(root.left);
            res.add(root.val);
            inorder(root.right);



        }
    }
}
