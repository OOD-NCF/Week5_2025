public class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza constructMargherita() {
        return builder
                .setSize("Medium")
                .setCrust("Thin")
                .addExtraCheese()
                .build();
    }

    public Pizza constructPepperoniPizza() {
        return builder
                .setSize("Large")
                .setCrust("Stuffed")
                .addPepperoni()
                .addExtraCheese()
                .build();
    }

    public Pizza constructVeggiePizza() {
        return builder
                .setSize("Large")
                .setCrust("Pan")
                .addMushrooms()
                .addOlives()
                .addOnions()
                .build();
    }
}
