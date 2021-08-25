package class02;

public class Code01_ReverseList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            value = data;
        }
    }

    public static class DoubleNode {
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int data) {
            value = data;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static DoubleNode reverseDoubleList(DoubleNode head) {
        DoubleNode prev = null;
        DoubleNode next = null;
        while (head.next != null) {
            next = head.next;
            head.next = prev;
            head.last = next;
            prev = head;
            head = next;
        }
        return head;
    }
}
