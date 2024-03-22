import java.util.*;

class Palindrome_linked_list{
    static ListNode head;
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void insertValues(int data){
        ListNode newListNode = new ListNode(data);
        if(head==null ){
            head=newListNode;
            return;
        }

        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newListNode;
    }

    
    public static boolean finding_palindrome(ListNode head){
        List<Integer> ls= new ArrayList<>();

        ListNode curr=head;
        while (curr!=null) {
            ls.add(curr.data);
            curr=curr.next;
        }

        int left =0;
        int right =ls.size()-1;
        while(left<right){
            if(ls.get(left)==ls.get(right))
            return true;

            left++;
            right--;
        }
        return false;   
    
    }

    public static void display(){
        if(head ==null){
            System.out.println("The List is Empty");
            return;
        }

        ListNode temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size ");
        int n =sc.nextInt();

        Palindrome_linked_list pll=new Palindrome_linked_list();
        System.out.println("ENter the values inside :");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            pll.insertValues(data);
        }
        System.out.println("Taken Values :");
        pll.display();

        System.out.println("Result : ");

        if(finding_palindrome(head)==true){
            System.out.println(finding_palindrome(head)+" : Palindrome exist");
        }
        else{
            System.out.println(finding_palindrome(head)+" : No palidndrome exist");
        }
    }
}