package coffeehouse;

public class Coffee extends Beverage { // note the inheritance relation in the UML class diagram

    public Coffee(boolean e) {
        super(e); // calls the superclass constructor to initialize the superclass "extras" attribute
    }

    // define inherited abstract methods so that they become concrete
    protected void brew() {
        System.out.println("Putting coffee powder into cup");
    }

    protected void addExtras() {
        System.out.println("Adding milk and sugar");
    }    
    
}
