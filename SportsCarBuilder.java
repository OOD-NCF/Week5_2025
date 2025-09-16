// Concrete Builder implementing the CarBuilder interface
public class SportsCarBuilder implements CarBuilder {
    private Car car;

    public SportsCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.setEngine("V8");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Manual");
    }

    @Override
    public void buildSunroof() {
        car.setSunroof(true);
    }

    @Override
    public void buildGPS() {
        car.setGPS(true);
    }

    @Override
    public void buildAirConditioning() {
        car.setAirConditioning(true);
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}