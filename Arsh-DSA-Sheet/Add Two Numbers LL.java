import java.util.*;
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
class Solution {
    
    static class ListNode{
        ListNode next;
        int val;

        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
        
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    
    // Push all values from l1 into stack1
    while (l1 != null) {
        stack1.push(l1.val);
        l1 = l1.next;
    }
    
    // Push all values from l2 into stack2
    while (l2 != null) {
        stack2.push(l2.val);
        l2 = l2.next;
    }
    
    ListNode result = null;
    int carry = 0;
    
    // Process both stacks
    while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
        int sum = carry;
        
        if (!stack1.isEmpty()) {
            sum += stack1.pop();
        }
        
        if (!stack2.isEmpty()) {
            sum += stack2.pop();
        }
        
        // Compute new carry and the digit to store in the node
        carry = sum / 10;
        int digit = sum % 10;
        
        // Create new node and adjust the result list
        ListNode newNode = new ListNode(digit);
        newNode.next = result;
        result = newNode;
    }
    
    return result;


    
    // String str1 = "";
    // ListNode curr1=l1;

    // while(curr1!=null){
    //     str1+=curr1.val;
    //     curr1=curr1.next;
    // }
    // String str2="";
    // ListNode curr2=l2;
    // while(curr2!=null){
    //     str2+=curr2.val;
    //     curr2=curr2.next;
    // }

    // long sum= Integer.parseInt(str1) + Integer.parseInt(str2);

    // String newstr= Long.toString(sum);

    // List<Integer> list = new ArrayList<>();
    // for(char ch : newstr.toCharArray()){

    //     list.add(ch-'0');
    // }

    // ListNode res = new ListNode(0);
    // ListNode curr=res;

    // for(int i : list){
    //     ListNode newNode= new ListNode(i);
    //     curr.next=newNode;
    //     curr=curr.next;
    // }

    // return res.next;


}
}