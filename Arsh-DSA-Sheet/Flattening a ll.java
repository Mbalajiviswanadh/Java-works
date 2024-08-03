import java.util.*;

class Flatteninga_ll {
    
    static class Node{
        Node next;
        int data;
        Node bottom;
        Node(int data){
            this.next=null;
            this.data=data;
            this.bottom=bottom;
        }
    }

    public static Node solve(Node root){
        Node curr=root;
        List<Integer> list = new ArrayList<>();

        while(curr!=null){
            list.add(curr.data);

            Node d=curr.bottom;
            while(d!=null){
                list.add(d.data);
                d=d.bottom;
            }

            curr=curr.next;
        }

        Collections.sort(list);
        Node res = new Node(0);
        Node temp= res;

        for(int i: list){
            Node newNode = new Node(i);
            temp.bottom=newNode;
            temp=temp.bottom;
        }

        return res.bottom;
    }
}
