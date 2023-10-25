package queuePractice;

import java.util.LinkedList;
import java.util.Queue;

public class TaskThird {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Banana");
        queue.add("Apple");
        queue.add("Orange");
        queue.add("Kiwi");
        queue.add("Pineapple");
        queue.add("Apricot");

        System.out.printf("До фильтра: %s\n", queue.toString());
        filterQueue(queue);
        System.out.printf("После фильтра: %s\n", queue.toString());

        System.out.printf("""
                Длина очереди: %s
                Первый элемент: %s
                Последнй элемент: %s""",
                queue.size(), queue.peek(), getLastElement(queue));
    }

    public static void filterQueue(Queue<String> queue) {
        Queue<String> tempQueue = new LinkedList<>();
        for (String element : queue) {
            if (!element.startsWith("A")) {
                tempQueue.add(element);
            }
        }
        queue.clear();
        queue.addAll(tempQueue);
    }

    public static String getLastElement(Queue<String> queue) {
        String lastElement = "";
        for (String element : queue) {
            lastElement = element;
        }
        return lastElement;
    }
}
