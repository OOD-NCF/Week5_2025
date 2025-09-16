// Builder interface
public interface CarBuilder {
    void buildEngine();
    void buildTransmission();
    void buildSunroof();
    void buildGPS();
    void buildAirConditioning();
    Car getCar();
}