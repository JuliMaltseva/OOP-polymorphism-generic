package transport;

public class Bus extends Transport {


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public double validateEngineVolume(double value) {
        return value <= 0 ? 7.0 : value;
    }

    @Override
    public void start() {
        System.out.println("Bas " + getBrand() + " " + getModel() + " started");
    }

    @Override
    public void finish() {
        System.out.println("Bas " + getBrand() + " " + getModel() + " finished");
    }

    @Override
    public void pitStop() {
        System.out.println("Bus " + getBrand() + " " + getModel() + " at the pitstop");
    }

    @Override
    public void theBestRacingLapTime() {
        System.out.println("The best racing lap time for bus " + getBrand() + " " + getModel() + ":");
    }

    @Override
    public void maxSpeed() {
        System.out.println("The max speed for bus " + getBrand() + " " + getModel() + ":");
    }
}
