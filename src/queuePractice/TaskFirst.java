package queuePractice;

import java.util.LinkedList;
import java.util.Queue;

public class TaskFirst {
    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Овсянников");
        queue1.add("Коновалов");
        queue1.add("Бардынин");

        Queue<String> queue2 = new LinkedList<>();
        queue2.add("Набиулин");
        queue2.add("Моисеев");
        queue2.add("Вехов");

        Queue<String> resultQueue = new LinkedList<>();

        boolean addFromQueue1 = true;

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            if (addFromQueue1) {
                resultQueue.add(queue1.poll());
            }
            else {
                resultQueue.add(queue2.poll());
            }
            addFromQueue1 = !addFromQueue1;
        }

        // Если в какой-то очереди число фамилий другой четности
        if (!queue1.isEmpty()) {
            resultQueue.add(queue1.poll());
        }

        if (!queue2.isEmpty()) {
            resultQueue.add(queue2.poll());
        }

        System.out.println(resultQueue.toString());
    }
}
