package coffeehouse;

public class Barista {
    // key point: takeOrder() returns Beverage, supertype of both Coffee and Tea,
    // and supporting the prepareRecipe() method. 
    // takeOrder() cannot return Object, which is also a valid supertype, 
    // because it does not support prepareRecipe().
    public Beverage takeOrder(String order) {
        if (order == null) { // good for robustness
            return null;
        }
        switch (order) { // could be replaced by if(order.equals("...")) return new... else if...
            case "coffee":
                return new Coffee(false);
            case "coffee, extras":
                return new Coffee(true);
            case "tea":
                return new Tea(false);
            case "tea, extras":
                return new Tea(true);
            default:
                return null; // do not forget this
        }
    }
}
