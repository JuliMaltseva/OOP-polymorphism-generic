package transport;

import java.util.Objects;

import static transport.ValidateParameters.validateTransportParameters;

public abstract class Transport {

    public final String brand;
    public final String model;
    public double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = validateTransportParameters(brand);
        this.model = validateTransportParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public double validateEngineVolume(double value) {
        return value <= 0 ? 1.5 : value;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + "объем двигателя - " +
                engineVolume + " л.";
    }

    abstract void start ();

    abstract void finish ();


}
