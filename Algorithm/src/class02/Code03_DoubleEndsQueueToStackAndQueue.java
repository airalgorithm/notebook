package class02;

import java.util.zip.ZipEntry;

public class Code03_DoubleEndsQueueToStackAndQueue {
    public static class Node<T> {
        public T value;
        public Node<T> last;
        public Node<T> next;

        public Node(T data) {
            value = data;
        }
    }

    public static class DoubleEndsQueue<T> {
        public Node<T> head;
        public Node<T> tail;

        public void addFromHead(T value) {
            Node <T> node = new Node<T>(value);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head.last = node;
                head = node;
            }
        }

        public void addFromTail(T value) {
            Node<T> node = new Node<T>(value);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.last = tail;
                tail = node;
            }
        }

        public T popFromHead() {
            if (head == null) {
                return null;
            }
            Node<T> node = head;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.next = null;
                head.last = null;
            }
            return node.value;
        }

        public T popFromTail() {
            if (head == null) {
                return null;
            }
            Node<T> node = head;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.last;
                tail.next = null;
                node.last = null;
            }
            return node.value;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    public static class MyStack<T> {
        private DoubleEndsQueue<T> queue;

        public MyStack() {
            queue = new DoubleEndsQueue<T>();
        }

        public void push(T value) {
            queue.addFromHead(value);
        }

        public T pop() {
            return queue.popFromHead();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }

    public static class MyQueue<T> {
        private DoubleEndsQueue<T> queue;

        public MyQueue() {
            queue = new DoubleEndsQueue<T>();
        }

        public void push(T value) {
            queue.addFromTail(value);
        }

        public T pop(T value) {
            return queue.popFromHead();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }
}
