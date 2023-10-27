package queuePractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskSeventh {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);
        queue1.offer(2);
        queue1.offer(1);

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.offer(2);
        queue2.offer(5);

        System.out.println("Очередь 1 палиндром?: " + isPalindrome(queue1));
        System.out.println("Очередь 2 палиндром?: " + isPalindrome(queue2));
    }

    public static boolean isPalindrome(Queue<Integer> queue) {
        if (queue == null || queue.isEmpty()) {
            return true; // пустая очередь тоже считается палиндромом
        }

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        while (!queue.isEmpty()) {
            int element = queue.poll();
            tempStack.push(element);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        for (int element : stack) {
            queue.offer(element);
        }

        // сравниваем исходную очередь с обратной
        while (!queue.isEmpty()) {
            int element1 = queue.poll();
            int element2 = stack.pop();
            if (element1 != element2) {
                return false;
            }
        }
        return true;
    }
}
