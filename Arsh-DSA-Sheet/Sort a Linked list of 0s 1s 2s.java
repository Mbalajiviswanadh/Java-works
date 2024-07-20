//  from GFG

import java.util.*;
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Driverclass {
    public static void printList(Node head, PrintWriter out) {
        if (head == null) return;

        Node temp = head;
        while (temp != null) {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        // Node dummy = new Node(0);
        
        // dummy.next=null;
        
        // Node prev=dummy;
        
        // Node curr=head;
        
        // while(curr!=null){
            
        //     if(curr.data==0)
        //         prev.data=0;
        //     if(curr.data==1)
        //         prev.next.data=1;
        //     if(curr.data==2)
        //         prev.next.next.data=2;
        // }
        // return prev;
        
        int zero=0;
        int one=0;
        int two=0;
        
        Node curr=head;
        while(curr != null){
            if(curr.data==0)
            zero++;
            else if(curr.data==1)
            one++;
            else if(curr.data==2)
            two++;
            
            curr=curr.next;
        }
        
        Node newNode= head;
        for(int i=0;i<zero;i++){
            newNode.data=0;
            newNode=newNode.next;
        }
                for(int i=0;i<one;i++){
            newNode.data=1;
            newNode=newNode.next;
        }
                for(int i=0;i<two;i++){
            newNode.data=2;
            newNode=newNode.next;
        }
        
        return head;
        
    }
}

