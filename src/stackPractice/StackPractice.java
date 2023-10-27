package stackPractice;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Student studOne = new Student("Иван", "Иванов", 42);
        Student studTwo = new Student("Петр", "Петров", 43);
        Student studThree = new Student("Сергей", "Сергеев", 44);

        Stack<Student> studStack = new Stack<>();
        studStack.push(studOne);
        studStack.push(studTwo);
        studStack.push(studThree);

        System.out.println("Текущий стек: " + studStack);
        System.out.println("Удаляем " + studStack.pop());
        System.out.println("Кто последний? " + studStack.peek().getLastName());
        System.out.println("Удаляем " + studStack.pop());
        System.out.println("Кто последний? " + studStack.peek().getLastName());
        System.out.println("Удаляем " + studStack.pop());

        try{
            System.out.println("Кто последний? " + studStack.peek().getLastName());
        } catch (EmptyStackException e) {
            System.out.println("Пустой стек.");
        }
        System.out.println("Текущий стек: " + studStack);
    }
}
