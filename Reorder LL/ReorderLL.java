import java.util.*;

class Main{
    static ListNode head;
    static class ListNode{
        
        ListNode next;
        int data;
        
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static void insert(int data){
        ListNode newNode = new ListNode(data);
        
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
    public static ListNode mid(ListNode head){
        
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode rhead){
        ListNode prev=null;
        ListNode curr=rhead;
        
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public static ListNode reorder(ListNode l , ListNode r){
        ListNode res= new ListNode(0);
        ListNode curr=res;
        
        while(l!=null && r!=null){
            curr.next=l;
            l=l.next;
            curr=curr.next;
            curr.next=r;
            r=r.next;
            curr=curr.next;
        }
        // add reaming values 
        if(l!=null)
        curr.next =l;
        
        return res.next;
    }
    public static ListNode solve(ListNode head){
            
   
        if(head==null || head.next==null)
        return head;
        
        ListNode midval=mid(head);
        ListNode rightHead=midval.next;
        midval.next=null;
        
        ListNode left=head;
        ListNode right=reverse(rightHead);
        
        return reorder(left, right);
        
    }
    
    public static void printres(ListNode head){
        if(head == null)
        System.out.print("NULL");
        
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("NULL");
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            
            insert(data);
        }

        printres(head);
        System.out.println();
        ListNode newhead=solve(head);
        printres(newhead);
        
    }
}