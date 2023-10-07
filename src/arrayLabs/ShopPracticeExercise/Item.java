package arrayLabs.ShopPracticeExercise;

public class Item {
    private String name;
    private double price;
    private String arrivingDate;
    private int count;
    private int id;

    public Item(String name, double price, String arrivingDate, int count, int id) {
        this.name = name;
        this.price = price;
        this.arrivingDate = arrivingDate;
        this.count = count;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getArrivingDate() {
        return arrivingDate;
    }

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }
}