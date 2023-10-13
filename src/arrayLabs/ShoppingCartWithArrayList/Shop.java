package arrayLabs.ShoppingCartWithArrayList;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do {
            System.out.print("Введите название товара: ");
            itemName = scan.nextLine();
            System.out.print("Введите цену за единицу: ");
            itemPrice = scan.nextDouble();
            System.out.print("Введите количество: ");
            quantity = scan.nextInt();
            Item newItem = new Item(itemName, itemPrice, quantity);
            cart.add(newItem);

            System.out.print("Продолжать покупки (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));

        double totalPrice = 0;
        for (Item i: cart) {
            totalPrice += i.getPrice() * i.getQuantity();
        }
        System.out.printf("Общая стоимость: %s", totalPrice);
    }
}
