package transport;

public class Car extends Transport {
    static Type typeCar;

    public Car(String brand, String model, double engineVolume, Type type) {
        super(brand, model, engineVolume);
        typeCar = type;
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

    @Override
    public String toString() {
        return brand + " " + model + ", " + "объем двигателя - " +
                engineVolume + " л." + "Тип кузова: " + typeCar;
    }




}
