package coffeehouse;

public class Tea extends Beverage { // note the inheritance relation in the UML class diagram

    public Tea(boolean xtra) {
        super(xtra); // calls the superclass constructor
    }

    // define inherited abstract methods so that they become concrete
    protected void brew() {
        System.out.println("Putting tea bag into cup");
    }

    protected void addExtras() {
        System.out.println("Adding lemon");
    }

}
