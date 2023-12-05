package s03_ObjectOriented.classes;

public class Store {

    String productType;
    int inventoryCount;
    double inventoryPrice;

    public Store(String productType, int inventoryCount, double inventoryPrice) {
        this.productType = productType;
        this.inventoryCount = inventoryCount;
        this.inventoryPrice = inventoryPrice;
    }

    public static void main(String[] args) {
        Store lemonadeStand = new Store("lemonade", 42, .99);
        Store cookieShop = new Store("cookies", 30, 3.75);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }


}
