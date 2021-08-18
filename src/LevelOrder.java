import java.util.*;

public class LevelOrder {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> x = new LinkedList<>();
        x.add(root);
        List<List<Integer>> myArray = new ArrayList<>();
        while (!x.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int currentSize= x.size();
            for(int i=0;i<currentSize;i++)
            {
                Node temp = x.poll();
                level.add(temp.data);
                if (temp.left != null) {
                    x.add(temp.left);
                }
                if (temp.right != null) {
                    x.add(temp.right);
                }
            }
            myArray.add(level);
        }


        return myArray;
    }
}
