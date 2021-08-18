public class MergeSortLinkedList {
    public ListNode doMergeSort(ListNode root) {
        return sortList(root);
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3. merge l1 and l2
        return merge(l1, l2);
    }

    private ListNode merge(ListNode left, ListNode right) {
        if (left == null)
            return right;
        if (right == null)
            return left;
        ListNode res = null;
        if (left.val < right.val) {
            res = left;
            res.next = merge(left.next, right);
        } else {
            res = right;
            res.next = merge(left, right.next);
        }
        return res;
    }
}
