import java.util.*;

 class Merge_In_Between_Linked_Lists {

    static class ListNode {
        ListNode next;
        int data;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        int idx = 0;

        while (idx < a - 1) {
            curr = curr.next;
            idx++;
        }

        ListNode start_list1 = curr;
        while (idx < b + 1) {
            curr = curr.next;
            idx++;
        }

        ListNode end_list1 = curr;
        ListNode list2_head = list2, list2_tail = list2;
        while (list2_tail.next != null)
            list2_tail = list2_tail.next;

        start_list1.next = list2_head;
        list2_tail.next = end_list1;

        return list1;
    }

    public static ListNode insert_list1(ListNode list1, int val) {
        ListNode newNode = new ListNode(val);
        if (list1 == null) {
            list1 = newNode;
        } else {
            ListNode current = list1;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return list1;
    }

    public static ListNode insert_list2(ListNode list2, int val) {
        ListNode newNode = new ListNode(val);
        if (list2 == null) {
            list2 = newNode;
        } else {
            ListNode current = list2;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return list2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list 1:");
        int n_1 = sc.nextInt();
        ListNode list1 = null;
        for (int i = 0; i < n_1; i++) {
            System.out.println("Enter element " + (i + 1) + " of list 1:");
            int val = sc.nextInt();
            list1 = insert_list1(list1, val);
        }

        System.out.println("Enter the size of list 2:");
        int n_2 = sc.nextInt();
        ListNode list2 = null;
        for (int i = 0; i < n_2; i++) {
            System.out.println("Enter element " + (i + 1) + " of list 2:");
            int val = sc.nextInt();
            list2 = insert_list2(list2, val);
        }

        System.out.println("Enter values of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        ListNode result = mergeInBetween(list1, a, b, list2);

        // Printing the merged list
        System.out.println("Merged List:");
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
