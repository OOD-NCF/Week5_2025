public class CustomPizzaBuilder implements PizzaBuilder {
    private String size;
    private String crust;
    private boolean extraCheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean olives;
    private boolean onions;

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setCrust(String crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder addExtraCheese() {
        this.extraCheese = true;
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    @Override
    public PizzaBuilder addMushrooms() {
        this.mushrooms = true;
        return this;
    }

    @Override
    public PizzaBuilder addOlives() {
        this.olives = true;
        return this;
    }

    @Override
    public PizzaBuilder addOnions() {
        this.onions = true;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, crust, extraCheese, pepperoni, mushrooms, olives, onions);
    }
}
