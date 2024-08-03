

class SegregateEvenandOdd {
    static class Node {
        int data;
        Node next;
    
        Node(int x) {
            data = x;
            next = null;
        }
    }
    Node divide(Node head) {
        // code here
        
        // Node res = new Node(0);
        // Node temp=res;
        // Node prev=null;
        
        // Node curr=head;
        
        // while(curr!=null){
        //     int i=curr.data;
            
        //     if(i%2==0){
        //         temp.next=curr;
        //         temp=temp.next;
        //         if(curr.next!=null)
        //         prev.next=curr.next;
        //         // if(curr.next==null)
        //         // prev.next=null;
        //         // else
        //         // prev.next=curr.next;
        //     }
        //     else
        //     prev=curr;
            
            
        //     curr=curr.next;
        // }
        
        // temp.next=head;
        
        // return res.next;
        
        
        Node even=new Node(0);
        Node ev=even;
        Node odd= new Node(0);
        Node od=odd;
        
        Node curr=head;
        
        while(curr!=null){
            int i=curr.data;
            if(i%2==0){
                ev.next=curr;
                ev=ev.next;
            }
            else if(i%2!=0){
                od.next=curr;
                od=od.next;
            }
            
            curr=curr.next;
        }
        
        od.next=null;
        ev.next=odd.next;
        
        return even.next;
        
        
    }
}



// //{ Driver Code Starts
// // Initial Template for Java

// import java.io.*;
// import java.util.*;

// class FastReader {
//     BufferedReader br;
//     StringTokenizer st;

//     public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }

//     String next() {
//         while (st == null || !st.hasMoreElements()) {
//             try {
//                 st = new StringTokenizer(br.readLine());
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//         return st.nextToken();
//     }

//     String nextLine() {
//         String str = "";
//         try {
//             str = br.readLine();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//         return str;
//     }

//     Integer nextInt() { return Integer.parseInt(next()); }
// }

// class Node {
//     int data;
//     Node next;

//     Node(int x) {
//         data = x;
//         next = null;
//     }
// }

// class GFG {
//     static void printList(Node node) {
//         while (node != null) {
//             System.out.print(node.data + " ");
//             node = node.next;
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) throws IOException {
//         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(read.readLine());
//         while (t > 0) {

//             String str[] = read.readLine().trim().split(" ");
//             int n = str.length;
//             Node head = new Node(Integer.parseInt(str[0]));
//             Node tail = head;
//             for (int i = 1; i < n; i++) {
//                 tail.next = new Node(Integer.parseInt(str[i]));
//                 tail = tail.next;
//             }
//             Solution ob = new Solution();
//             Node ans = ob.divide(head);
//             printList(ans);
//             t--;
//         }
//     }
// }
// // } Driver Code Ends


// // User function Template for Java

// /*
// class Node{
//     int data;
//     Node next;

//     Node(int x){
//         data = x;
//         next = null;
//     }
// }
// */