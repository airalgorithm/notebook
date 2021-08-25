package class02;

public class Code04_RingArray {
    public static class MyQueue {
        private int[] arr;
        private int pushi;
        private int polli;
        private int size;
        private final int limit;

        public MyQueue(int limit) {
            arr = new int[limit];
            pushi = 0;
            polli = 0;
            size = 0;
            this.limit = limit;
        }

        public void push(int value) {
            if (size == limit) {
                throw new RuntimeException("栈满了，不能再添加了! ");
            }
            size++;
            arr[pushi] = value;
            pushi = nextIndex(pushi);
        }

        private int nextIndex(int i) {
            return i < limit - 1 ? i + 1 : 0;
        }

        public int pop() {
            if (size == 0) {
                throw new RuntimeException("栈空了，不能再拿了! ");
            }
            size--;
            int value = arr[polli];
            polli = nextIndex(polli);
            return value;
        }
    }
}
