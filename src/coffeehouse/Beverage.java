package coffeehouse;

// note the italics on Beverage in the UML class diagram
abstract public class Beverage { 

    private boolean extras;

    public Beverage(boolean extras) {
        this.extras = extras;
    }

    public void prepareRecipe() {
        System.out.println("Preparing new beverage");
        boilWater();
        brew();
        pourInCup();
        if (extras)
            addExtras();
        System.out.println();
    }

    // note the # character before boilWater() in the UML class diagram
    protected void boilWater() { 
        System.out.println("Boiling water");
    }

    // note both the # and the italics in brew() in the UML
    abstract protected void brew(); // abstract methods do not have a {...} body, it will be defined in concrete subclasses

    // similar to boilWater(); #
    protected void pourInCup() { 
        System.out.println("Pouring into cup");
    }

    // similar to brew(): #, italics
    abstract protected void addExtras(); 

}
