package UNI_STS.Linked_List;

import java.util.Scanner;
class Main {
    Node head;
    static class Node {
        int data;
        Node next;
        public Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Main insert(Main list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(Main list) {
        Node currNode = list.head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static Main segregateNodes(Main list) {
        if (list.head == null || list.head.next == null) {
            return list;
        }
        Main oddList = new Main();
        Main evenList = new Main();
        Node curr = list.head;
        Node oddTail = null;
        Node evenTail = null;
        boolean isOdd = true;
        while (curr != null) {
            if (isOdd) {
                oddTail = insertNode(oddList, curr.data, oddTail);
            } else {
                evenTail = insertNode(evenList, curr.data, evenTail);
            }
            isOdd = !isOdd;
            curr = curr.next;
        }
        if (oddTail != null) {
            oddTail.next = evenList.head;
        } else {
            return evenList;
        }
        return oddList;
    }
    public static Node insertNode(Main list, int data, Node tail) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
        return tail;
    }
    public static void main(String[] args) {
        Main ll = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String arr[] = str.split(" ");

        for (int i = 0; i < n; i++) {
            insert(ll, Integer.parseInt(arr[i]));
        }
        Main result = segregateNodes(ll);
        printList(result);
    }
}
