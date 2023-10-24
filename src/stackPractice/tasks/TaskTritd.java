package stackPractice.tasks;

import java.util.Stack;

public class TaskTritd {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(7);
        stack1.push(2);
        stack1.push(8);
        stack1.push(9);
        stack1.push(4);
        stack1.push(13);
        stack1.push(7);
        stack1.push(1);
        stack1.push(9);
        stack1.push(10);
        StackToWorkWith stackToWorkWith1 = new StackToWorkWith(stack1);
        System.out.println(stackToWorkWith1.toString());
        stackToWorkWith1.sumEveryPair();
        System.out.println(stackToWorkWith1.toString());

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        StackToWorkWith stackToWorkWith2 = new StackToWorkWith(stack2);
        System.out.println(stackToWorkWith2.toString());
        stackToWorkWith2.sumEveryPair();
        System.out.println(stackToWorkWith2.toString());
    }
}
