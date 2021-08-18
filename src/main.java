import javax.naming.directory.SearchResult;
import java.io.File;
import java.io.IOException;
import java.util.*;
import Stringsss.*;
public class main {
    public static void main(String[] args) {
        new Combinationsum().combinationSum(new int[]{2,3,6,7},7);
        File file=new File("E:\\ManageEngine\\INTEGRATION\\tmp\\data.json");
        System.out.println(file.getName());
        try {
            System.out.println(file.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<String> x=new HashSet<>();
        x.add("123132");
        x.add("admin");
        x.retainAll(Arrays.asList("admin","admin2"));

        ListNode root2=new ListNode(40);
        root2.next=new ListNode(20);
        root2.next.next=new ListNode(60);
        root2.next.next.next=new ListNode(10);
        root2.next.next.next.next=new ListNode(50);
        root2.next.next.next.next.next=new ListNode(30);
        ListNode rev=new ReverseLinkedList().reverse(root2);
        root2=new MergeSortLinkedList().doMergeSort(root2);
        new BalancedString().balancedStringSplit("LLLLRRRR");
        new hashcode().checkIfStringsareEqual("H1","h2");
        new KClosestElement().findClosestElements(new int[]{1,2,3,4,5},4,-1);
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        new InorderTreeTraversal().inorder(root);
        new maxRemovable().maximumRemovals("xsqnwrghwdruzfmxus","hwrms",new int[]{6,11,5,3,9,12,1,13,15,2,0,4,16,10,8,14,7,17});
        new makEqual().makeEqual(new String[]{"asdf"});
       /* int[][] grid= {{1,3,1},{1,5,1},{4,2,1}};
        int[][]grid2={{1,2,3},{4,5,6}};
        new MinStepsMatrix().minPathSum(grid2);*/
  /*      new longestSequence().longestConsecutive(new int[]{100,4,200,1,3,2});
        new threesum().threeSum(new int[]{-1,0,1,2,-1,-4});
        new medianof2sortedarray().findMedianSortedArrays(new int[]{1,3},new int[]{2});
  new interleaving().isInterleave("aabcc","dbbca","aadbbcbcac");*/
       /* int[][] grid={{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        new island().maxAreaOfIsland(grid);
        new SearchSuggestionSystem().suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"},"mouse");
        new listofList().foo(Arrays.asList("orange, apple apple, banana orange apple, banana".split(", ")),Arrays.asList("orange, apple, apple, banana, orange, apple, banana".split(", ")));
*/      //  searchResult.searchSuggestions(Arrays.asList("bags","baggage","banner","box","cloths"),"bags");
        ListNode head=new ListNode(4);
        head.next=new ListNode(2);
        head.next.next=new ListNode(1);
     //   head.next.next.next=new ListNode(3);
        new sortLinkedList().sortList(head);
     //   String s=new tempC("saimonesh","123321").toString();
       /* TreeNode root=new TreeNode();
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        new isBalanced().isBalanced(root);*/
     //   new ToBTree().buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});
     /*   ListNode node=new ListNode(-10);
        node.next=new ListNode(-3);
        node.next.next=new ListNode(0);
        node.next.next.next=new ListNode(5);
        node.next.next.next.next=new ListNode(9);
        TreeNode x=new SortedListNodeToTreeNode().sortedListToBST(node);*/
        //new matrix90(new int[][]{{1,2},{3,4}}).rotate();
      /*  Node node=new Node(57);
        node.right=new Node(76);
        node.left=new Node(77);
        node.left.left=new Node(21);
        node.left.right=new Node(16);
        new AllLeafNode(node).getLeafs();*/
        /*NoOfCoins coin=new NoOfCoins(new int[]{1,2,5},0);
        coin.combinations();*/
        //new N_Queen(4).solveNQueens();
//    new Boat(new int[][]{{1,0,1,1},{0,0,0,0},{1,1,0,1},{1,1,0,1}}).res();
        //  new Boat(new int[][]{{1,1,1,1},{0,0,0,0},{1,1,1,1},{1,1,1,1}}).res();
        // new Boat(new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}}).res();
     /*   Node root=new Node(12);
        root.left=new Node(13);
        root.right=new Node(10);
        root.right.right=new Node(15);
        root.right.left=new Node(14);
        root.right.left.left=new Node(21);
        root.right.left.right=new Node(24);
        root.right.right.left=new Node(22);
        root.right.right.right=new Node(23);
        new BurningTree(root,14).printBurning();*/
        //  new maxcityvisit(8,5,new int[][]{{1,2},{7,4},{7,3},{5,8},{1,3}}).maxcitys();
        // new maxcityvisit(8,7,new int[][]{{4,4},{2,3},{2,3},{2,5},{2,7},{5,7},{6,8}}).maxcitys();

  /*      Node node=new Node(1);
        node.left=new Node(2);
        node.left.left=new Node(3);
        node.left.right=new Node(4);
        node.right=new Node(5);
        node.right.right=new Node(6);
   //     new Flatten().traverse(node);
        new removeduplicates(new String[]{"root/a 1.txt(abcd) 2.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/d 4.txt(efggdfh)"}).remove();*/
      /*  Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.right.right=new Node(5);
        new LevelOrder().levelOrder(node);*/
     /*   List<List<Integer>> temp = new ArrayList<>();
        temp.add(Arrays.asList(1, 2, 3));
        temp.add(Arrays.asList(0, 0, 4));
        temp.add(Arrays.asList(7, 6, 5));
        //  new cutoffTrees().cutoffTrees(temp);
        new stringpattern().findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"},"abb");*/
        //     new specialElement(new int[][]{{1,3,4},{5,2,9},{8,7,6}}).getElement();
//        SwapZeros z=new SwapZeros(new int[]{1, 2, 0, 0, 0, 3, 6});
//        System.out.println(z.doSwap());
        //       System.out.println(new OddEven(new int[]{1,9,2,3,5,4,7,10}).doSwap());
    }
}
