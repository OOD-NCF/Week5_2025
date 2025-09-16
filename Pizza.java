public class Pizza {
    // Required attributes
    private String size;
    private String crust;

    // Optional attributes
    private boolean extraCheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean olives;
    private boolean onions;

    // Constructor (only accessible by builder)
    Pizza(String size, String crust, boolean extraCheese,
          boolean pepperoni, boolean mushrooms,
          boolean olives, boolean onions) {
        this.size = size;
        this.crust = crust;
        this.extraCheese = extraCheese;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
        this.olives = olives;
        this.onions = onions;
    }

    @Override
    public String toString() {
        return "Pizza [Size = " + size +
                ", Crust = " + crust +
                ", Extra Cheese = " + extraCheese +
                ", Pepperoni = " + pepperoni +
                ", Mushrooms = " + mushrooms +
                ", Olives = " + olives +
                ", Onions = " + onions + "]";
    }
}
