import java.util.*;
public class Seggration {

    static Node head;
    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }



    public static void segregate_Even_Odd(){

        Node even_Start=null;
        Node even_End=null;
        Node odd_Start=null;
        Node odd_End=null;

        Node curr=head;

        while(curr!=null){
            int value=curr.data;

            if(value %2 ==0){

                if(even_Start==null){
                    even_Start=curr;
                    even_End=even_Start;
                }
                else{
                    even_End.next=curr;
                    even_End=even_End.next;
                }
            }
            else{
                if(odd_Start==null){
                    odd_Start=curr;
                    odd_End=odd_Start;
                }
                else{
                    odd_End.next=curr;
                    odd_End=odd_End.next;
                }
            }

            curr=curr.next;
        }

        if(even_Start==null || odd_Start==null)
        return;

        even_End.next=odd_Start;
        odd_End.next=null;
        head=even_Start;
    }


    public static void push(int data){
        Node newNode=new Node(data);
        // if(head==null){
        //     head=newNode;
        // }

        // Node curr=head;
        // while(curr.next != null){
        //     curr=curr.next;
        // }
        // curr.next=newNode;
        newNode.next=head;
        head=newNode;
    }

    public static void display(){
        if(head==null){
            System.out.println("Empty");
        }

        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Seggration sg=new Seggration();
    System.out.println("Enter size :");
    int n=sc.nextInt();
    for(int i =0;i<n;i++){
        int data=sc.nextInt();
        sg.push(data); 
    }
    System.out.println("Orginal LL");
    sg.display();

    sg.segregate_Even_Odd();
    System.out.println("Modified LL");
    sg.display();
}    
}
