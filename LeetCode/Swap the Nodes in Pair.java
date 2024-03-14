import java.util.*;

class Swap_the_Nodes_InPairs{
    static ListNode head;
     static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data=data;
           this.next =null;
        }
     }

     public static void insertTheValues(int data){
        ListNode newNode =new ListNode(data);

        if(head ==null){
            head=newNode;
            return;
        }

        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        // joining the newNode
        temp.next=newNode;

     }

    //  main function to swap the two pairs

    public static ListNode swapPairs(ListNode head){
        if(head==null || head.next==null)
        return head;

        ListNode tail = head.next;
        head.next=swapPairs(tail.next);
        tail.next=head;

        return tail;

    }

     public static void displayTheOutput(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
     }
    public static void main(String[] args) {
        Swap_the_Nodes_InPairs Snp=new Swap_the_Nodes_InPairs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list :");
        int n = sc.nextInt();

        System.out.println("ENter the values inside :");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            Snp.insertTheValues(data);
        }

        System.out.println("Result Before the Swap the pair nodes:");
        Snp.displayTheOutput();

        head =Snp.swapPairs(head);
        System.out.println("Result afte rthe swap:");
        Snp.displayTheOutput();
    }
}