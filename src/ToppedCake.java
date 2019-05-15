
/**
 * @version date (CS_251_004, 2019-02-6)
 * @author Lasair Servilla
 */

/**
 * The ToppedCake class should be derived from the Cake class.
 * A ToppedCake item is constructed with a Cake item and a topping,
 * which can be any Dessert item. The price of a
 * ToppedCake is the price of the Cake plus the price of the topping.
 * The ToppedCake constructor should take a Cake object
 * for the base cake and a Dessert object for the topping.
 * The name of a ToppedCake is the name of the Cake concatenated
 * with the String “ topped with ” and the name of the topping.
 * Note that since ToppedCake extends Cake,
 * a ToppedCake can be used as the base of another ToppedCake.
 * Likewise, since the topping can be any Dessert type, a cake can be topped
 * with fruit, cookies, or even another cake (including another topped cake).
 */

public class ToppedCake extends Cake {

    /** The topping for the cake*/
    private Dessert topping;

    /** The type of cake that will have the topping on it*/
    private Cake baseCake;

    /** Creating the cake with the topping*/
    public ToppedCake(Cake baseCake, Dessert topping) {
        super(baseCake.name + " topped with " + topping.name);
        this.baseCake = baseCake;
        this.topping = topping;
    }

    /** Calculating the price of the cake with the topping*/
    public double FindingPrice(){
        return baseCake.getPrice() + topping.getPrice();
    }

    /** Getting the price*/
    @Override
    public double getPrice() {
        return FindingPrice();
    }
}
