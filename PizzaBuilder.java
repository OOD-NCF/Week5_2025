public interface PizzaBuilder {
    PizzaBuilder setSize(String size);
    PizzaBuilder setCrust(String crust);
    PizzaBuilder addExtraCheese();
    PizzaBuilder addPepperoni();
    PizzaBuilder addMushrooms();
    PizzaBuilder addOlives();
    PizzaBuilder addOnions();
    Pizza build();
}
