public class ReverseLinkedList {
    public ListNode reverse(ListNode root)
    {
        if(root.next==null)
            return root;
        else
        {
            ListNode cur=reverse(root.next);
            root.next.next=root;
            root.next=null;
            return cur;
        }
    }
}
