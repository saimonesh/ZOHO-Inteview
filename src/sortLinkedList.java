import java.util.ArrayList;
import java.util.List;

public class sortLinkedList {
    List<ListNode> nodes=new ArrayList<ListNode>();
    public ListNode sortList(ListNode head) {
        while(head!=null)
        {
            nodes.add(head);
            head=head.next;
        }
        head=divide(0,nodes.size());
        return head;

    }
    public ListNode divide(int start,int end)
    {
        int m=start+((end-start)/2);
        if(start<end)
        {
            ListNode left=divide(start,m);
            ListNode right=divide(m+1,end);
            return sort(left,right);
        }
        if(m<nodes.size())
            return new ListNode(nodes.get(m).val);
        else return null;
    }
    private ListNode sort(ListNode left,ListNode right)
    {
        ListNode sorted=new ListNode();
        ListNode end=sorted;
        while(left!=null && right!=null)
        {
            if(left.val<right.val)
            {
                end.next=new ListNode(left.val);
                left=left.next;
            }else
            {
                end.next=new ListNode(right.val);
                right=right.next;
            }
            end=end.next;
        }
        if(left!=null)
            end.next=left;
        else if(right!=null)
            end.next=right;
        return sorted.next;
    }
}
