
/**
 * @version date (CS_251_004, 2019-02-6)
 * @author Lasair Servilla
 */

/**
 * The TieredCake class should also be derived from the Cake class.
 * This kind of cake has two tiers, so it is constructed from two Cake items.
 * The price of a tiered cake is the sum of the prices of the two individual
 * cakes plus 10% of the total.
 * The TieredCake constructor should take two Cake objects
 * for the lower and upper tiers, in that order.
 * The name of a TieredCake is the name of the lower tier concatenated with
 * the String “ with an upper tier of ” and the name of the upper tier.
 * Note that since TieredCake extends Cake,
 * the tiers of a TieredCake may themselves be TieredCakes,
 * or they may be ToppedCakes or just Cakes.
 */

public class TieredCake extends Cake {

    /** The type of cake that will create the top tier*/
    private Cake topTier;

    /** The type of cake that will create the base*/
    private Cake baseCake;

    /** Creating the tiered cake our of the top and base tier*/
    public TieredCake(Cake baseCake, Cake topTier){
        super(baseCake.name + " with an upper tier of " + topTier.name);
        this.topTier = topTier;
        this.baseCake = baseCake;
    }

    /* Calculating the price for both the final tiered cake*/
    public double FindingPrice(){
        return topTier.getPrice()+ baseCake.getPrice();
    }

    /** Getting the price for the tiered cake*/
    @Override
    public double getPrice() {
        return FindingPrice();
    }
}
