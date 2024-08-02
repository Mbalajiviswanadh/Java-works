import java.util.*;
class Solution {
    static class Node{
        Node next;
        Node random;
        int val;

        Node(int val){
            this.next=null;
            this.val=val;
            this.random=null;
        }
    }
    // Insert copy nodes right after each original node.
    public void insertmiddle(Node head) {
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next; // Move to the next original node.
        }
    }

    // Set up the random pointers for the copied nodes.
    public void connectRandom(Node head) {
        Node curr = head;

        while (curr != null) {
            Node copynode = curr.next;
            
            if (curr.random != null)
                copynode.random = curr.random.next; // Link the copied node's random.

            curr = copynode.next; // Move to the next original node.
        }
    }

    // Extract the copied list, restoring the original list.
    public Node getcopiedlist(Node head) {
        Node res = new Node(0); // Dummy node for the result list.
        Node curr = res;
        Node temp = head;

        while (temp != null) {
            curr.next = temp.next; // Link to the copied node.
            curr = curr.next;
            
            temp.next = curr.next; // Restore the original list's 'next'.
            temp = temp.next; // Move to the next original node.
        }
        return res.next; // Return the head of the copied list.
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        insertmiddle(head); // Step 1: Insert copy nodes.
        connectRandom(head); // Step 2: Set up random pointers.
        return getcopiedlist(head); // Step 3: Extract the copied list.
    }
}