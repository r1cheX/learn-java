package s03_ObjectOriented.classes;

public class Store {

    String productType;
    int inventoryCount;
    double inventoryPrice;

    boolean isClosed;

    //    Esto es la sobrecarga de constructores donde se puede tener varios constructores con diferentes parametros
    //    donde cada una de ellas se identifica con una firma:
    //      1. public Store(String productType, int inventoryCount, double inventoryPrice)
    //    2. public Store(String productType, int inventoryCount, double inventoryPrice, boolean isClosed)

    public Store(String productType, int inventoryCount, double inventoryPrice) {
        this.productType = productType;
        this.inventoryCount = inventoryCount;
        this.inventoryPrice = inventoryPrice;
        System.out.println("I am inside the constructor method.");
    }

//    Este contiene parametros formales
    public Store(String productType, int inventoryCount, double inventoryPrice, boolean isClosed) {
        this.productType = productType;
        this.inventoryCount = inventoryCount;
        this.inventoryPrice = inventoryPrice;
        this.isClosed = isClosed;
        System.out.println("I am inside the constructor method.");
    }

    public static void main(String[] args) {
//      Es declarado lemonadeStand como un Tipo de dato de referencia
        Store lemonadeStand = new Store("lemonade", 42, .99);

        System.out.println("Espacio de memoria asignado a " + lemonadeStand);

//        Esto contiene parametros actuales o reales
        Store cookieShop = new Store("cookies", 30, 3.75);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }


}




