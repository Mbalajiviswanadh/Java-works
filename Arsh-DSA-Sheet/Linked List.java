import java.util.*;
class LinkedList {
    static ListNode head;
    static class ListNode{
        ListNode next ;
        int data;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public static boolean solve(ListNode head){

        ListNode fast = head;
        ListNode slow = head;
        // base case
        if(head==null || head.next ==null)
        return false;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow=slow.next;

            if(slow==fast)
            return true;
        }
        return false;
    }

}
