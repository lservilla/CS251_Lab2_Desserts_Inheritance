
/**
 * @version date (CS_251_004, 2019-02-6)
 * @author Lasair Servilla
 */

/**
 * The Cake class should be derived from the Dessert class.
 * A Cake item simply has a price.
 * The Cake constructor should take a String for
 * the name and a double for the price.
 */

public class Cake extends Dessert {

    /**price of the cake*/
    protected double price;

    /** Creating a cake without any price*/
    public Cake(String name){
        super(name);
    }

    /** Creating the cake with a price*/
    public Cake(String name, double price){
        super(name);
        this.price = price;
    }

    /** Getting the price of the cake*/
    @Override
    public double getPrice() {
        return price;
    }
}
