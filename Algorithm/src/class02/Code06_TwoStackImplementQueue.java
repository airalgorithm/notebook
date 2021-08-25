package class02;

import java.util.Stack;

public class Code06_TwoStackImplementQueue {
    public static class TwoStackQueue {
        public Stack<Integer> stackPush;
        public Stack<Integer> stackPop;

        public TwoStackQueue() {
            stackPush = new Stack<Integer>();
            stackPop = new Stack<Integer>();
        }

        private void pushToPop() {
            if (stackPop.isEmpty()) {
                while (!stackPush.isEmpty()) {
                    stackPop.push(stackPush.pop());
                }
            }
        }

        public void add(int value) {
            stackPush.push(value);
            pushToPop();
        }

        public int poll() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty!");
            }
            pushToPop();
            return stackPop.pop();
        }

        public int peek() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty!");
            }
            pushToPop();
            return stackPop.peek();
        }

        public boolean isEmpty() {
            return stackPop.isEmpty() && stackPush.isEmpty();
        }

    }
}
