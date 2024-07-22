/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Intersection_of_LL {
    static class ListNode{
        ListNode next;
        int data;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int getsize(ListNode node){
        int size=0;
        while(node!=null){
            node=node.next;
            size++;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=getsize(headA);
        int sizeB=getsize(headB);

        while(sizeA > sizeB){
            sizeA--;
            headA=headA.next;
        }

        while(sizeB>sizeA){
            sizeB--;
            headB=headB.next;
        }

        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}