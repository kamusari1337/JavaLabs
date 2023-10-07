package arrayLabs.ShopPracticeExercise;

import java.util.ArrayList;

class Shop {
    private final ArrayList<Item> itemList;

    public Shop() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(int id) {
        boolean removed = false;
        for (Item item : itemList) {
            if (item.getId() == id) {
                itemList.remove(item);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Продукт с ID " + id + " не найдет.");
        }
    }

    public void displayAllItems() {
        for (Item item : itemList) {
            System.out.println("ID продукта: " + item.getId());
            System.out.println("Название: " + item.getName());
            System.out.println("Стоимость: " + item.getPrice());
            System.out.println("Дата прибытия: " + item.getArrivingDate());
            System.out.println("Количество: " + item.getCount());
            System.out.println("--------");
        }
    }

    public double calculateTotalCost(String itemName) {
        double totalCost = 0.0;
        for (Item item : itemList) {
            if (item.getName().equals(itemName)) {
                totalCost += item.getPrice() * item.getCount() * 1.13;
            }
        }
        return totalCost;
    }

    public void displayItemsByArrivingDate(String date) {
        boolean found = false;
        for (Item item : itemList) {
            if (item.getArrivingDate().equals(date)) {
                System.out.println("ID продукта: " + item.getId());
                System.out.println("Название: " + item.getName());
                System.out.println("Стоимость: " + item.getPrice());
                System.out.println("Количество: " + item.getCount());
                System.out.println("--------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет продуктов, прибывших в данную дату.");
        }
    }
}

