package transport;

public class Truck extends Transport{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public double validateEngineVolume(double value) {
        return value <= 0 ? 11.0 : value;
    }

    @Override
    public void start() {
        System.out.println("Truck " + getBrand() + " " + getModel() + " started");
    }

    @Override
    public void finish() {
        System.out.println("Truck " + getBrand() + " " + getModel() + " finished");
    }

    @Override
    public void pitStop() {
        System.out.println("Truck " + getBrand() + " " + getModel() + " at the pitstop");
    }

    @Override
    public void theBestRacingLapTime() {
        System.out.println("The best racing lap time for truck " + getBrand() + " " + getModel() + ":");
    }

    @Override
    public void maxSpeed() {
        System.out.println("The max speed for bus " + getBrand() + " " + getModel() + ":");
    }
}
