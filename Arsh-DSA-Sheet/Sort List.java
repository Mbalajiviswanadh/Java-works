import java.util.*;

class SortingTheList{
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
            ListNode temp= head;
            while(temp.next!=null){
                temp=temp.next;
            }
                temp.next=newNode;
        }
    }
    
    public static ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow=head;
        
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    
    public static ListNode merge(ListNode left, ListNode right){
        
        ListNode res= new ListNode(0);
        
        ListNode curr= res;
        
        while(left!=null && right != null){
            
            if(left.data<right.data){
                curr.next=left;
                left=left.next;
            }
            else{
                curr.next=right;
                right = right.next;
            }
            
            curr=curr.next;
        }
        if (left != null) {
            curr.next = left;
        } else if (right != null) {
            curr.next = right;
        }
        
        return res.next;
    }
    
    
    public static ListNode sort(ListNode head){
        if(head==null || head.next==null)
        return head;
        
        ListNode mid=middle(head);
        ListNode righthead=mid.next;
        mid.next=null; //breaking the first LL
        
        ListNode left=sort(head);
        ListNode right=sort(righthead);
        
        return merge(left,right);
        
    }
    
    public static void print(ListNode head){
        
        ListNode start=head;
        
        while(start != null){
            System.out.print(start.data+" ");
            start=start.next;
        }
        
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        
        head = sort(head);
        print(head);
    }
}