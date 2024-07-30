import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    static class ListNode{
        ListNode next;
        int val;

        ListNode(int val){
            this.next=null;
            this.val=val;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode res = new ListNode(0);

        res.next=head;

        ListNode leftprev=res;
        ListNode curr= head;

        for(int i=0;i<left-1;i++){
            leftprev=leftprev.next;
            curr=curr.next;
        }

        ListNode subHead=curr;

        ListNode prev=null;
        
        for(int i=0;i<=right-left;i++){
            ListNode newNode = curr.next;
            curr.next=prev;

            prev=curr;
            curr=newNode;
        }

        leftprev.next=prev;
        subHead.next=curr;

        return res.next;

        
        
        // if(head==null || head.next==null)
        // return head;
        // List<Integer> list = new ArrayList<>();

        // ListNode curr=head;
        // while(curr!=null){
        //     list.add(curr.val);
        //     curr=curr.next;
        // }
        // ListNode start=head;

        // ListNode curr1=head;
        // while(curr1!=null){
        //     curr1=curr1.next;
        // }
        // ListNode end=curr1;

        // ListNode rev= new ListNode(0);
        // ListNode temp=rev;
        // for(int i=right; i>=left;i--){
        //     ListNode newNode = new ListNode(i);
        //     temp.next=newNode;
        //     temp=temp.next;
        // }
        
        // start.next=rev.next;

        // ListNode last=start;
        // while(last!=null){
        //     last=last.next;
        // }
        
        // if(!(last.next==null))
        // last.next=end;

        // return start;


    }
}