import java.util.*;

class LinkedList_Cycle{
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static boolean isitCycle(ListNode head){

        ListNode slow=head;
        ListNode fast=head;

        while(slow != null && fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast)
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode head;
        ListNode tail;

        System.out.println("Enter the size of the list :");
        int n =sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the values inside :");

       
    }
}