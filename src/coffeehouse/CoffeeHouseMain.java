package coffeehouse;

public class CoffeeHouseMain {
    public static void main(String[] args) {
        // test all 4 flavors of Beverage
        Coffee c1 = new Coffee(true);
        c1.prepareRecipe();
        Coffee c2 = new Coffee(false);
        c2.prepareRecipe();
        Tea t1 = new Tea(true);
        t1.prepareRecipe();
        Tea t2 = new Tea(false);
        t2.prepareRecipe();

        // test all valid forms of takeOrder
        Barista bob = new Barista();
        bob.takeOrder("coffee").prepareRecipe();
        bob.takeOrder("coffee, extras").prepareRecipe();
        bob.takeOrder("tea").prepareRecipe();
        bob.takeOrder("tea, extras").prepareRecipe();

        // also test invalid forms of take order, they should all return null
        System.out.println(bob.takeOrder("chocolate"));
        System.out.println(bob.takeOrder(""));
        System.out.println(bob.takeOrder(null));
    }
}
