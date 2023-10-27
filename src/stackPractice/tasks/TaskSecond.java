package stackPractice.tasks;

import java.util.Stack;

public class TaskSecond {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(14);
        stack.push(9);
        StackToWorkWith stackToWork = new StackToWorkWith(stack);

        System.out.println(stackToWork.toString());
        stackToWork.everyItemTwice();
        System.out.println(stackToWork.toString());
    }
}
