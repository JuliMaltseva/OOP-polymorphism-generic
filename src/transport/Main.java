package transport;

public class Main {
    public static void main(String[] args) {

        CarAssortment carAssortment = new CarAssortment();
        carAssortment.printAllCar();

        BusAssortment busAssortment = new BusAssortment();
        busAssortment.printAllBas();

        TruckAssortment truckAssortment = new TruckAssortment();
        truckAssortment.printAllTrucks();

    }
}