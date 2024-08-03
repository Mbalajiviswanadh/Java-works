import java.util.*;
class PartitionList {
    static class ListNode {
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    static ListNode head;

    public static void insert(int val){
        ListNode newNode = new ListNode(val);

        if(head==null){
            head=newNode;
        }
        else{
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public static ListNode partion(ListNode head,int x){
        if(head==null || head.next==null)
        return head;

        ListNode leftside= new ListNode(0);
        ListNode left= leftside;

        ListNode rightside= new ListNode(0);
        ListNode right= rightside;


        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                left.next=curr;
                left=left.next;
            }
            else{
                right.next=curr;
                right=right.next;
            }
            curr=curr.next;
        }

        right.next=null;

        left.next=rightside.next;

        return leftside.next;
    }

    public static void print(ListNode head){
        if(head==null)
        System.out.println("NULL");

        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();

        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            insert(val);
        }
        System.out.println();

        int x=sc.nextInt();
        print(head);
        System.out.println();
        ListNode newhead=partion(head, x);
        print(newhead);
    }
}
