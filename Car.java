// Product class
public class Car {
    private String engine;
    private String transmission;
    private boolean sunroof;
    private boolean GPS;
    private boolean airConditioning;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", transmission=" + transmission +
                ", sunroof=" + sunroof + ", GPS=" + GPS +
                ", airConditioning=" + airConditioning + "]";
    }
}
