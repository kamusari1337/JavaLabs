package queuePractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskFifth {
    public static void main(String[] args) {
        Deque<TaskFifthTriple> deque = new ArrayDeque<>();
        deque.add(new TaskFifthTriple(1.2, 2.3, 3.4));
        deque.add(new TaskFifthTriple(4.5, 5.6, 6.7));
        deque.add(new TaskFifthTriple(7.8, 8.9, 9.0));
        deque.add(new TaskFifthTriple(1.1, 2.2, 3.3));

        double maxAllowedValue = 4.9;

        System.out.printf("До фильтра: %s\n", deque.toString());
        filterDeque(deque, maxAllowedValue);
        System.out.printf("После фильтра: %s\n", deque.toString());

        System.out.printf("""
                Длина дека: %s"
                Первый элемент: %s
                Последний элемент: %s""",
                deque.size(), deque.getFirst(), deque.getLast());
    }

    public static void filterDeque(Deque<TaskFifthTriple> deque, double maxAllowedValue) {
        deque.removeIf(triple -> triple.allValuesLessThanOrEqualTo(maxAllowedValue));
    }
}
