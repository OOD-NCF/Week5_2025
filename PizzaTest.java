import java.util.Scanner;

public class PizzaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("      Welcome to Java Pizza Hut     ");
        System.out.println("===================================");

        PizzaBuilder builder = new CustomPizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder);

        boolean running = true;

        while (running) {
            System.out.println("\nChoose a pizza recipe:");
            System.out.println("1. Margherita (Medium Thin Crust + Extra Cheese)");
            System.out.println("2. Pepperoni Pizza (Large Stuffed Crust + Pepperoni + Extra Cheese)");
            System.out.println("3. Veggie Pizza (Large Pan Crust + Mushrooms + Olives + Onions)");
            System.out.println("4. Build Your Own Pizza");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            Pizza pizza = null;

            switch (choice) {
                case 1:
                    pizza = director.constructMargherita();
                    break;
                case 2:
                    pizza = director.constructPepperoniPizza();
                    break;
                case 3:
                    pizza = director.constructVeggiePizza();
                    break;
                case 4:
                    pizza = buildCustomPizza(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for visiting! Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (pizza != null) {
                System.out.println("\nYour Pizza Order:");
                System.out.println("-----------------");
                System.out.println(pizza);
                System.out.println("-----------------");
                System.out.println("Enjoy your meal 🍕!");
            }
        }

        scanner.close();
    }

    // Helper method for custom pizzas
    private static Pizza buildCustomPizza(Scanner scanner) {
        PizzaBuilder builder = new CustomPizzaBuilder();

        System.out.print("Choose size (Small / Medium / Large): ");
        String size = scanner.next();
        builder.setSize(size);

        System.out.print("Choose crust (Thin / Stuffed / Pan): ");
        String crust = scanner.next();
        builder.setCrust(crust);

        System.out.print("Add Extra Cheese? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) builder.addExtraCheese();

        System.out.print("Add Pepperoni? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) builder.addPepperoni();

        System.out.print("Add Mushrooms? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) builder.addMushrooms();

        System.out.print("Add Olives? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) builder.addOlives();

        System.out.print("Add Onions? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) builder.addOnions();

        return builder.build();
    }
}
