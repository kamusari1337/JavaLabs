package arrayLabs.ArraysForShoppingCartProject;

import java.util.Scanner;

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        String inputYON = "y";
        Scanner scan = new Scanner(System.in);
        while (inputYON.equals("y")){
            System.out.println("Введите название продукта: ");
            String name = scan.next();
            System.out.println("Введите стоимость продукта: ");
            double price = scan.nextDouble();
            System.out.println("Введите количество продуктов: ");
            int quantity = scan.nextInt();

            cart.addToCart(name, price, quantity);

            System.out.println(cart.toString());
            System.out.println("Хотите продолжить? [y/n]: ");
            inputYON = scan.next().toLowerCase();
        }
        System.out.printf("""
                Пожалуйста, оплатите $%s""", cart.getTotalPrice());
    }
    /*Все вызовы реализуйте здесь
    * А в ShoppingCart только логику*/

}
