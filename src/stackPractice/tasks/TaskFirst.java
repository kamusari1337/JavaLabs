package stackPractice.tasks;

import java.util.Stack;

public class TaskFirst {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(14);
        stack.push(9);
        StackToWorkWith stackToWork = new StackToWorkWith(stack);
        stackToWork.insertZeroAfterMin();
        System.out.println(stackToWork.toString());
    }
}
