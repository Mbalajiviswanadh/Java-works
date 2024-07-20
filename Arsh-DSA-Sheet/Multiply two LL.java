import java.util.*;

class Multiplytwo_LL {
    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static long solve(Node l1, Node l2){

        long mod=(long)( Math.pow(10, 8)+7);

        long n1=0,n2=0;

        while(l1!=null){
            n1=(n1*10)%mod+l1.data;
            l1=l1.next;
        }

        while(l2 != null){
            n2=(n2*10)%mod + l2.data;
            l2=l2.next;
        }

        return (n1*n2)%mod;
    }
}
