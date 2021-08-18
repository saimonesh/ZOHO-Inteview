import java.util.LinkedList;

public class Flatten {
    Node prev;
    public void traverse(Node root)
    {
        if(root==null)return;
        else
        {
            traverse(root.left);
            traverse(root.right);
            root.left=prev;
            root.right=null;
            prev =root;
        }
    }
}
