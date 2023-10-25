package queuePractice;

import java.util.LinkedList;
import java.util.Queue;

public class TaskFourth {
    public static void main(String[] args) {
        Queue<TaskFourthStudent> queue = new LinkedList<>();
        queue.add(new TaskFourthStudent("Овсянников", 21, 2005));
        queue.add(new TaskFourthStudent("Коновалов", 21, 2005));
        queue.add(new TaskFourthStudent("Бардынин", 21, 2004));
        queue.add(new TaskFourthStudent("Набиулин", 21, 2004));
        queue.add(new TaskFourthStudent("Моисеев", 21, 2005));
        queue.add(new TaskFourthStudent("Вехов", 21, 2005));

        int targetYear = 2005;

        Queue<TaskFourthStudent> resultQueue = new LinkedList<>();

        for (TaskFourthStudent element : queue) {
            if (element.getBdYear() == targetYear) {
                resultQueue.add(element);
            }
        }

        System.out.println(resultQueue.toString());


    }
}
