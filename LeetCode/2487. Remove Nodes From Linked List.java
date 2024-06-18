import java.util.*;
class Remove_NodesFromLinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }


    public ListNode removeNodes(ListNode head) {

        ListNode curr= head;
        Stack<ListNode> s = new Stack<>();

        while(curr!=null){
            while(!s.isEmpty() && s.peek().val<curr.val){

            s.pop();
            }
            s.push(curr);
            curr=curr.next;
        }

        ListNode next=null;
        while(!s.isEmpty()){
            curr=s.pop();
            curr.next=next;
            next=curr;
        }
        return curr;
        
        // ArrayList<Integer> list= new ArrayList<>();

        // ListNode curr=head;

        // while(curr!=null){
        //     list.add(curr.val);
        //     curr=curr.next;
        // }
        // ArrayList<Integer> nlist= new ArrayList<>();
        // int maxval=Integer.MIN_VALUE;

        // for(int i=list.size()-1;i>=0;i--){
        //     if(list.get(i)>=maxval){
        //         nlist.add(0,list.get(i));
        //         maxval=list.get(i);
        //     }
        // }
        // ListNode dummy = new ListNode(0);
        // ListNode current=dummy;
        // for(int nval : nlist){
        //     current.next=new ListNode(nval);
        //     current= current.next;
        // }
        // return dummy.next;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
