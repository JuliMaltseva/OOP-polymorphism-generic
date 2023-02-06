package transport;

public class TruckAssortment {
    public static Truck [] truck = new Truck[4];
    {
        truck[0] = new Truck("КамАЗ","65111",11.76);
        truck[1] = new Truck("Mercedes-Benz", "Axor 3335 K",12.0);
        truck[2] = new Truck("Hyundai", "HD 170",11.2);
        truck[3] = new Truck("МАЗ","6312A8-365", 14.9);
    }

    public void printAllTrucks() {
        for (Truck truck: truck) {
            System.out.println(truck);
        }
    }

    public void printAllTruckStart() {
        for (Truck truck: truck) {
            truck.start();
        }
    }

    public void printAllTruckFinished() {
        for (Truck truck: truck) {
            truck.finish();
        }
    }

    public void printAllTruckPitStop() {
        for (Truck truck: truck) {
            truck.pitStop();
        }
    }

    public void printAllTruckTheBestRacingLapTime() {
        for (Truck truck: truck) {
            truck.theBestRacingLapTime();
        }
    }

    public void printAllTruckTheMaxSpeed() {
        for (Truck truck: truck) {
            truck.maxSpeed();
        }
    }
}
