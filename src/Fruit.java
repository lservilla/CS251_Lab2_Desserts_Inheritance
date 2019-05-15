
/**
 * @version date (CS_251_004, 2019-02-6)
 * @author Lasair Servilla
 */

/**
 * The Fruit class should be derived from the Dessert class.
 * A Fruit item has a weight in
 * pounds and a price per pound which are used to determine its price.
 * For example, 2.30 pounds of strawberries $0.89 per pound = $2.05.
 * The Fruit constructor should take a String for the name
 * and doubles for weight in pounds and price per pound.
 * In addition to the methods inherited from Dessert,
 * this class should provide methods to
 * get the weight in pounds and price per pound.
 */

public class Fruit extends Dessert {

    /** Weight of the fruit being bought*/
    private double weightInPounds;

    /** The price of the fruit per pound*/
    private double pricePerPound;

    /** Creating the fruit, it's weight, and price*/
    public Fruit(String name, double weightInPounds, double pricePerPound){
        super(name);
        this.pricePerPound = pricePerPound;
        this.weightInPounds = weightInPounds;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    /** Getting the price for the fruit being bought*/
    public double getPrice(){
        return pricePerPound*weightInPounds;
    }

}
