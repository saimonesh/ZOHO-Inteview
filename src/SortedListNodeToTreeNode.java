import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SortedListNodeToTreeNode {
    int size=0;
    List<ListNode> nodes=new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        while(head!=null)
        {
            nodes.add(head);
            head=head.next;
        }
        TreeNode treeHead=makeTreeNode(0,nodes.size()-1);
        return treeHead;
    }
    private TreeNode makeTreeNode(int left,int right)
    {
        if(left>right)
            return null;
        else
        {
            int middle=left+(right-left)/2;
            TreeNode node=new TreeNode(nodes.get(middle).val);
            node.right=makeTreeNode(middle+1,right);
            node.left=makeTreeNode(left,middle-1);
            return node;
        }

    }
}
