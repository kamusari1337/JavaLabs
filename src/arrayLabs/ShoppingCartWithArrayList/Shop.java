package arrayLabs.ShoppingCartWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        //Тут создайте вашу корзину cart
        //...
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
            // тут создайте новый товар и добавьте его в корзину
            // распечатайте содержимое объекта корзины с помощью println
            //...
            //System.out.println(cart.toString());
            System.out.print("Продолжать покупки (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
