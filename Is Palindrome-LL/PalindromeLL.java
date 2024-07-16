import java.util.*;

class PalindromeLL{

    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head;

    public static void insert(int n){
        Node newNode = new Node(n);
        
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next != null){
                temp= temp.next;
            }
            
            temp.next=newNode;
        }
    }
    
    public static void printvalues(){
        Node curr=head;
        if(head==null){
            System.out.print("NULL");
        }
        
        while(curr != null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("NULL");
    }
    
    public static boolean isPalindrome(Node head){
        
        if(head.next==null)
        return true;
        
        
        Node fEnd=middle(head);
        Node sStart= reverse(fEnd.next);
        
        Node fStart=head;
        while(sStart != null){
            if(fStart.data != sStart.data)
            return false;
            
            fStart=fStart.next;
            sStart=sStart.next;
        }
        return true;
    }
    
    public static Node middle(Node head){
        
        Node fast=head;
        Node slow=head;
        
        while(fast.next != null && fast.next.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    
    public static Node reverse(Node head){
        
        if(head.next==null || head==null)
        return head;
        
        Node prevNode = head;
        Node curr=head.next;
        
        while(curr != null){
            Node nextNode=curr.next;
            curr.next = prevNode;
            
            prevNode = curr;
            curr=nextNode;
        }
        head.next=null;
        head=prevNode;
        return prevNode;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        
        printvalues();
        
        boolean res=isPalindrome(head);
        System.out.println();
        System.out.print(res);
        
        
        
    }

}