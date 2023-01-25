package transport;

public class TruckAssortment {
    private static Truck [] trucks = new Truck[4];
    {
        trucks[0] = new Truck("КамАЗ","65111",11.76);
        trucks[1] = new Truck("Mercedes-Benz", "Axor 3335 K",12.0);
        trucks[2] = new Truck("Hyundai", "HD 170",11.2);
        trucks[3] = new Truck("МАЗ","6312A8-365", 14.9);
    }

    public void printAllTrucks() {
        for (Truck truck: trucks) {
            System.out.println(truck);
        }
    }
}
