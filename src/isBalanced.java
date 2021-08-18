public class isBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        else
        {
            int left=heightOfSubTree(root.left);
            int right=heightOfSubTree(root.right);
            return Math.abs(left-right)<2;
        }

    }
    public int heightOfSubTree(TreeNode root)
    {
        if(root==null)
            return 0;
        else
        {
            int leftSubTreeHeight=heightOfSubTree(root.left);
            int rightSubTreeHeight=heightOfSubTree(root.right);
            if(leftSubTreeHeight==-1 || rightSubTreeHeight==-1 || Math.abs(leftSubTreeHeight-rightSubTreeHeight) >1)
                return -1;
            return Math.max(leftSubTreeHeight,rightSubTreeHeight)+1;

        }
    }
}
