package queuePractice;

import java.util.LinkedList;
import java.util.Queue;

public class TaskSecond {
    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Овсянников");
        queue1.add("Коновалов");
        queue1.add("Бардынин");
        queue1.add("Дерден");

        Queue<String> queue2 = new LinkedList<>();
        queue2.add("Набиулин");
        queue2.add("Моисеев");
        queue2.add("Вехов");
        queue2.add("Овсянников");

        System.out.println("До");
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());

        queue2.removeAll(queue1);
        System.out.println("После");
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());
    }
}
