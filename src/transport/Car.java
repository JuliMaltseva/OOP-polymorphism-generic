package transport;

public class Car extends Transport {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void start() {
        System.out.println("Car " + getBrand() + " " + getModel() + " started");
    }

    @Override
    public void finish() {
        System.out.println("Car " + getBrand() + " " + getModel() + " finished");
    }

    @Override
    public void pitStop() {
        System.out.println("Car " + getBrand() + " " + getModel() + " at the pitstop");
    }

    @Override
    public void theBestRacingLapTime() {
        System.out.println("The best racing lap time for car " + getBrand() + " " + getModel() + ":");
    }

    @Override
    public void maxSpeed() {
        System.out.println("The max speed for car " + getBrand() + " " + getModel() + ":");
    }


}


