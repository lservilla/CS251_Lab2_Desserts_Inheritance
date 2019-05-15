/** Code to test various dessert classes */
public class DessertTest {
    public static void main(String[] args) {
        System.out.println("Let's play with desserts!");

        Fruit fruit = new Fruit("Strawberries", 1.33, 0.89);
        double fruitWeight = fruit.getWeightInPounds();
        double fruitPrice = fruit.getPricePerPound();
        System.out.println(fruitWeight + " pounds of " + fruit.getName() +
                " at $" + fruitPrice + "/lb");


        Cookie cookie = new Cookie("Oatmeal Raisin Cookies", 4, 3.99);
        int cookieCount = cookie.getItemCount();
        double cookiePrice = cookie.getPricePerDozen();
        System.out.println(cookieCount + " " + cookie.getName() +
                " at $" + cookiePrice + "/dozen");

        Cake chocCake = new Cake("Chocolate Cake", 10.50);
        Fruit raspTopping = new Fruit("Raspberries", 0.1, 5.00);
        ToppedCake toppedCake = new ToppedCake(chocCake, raspTopping);
        System.out.println(toppedCake.getName());

        TieredCake weddingCake = new TieredCake(chocCake, new Cake("Fruit Cake", 12.80));
        System.out.println(weddingCake.getName());

        // Any kind of cake can be used as the tiers in a tiered cake!
        TieredCake multiCake = new TieredCake(weddingCake, toppedCake);
        System.out.println(multiCake.getName());

        // We should be able to use a new kind of dessert in our cakes.
        // Using an anonymous class to define some cake.
        Dessert cake = new Dessert("Carrot Cake") {
            public double getPrice() {
                return 4.40;
            }
        };
        System.out.println(cake.getName());
        ToppedCake cakeSquared = new ToppedCake(chocCake, cake);
        System.out.println(cakeSquared.getName());
        ToppedCake cakeCubed = new ToppedCake(cakeSquared, cakeSquared);
        System.out.println(cakeCubed.getName());

        System.out.println();
        System.out.println("Put some desserts into an array and loop over them");

        Dessert[] desserts = new Dessert[] {
                fruit, cookie, chocCake, raspTopping,
                toppedCake, weddingCake, multiCake,
                new Fruit("Bananas", 2.25, 3.99),
                new Cookie("Chocolate Chip Cookies", 3, 4.99),
                new Fruit("Pineapples",3.0, 1.09),
                cake, cakeSquared, cakeCubed
        };

        for(Dessert d : desserts) {
            String name = d.getName();
            double price = d.getPrice();
            System.out.printf("%s will cost $%.2f%n", name, price);
        }
    }
}
