/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbers {
    static class ListNode{

        ListNode next;
        int val;

        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);

        ListNode curr=res;

        int carry=0;

        while(l1!=null || l2!=null){

            int sum = 0+carry;

            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            carry = sum/10;
            sum = sum%10;

            curr.next = new ListNode(sum);
            curr=curr.next;
        }
        if(carry==1)
        curr.next = new ListNode(1);

        return res.next;

        // StringBuilder s1= new StringBuilder();
        // StringBuilder s2= new StringBuilder();

        // while(l1!=null && l2!= null){
        //     s1.append(l1.val);
        //     s2.append(l2.val);

        //     l1=l1.next;
        //     l2=l2.next;
        // }
        // int num=Integer.parseInt(s1.reverse().toString()) + Integer.parseInt(s2.reverse().toString());
        
        // // String sum = Integer.toString(num);
        // String finalSum = new StringBuilder(Integer.toString(num)).reverse().toString();


        // ListNode res = new ListNode(-1);

        // ListNode curr=res;

        // for(char ch :finalSum.toCharArray()){
        //     curr.next = new ListNode(Character.getNumericValue(ch));
        //     curr=curr.next;
        // }

        // return res.next;

    }
}