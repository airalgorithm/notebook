package class02;

public class Code02_DeleteGivenValue {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static Node removeValue(Node head, int num) {
        while (head != null) {
            if (head.value != num) {
                break;
            }
            head = head.next;
        }
        Node prev = head;
        Node curr = head;
        while (curr != null) {
            if (curr.value == num) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
