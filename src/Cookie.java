
/**
 * @version date (CS_251_004, 2019-02-6)
 * @author Lasair Servilla
 */

/**
 * The Cookie class should be derived from the Dessert class.
 * A Cookie item has a number and a price per dozen which are
 * used to determine its price. For example, 4 cookies @$3.99 per dozen = $1.33.
 * The Cookie constructor should take a String for the name,
 * an int for the number of cookies, and a double for the price per dozen.
 * In addition to the methods inherited from Dessert,
 * this class should provide methods to get the number of cookies
 * and price per dozen.
 */


public class Cookie extends Dessert{

    /** Number of cookies being bought*/
    private int itemCount;

    /** The price per dozen of cookies*/
    private double pricePerDozen;

    /** Creating the cookie type and price, along with amount*/
    public Cookie(String name,int itemCount, double pricePerDozen){
        super(name);
        this.itemCount = itemCount;
        this.pricePerDozen = pricePerDozen;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getPricePerDozen() {
        return pricePerDozen;
    }

    /**
     * Getting the price for the total number of cookies bought of the
     * particular type that was bought.
     */
    public double getPrice(){

        double singlePrice = pricePerDozen/12;

        return singlePrice*(double)itemCount;

    }

}
