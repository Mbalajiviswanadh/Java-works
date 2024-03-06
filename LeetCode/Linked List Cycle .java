import java.util.*;

class LinkedList_Cycle {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert data into a linked list
    public static ListNode insert(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Function to determine if there's a cycle in the linked list
    public static boolean isitCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    // Function to get the node at a specific position in the linked list
    private static ListNode getNodeAtPosition(ListNode head, int pos) {
        ListNode current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int n = sc.nextInt();

        System.out.println("Enter the values:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Give the position to create the cycle (0-indexed):");
        int pos = sc.nextInt();

        // Create the linked list
        ListNode head = insert(nums);

        // Establish the cycle at the specified position
        ListNode cycleNode = head;
        for (int i = 0; i < n; i++) {
            if (i == pos) {
                cycleNode = getNodeAtPosition(head, pos);
                break;
            }
            head = head.next;
        }
        ListNode tail = getNodeAtPosition(head, n - 1);
        if (tail != null) {
            tail.next = cycleNode;
        }

        // Check if there's a cycle in the linked list
        boolean hasCycle = isitCycle(head);

        System.out.println("Result: " + hasCycle);
    }
}
