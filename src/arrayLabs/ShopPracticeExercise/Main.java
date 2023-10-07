package arrayLabs.ShopPracticeExercise;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // Добавляем простые продукты для примера
        shop.addItem(new Item("Молоко", 2.0, "2023-10-01", 100, 1));
        shop.addItem(new Item("Хлеб", 1.5, "2023-10-01", 150, 2));
        shop.addItem(new Item("Яйца", 1.0, "2023-10-02", 200, 3));
        shop.addItem(new Item("Молоко", 2.0, "2023-10-02", 50, 4));

        // Вывести все продукты
        System.out.println("Все продукты магазина:");
        shop.displayAllItems();
        System.out.println();

        // Подсчет общей стоимости определенного продукта
        String itemName = "Молоко";
        double totalCost = shop.calculateTotalCost(itemName);
        System.out.println("Общая стоимость " + itemName + ": руб." + totalCost);
        System.out.println();

        // Показ всех продуктов в определенную дату
        String date = "2023-10-02";
        System.out.println("Продукты прибывшие " + date + ":");
        shop.displayItemsByArrivingDate(date);
        System.out.println();

        // Удаление продукта по ID
        int itemIdToRemove = 2;
        System.out.println("Удаление продукта с ID " + itemIdToRemove + "...");
        shop.removeItem(itemIdToRemove);

        // Показ всех продуктов после удаления
        System.out.println("\nОбновленный список продуктов в магазине:");
        shop.displayAllItems();
    }
}
