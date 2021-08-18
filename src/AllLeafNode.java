import java.util.ArrayList;

public class AllLeafNode {
    private Node root;
    private ArrayList<ArrayList<Integer>> paths = new ArrayList<>();

    public AllLeafNode(Node root) {
        this.root = root;
    }

    public ArrayList<ArrayList<Integer>> getLeafs() {
        getLeaf(root, new ArrayList<>());
        return paths;
    }

    private void getLeaf(Node root, ArrayList<Integer> currentPath) {
        if (root.left == null && root.right == null) {
            currentPath.add(root.data);
            paths.add(currentPath);
        } else {
            if (root.left != null) {
                ArrayList<Integer> t=new ArrayList<>(currentPath);
                t.add(root.data);
                getLeaf(root.left,t );

            }

            if (root.right != null) {
                ArrayList<Integer> t=new ArrayList<>(currentPath);
                t.add(root.data);
                getLeaf(root.right, t);

            }
        }
    }
}


