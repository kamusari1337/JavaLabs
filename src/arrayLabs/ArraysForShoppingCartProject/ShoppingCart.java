package arrayLabs.ArraysForShoppingCartProject;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ShoppingCart {
    private int itemCount; // общее количество товаров в корзине
    private double totalPrice; // общая стоимость товаров в корзине
    private int capacity; // текущая вместимость тележки
    private ArrayList<Item> cart;

    // Создает пустую корзину для покупок, вмещающую 5 товаров.
    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new ArrayList<>(capacity);
    }

    // добавляет товар в корзину.
    public void addToCart(String itemName, double price, int quantity) {
    }

    //Возвращает содержимое корзины вместе с итоговой информацией.
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nКорзина\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
//        for (int i = 0; i < itemCount; i++){
//            contents += //здесь какой-то код
//        }
        contents += "\nОбщая цена: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }

    /// Увеличивает вместимость корзины на 3 позиции или
    /// на значение введённое с клавиатуры
    private void increaseSize() {
        capacity += 3;
        cart.ensureCapacity(capacity);
    }
}
