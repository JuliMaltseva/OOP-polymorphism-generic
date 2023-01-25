package transport;

public class BusAssortment {
    private static Bus [] buses = new Bus[4];
    {
        buses[0] = new Bus("ПАЗ", "3205",4.25);
        buses[1] = new Bus("Scania-ЛиАЗ", "VOYAGE",9.29);
        buses[2] = new Bus("Hyundai", "Universe",12.3);
        buses[3] = new Bus("МАЗ","103", 7.12);
    }

    public void printAllBas() {
        for (Bus bus: buses) {
            System.out.println(bus);
        }
    }
}
