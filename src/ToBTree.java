import java.util.HashMap;
import java.util.Map;

public class ToBTree {
    int pIndex = 0;
    Map<Integer,Integer> positions=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)
        {
            positions.put(inorder[i],i);
        }
        return buildTree(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd || pIndex > preorder.length) {
            pIndex--;
            return null;
        }
        int inIndex = 0;
        TreeNode root = new TreeNode(preorder[pIndex]);
        inIndex=positions.get(preorder[pIndex]);
        pIndex++;
        root.left = buildTree(preorder, inorder, inStart, inIndex - 1);
        pIndex++;
        root.right = buildTree(preorder, inorder, inIndex + 1, inEnd);
        return root;
    }


}
