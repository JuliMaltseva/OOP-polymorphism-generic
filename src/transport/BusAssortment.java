package transport;

public class BusAssortment {
    public static Bus[] bus = new Bus[4];

    {
        bus[0] = new Bus("ПАЗ", "3205", 4.25);
        bus[1] = new Bus("Scania-ЛиАЗ", "VOYAGE", 9.29);
        bus[2] = new Bus("Hyundai", "Universe", 12.3);
        bus[3] = new Bus("МАЗ", "103", 7.12);
    }

    public void printAllBas() {
        for (Bus bus : bus) {
            System.out.println(bus);
        }
    }

    public void printAllBusStart() {
        for (Bus bus : bus) {
            bus.start();
        }
    }

    public void printAllBusFinished() {
        for (Bus bus : bus) {
            bus.finish();
        }
    }

    public void printAllBusPitStop() {
        for (Bus bus : bus) {
            bus.pitStop();
        }
    }

    public void printAllBusTheBestRacingLapTime() {
        for (Bus bus : bus) {
            bus.theBestRacingLapTime();
        }
    }

    public void printAllBusTheMaxSpeed() {
        for (Bus bus : bus) {
            bus.maxSpeed();
        }
    }
}
