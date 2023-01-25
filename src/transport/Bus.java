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
        System.out.println("начать движение");
    }

    @Override
    public void finish() {
        System.out.println("закончить движение");
    }
}
