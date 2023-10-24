package stackPractice.tasks;

import java.util.Stack;

public class StackToWorkWith {
    private static Stack<Integer> stack;

    public StackToWorkWith(Stack<Integer> st) {
        stack = st;
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public void insertZeroAfterMin() {
        Stack<Integer> tempStack = new Stack<>();
        int min = Integer.MAX_VALUE;
        int stack_size = stack.size();

        for (int i = 0; i < stack_size; i++) {
            int temp = stack.pop();
            min = Math.min(temp, min);
            tempStack.push(temp);
        }

        for (int i = 0; i < stack_size; i++) {
            int temp = tempStack.pop();
            stack.push(temp);
            if (temp == min) {
                stack.push(0);
            }
        }
    }

    public void everyItemTwice() {
        Stack<Integer> tempStack = new Stack<>();
        int stack_size = stack.size();
        for (int i = 0; i < stack_size; i++) {
            tempStack.push(stack.pop());
        }
        for (int i = 0; i < stack_size; i++) {
            int temp = tempStack.pop();
            stack.push(temp);
            stack.push(temp);
        }
    }
    public void sumEveryPair() {
        Stack<Integer> tempStack = new Stack<>();
        if (stack.size() % 2 != 0) {
            stack.push(0);
        }
        int stack_size = stack.size()/2;
        for (int i = 0; i < stack_size; i++) {
            tempStack.push(stack.pop() + stack.pop());
        }
        stack_size = tempStack.size();
        for (int i = 0; i < stack_size; i++) {
            stack.push(tempStack.pop());
        }
    }
}
