package transport;

public class DriverC extends Driver {

    public DriverC(String name, boolean hasDriverLicense, int yearsOfExperience) {
        super(name, hasDriverLicense, yearsOfExperience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getName() + " начал движение.");
    }

    @Override
    public void stopOff() {
        System.out.println("Водитель категории C " + getName() + " остановился.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории C " + getName() + " заправил авто.");
    }
}
