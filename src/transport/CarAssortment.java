package transport;
public class CarAssortment {
    public static Car[] car = new Car[5];

    {
        car[0] = new Car("Lada", "Granta", 1.7);
        car[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        car[2] = new Car("BMW", "Z8", 3.0);
        car[3] = new Car("Kia", "Sportage 4-го поколения", 2.4);
        car[4] = new Car("Hyundai", "Avante", 1.6);
    }

    //Вывести в консоль данные о каждом автомобиле с перечислением всех их характеристик.
    public void printAllCar() {
        for (Car car : car) {
            System.out.println(car);
        }
    }

    public void printAllCarStart() {
        for (Car car : car) {
            car.start();
        }
    }

    public void printAllCarFinished() {
        for (Car car : car) {
            car.finish();
        }
    }

    public void printAllCarPitStop() {
        for (Car car : car) {
            car.pitStop();
        }
    }

    public void printAllCarTheBestRacingLapTime() {
        for (Car car : car) {
            car.theBestRacingLapTime();
        }
    }

    public void printAllCarTheMaxSpeed() {
        for (Car car : car) {
            car.maxSpeed();
        }
    }




}

