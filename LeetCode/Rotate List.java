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
        int data;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int length(ListNode head){
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
        return head;
        int size=length(head);
        // to simplify the k value
        
        k=k % size;
        if(k==0)
        return head;

        // ListNode res = new ListNode(0);
        // ListNode curr=res;
        ListNode temp= head;
        for(int i=0;i<size-k-1;i++){
            temp=temp.next;
        }
        
        ListNode rightside=temp.next;
        temp.next=null;
        // finding the end of the right side part

        ListNode right=rightside;
        while(right.next!=null){
            right=right.next;
        }
        right.next=head;

        return rightside;

        
        
        // int rightsize=length(right);
        // int i=0;
        // while(i<rightsize){
        //     i++;
        //     curr.next=right;
        //     curr=curr.next;
        //     right=right.next;

        // }

        // curr.next=head;

        // return res.next;

        

    }
}