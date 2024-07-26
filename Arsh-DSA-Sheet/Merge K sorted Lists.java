
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

 import java.util.*;
class Solution {

    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.next=null;
            this.val=val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists==null || lists.length==0)
        return null;
        List<Integer> list = new ArrayList<>();

        for(ListNode node : lists){
            while(node != null){
                list.add(node.val);
                node=node.next;
            }
        }

        Collections.sort(list);

        ListNode res = new ListNode(0);
        ListNode curr=res;
        for(int i : list){
            curr.next=new ListNode(i);
            curr=curr.next;
        }
        return res.next;
    }
}