package transport;

import java.time.LocalDate;
import java.util.Objects;

import static transport.ValidateParameters.*;
import static transport.ValidateParameters.validateString;


public class Car extends Transport {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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


