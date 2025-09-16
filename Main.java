public class Main {
    public static void main(String[] args) {
        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        CarDirector carDirector = new CarDirector(sportsCarBuilder);

        Car sportsCar = carDirector.constructCar();

        System.out.println(sportsCar);
    }
}
