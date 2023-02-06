package transport;

import transport.*;

public class Main {
    public static void main(String[] args) {

        CarAssortment carAssortment = new CarAssortment();
        carAssortment.printAllCar();

        BusAssortment busAssortment = new BusAssortment();
        busAssortment.printAllBas();

        TruckAssortment truckAssortment = new TruckAssortment();
        truckAssortment.printAllTrucks();

        System.out.println();

        /*
        carAssortment.printAllCarStart();
        busAssortment.printAllBusStart();
        truckAssortment.printAllTruckStart();

        System.out.println();

        carAssortment.printAllCarFinished();
        busAssortment.printAllBusFinished();
        truckAssortment.printAllTruckFinished();

        System.out.println();

        carAssortment.printAllCarPitStop();
        carAssortment.printAllCarTheBestRacingLapTime();
        carAssortment.printAllCarTheMaxSpeed();

        System.out.println();

        busAssortment.printAllBusPitStop();
        busAssortment.printAllBusTheBestRacingLapTime();
        busAssortment.printAllBusTheMaxSpeed();

        System.out.println();

        truckAssortment.printAllTruckPitStop();
        truckAssortment.printAllTruckTheBestRacingLapTime();
        truckAssortment.printAllTruckTheMaxSpeed();
        */
        System.out.println();

        switch (Car.typeCar) {
            case SEDAN:
                System.out.println("Седан");
                break;
            case HATCHBACK:
                System.out.println("Хетчбэк");
                break;
            case COUPE:
                System.out.println("Купе");
                break;
            case STATION_WAGON:
                System.out.println("Универсал");
                break;
            case SUV:
                System.out.println("Внедорожник");
                break;
            case CROSSOVER:
                System.out.println("Кроссовер");
                break;
            case PICKUP:
                System.out.println("Пикап");
                break;
            case VAN:
                System.out.println("Фургон");
                break;
            case MINIVAN:
                System.out.println("Минивэн");
                break;
        }


    }

}