// Director class
public class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructCar() {
        builder.buildEngine();
        builder.buildTransmission();
        builder.buildSunroof();
        builder.buildGPS();
        builder.buildAirConditioning();
        return builder.getCar();
    }
}
