package UNI_STS.Linked_List;

import java.util.Scanner;


class Detect_LoopINLL{
    static ListNode head;
    static class ListNode {
        ListNode next;
        int data;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    // // public static void display(){
    //     if(head==null){
    //         System.out.println("empty List");
    //     }

    //     ListNode temp=head;
    //     while(temp!=null){
    //         System.out.print(temp.data+" -> ");
    //         temp=temp.next;
    //     }
    //     System.out.println("NULL");
    // }


    // public static void insterVal(int data){
    //     ListNode newNode = new ListNode(data);

    //     if(head==null){
    //         head=newNode;
    //         return;
    //     }

    //     ListNode curr=head;
    //     while(curr.next!=null){
    //         curr=curr.next;
    //     }
    //     curr.next=newNode;
    // }

    public static boolean findingLoop(ListNode head){
        if(head==null && head.next==null){
            return false;
            
        }

        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        Detect_LoopINLL DL=new Detect_LoopINLL();
          // DL.display();
         // Example usage:
         ListNode head = new ListNode(3);
         head.next = new ListNode(2);
         head.next.next = new ListNode(0);
         head.next.next.next = new ListNode(-4);
         // Creating a cycle
         head.next.next.next.next = head.next;

         System.out.println("Result : "+DL.findingLoop(head));
 
        
    }
}