import java.util.*;;

class  SortList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.next=null;
            this.val=val;
        }
    }
    // finding the mid value :
    public ListNode mid(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow is the mid value
        return slow;


    }

    // mergeing the leftpart and rightpart :
    public ListNode merge(ListNode leftpart, ListNode rightpart) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (leftpart != null && rightpart != null) {
            if (leftpart.val < rightpart.val) {
                curr.next = leftpart;
                leftpart = leftpart.next;
            } else {
                curr.next = rightpart;
                rightpart = rightpart.next;
            }
            curr = curr.next;
        }
        // if any values are remaining
        curr.next = (leftpart != null) ? leftpart : rightpart;
        return dummy.next;
    }

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode midvalue = mid(head);
        ListNode rightHead = midvalue.next;
        midvalue.next = null;

        ListNode leftpart = sortList(head);
        ListNode rightpart = sortList(rightHead);
        return merge(leftpart, rightpart);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
       

        // code for user input, yet to done(pending)!!
    }
}
