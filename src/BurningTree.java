import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class BurningTree {
    Node root;
    int fireStarting;

    public BurningTree(Node root, int fireStarting) {
        this.root = root;
        this.fireStarting = fireStarting;
    }

    public void printBurning() {
        HashMap<Integer, LinkedList<Integer>> dataSet = new HashMap<>();
        Node temp = root;
        traverseTree(temp, dataSet,null);
        printBuring(dataSet,fireStarting,new ArrayList());
    }
    public void printBuring(HashMap<Integer, LinkedList<Integer>> dataSet,int nodeToBurn,ArrayList burnt)
    {
        if(dataSet.isEmpty())return;
        else
        {
            LinkedList<Integer> data=dataSet.get(nodeToBurn);
            burnt.add(nodeToBurn);
            dataSet.remove(nodeToBurn);
            data.removeAll(burnt);
            System.out.println(Arrays.toString(data.toArray()));
            burnt.addAll(data);
            for(int x:data){printBuring(dataSet,x,burnt);}
        }
    }

    private void traverseTree(Node temp, HashMap<Integer, LinkedList<Integer>> dataSet, Integer prev_node) {
        if (temp == null) {
            return;
        }
        if(prev_node!=null)    dataSet.computeIfAbsent(temp.data, l -> new LinkedList<>()).add(prev_node);
        if (temp.left != null) {
            dataSet.computeIfAbsent(temp.data, l -> new LinkedList<>()).add(temp.left.data);
            traverseTree(temp.left, dataSet, temp.data);
        }
        if (temp.right != null) {
            dataSet.computeIfAbsent(temp.data, l -> new LinkedList<>()).add(temp.right.data);
            traverseTree(temp.right, dataSet, temp.data);
        }


    }
}
