package arrayLabs.ArraysForSalesProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        int maxSale = 0;
        int maxSalePerson = 0;

        int minSale = 2147483647;
        int minSalePerson = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество продавцов: ");
        int salesPeople = scan.nextInt() + 1;

        System.out.print("Введите число сортировки продавцов: ");
        int scanValue = scan.nextInt();
        int sumOfSortedByScanValues = 0;
        int countSortedPersons = 0;
        ArrayList<Integer> sortedByScanValuesPersons =  new ArrayList<>();

        int[] sales = new int[salesPeople];
        int sum;
        for (int i = 1; i < sales.length; i++) {
            System.out.print("Введите объем продаж для продавца " + i + ": ");
            sales[i] = scan.nextInt();
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSalePerson = i;
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
                minSalePerson = i;
            }
            if (sales[i] > scanValue) {
                sumOfSortedByScanValues += sales[i];
                sortedByScanValuesPersons.add(i);
                countSortedPersons ++;
            }
        }
        System.out.println("\nПродажи продавца");
        System.out.println("--------------------");
        sum = 0;
        for (int i = 1; i < sales.length; i++) {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nОбщие продажи: " + sum);

        // Средний объем продаж
        System.out.printf("""
                Средний объем продаж: %s
                """, sum/salesPeople);

        // Максимальная продажа
        System.out.printf("""
                Продавец %s совершил самую максимальную продажу на %s рублей
                """, maxSalePerson, maxSale);

        // Минимальная продажа
        System.out.printf("""
                Продавец %s совершил самую минимальную продажу на %s рублей
                """, minSalePerson, minSale);

        // Сортировка по введенному числу
        System.out.printf("""
                ID всех продавцов, превысивших %s рублей: %s
                И их общая сумма: %s
                Количество продавцов: %s
                """, scanValue, sortedByScanValuesPersons.toString(),
                sumOfSortedByScanValues, countSortedPersons);
    }
}
