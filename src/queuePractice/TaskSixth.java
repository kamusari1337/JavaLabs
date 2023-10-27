package queuePractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskSixth {
    public static void main(String[] args) {
        // Очень странная формулировка задания,
        // я ее не совсем понял, косо-криво, костыльно,
        // но сделал
        Stack<Double> stack1 = new Stack<>();
        stack1.push(1.0);
        stack1.push(2.0);
        stack1.push(3.0);

        Stack<Double> stack2 = new Stack<>();
        stack2.push(4.0);
        stack2.push(5.0);

        Queue<Double> queue = new LinkedList<>();

        while (!stack1.isEmpty()) {
            queue.add(stack1.pop());
        }

         while(!stack2.isEmpty()) {
            queue.add(stack2.pop());
        }

        System.out.println(queue.toString());
    }
}
