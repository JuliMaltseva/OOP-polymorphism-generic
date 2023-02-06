package transport;

public class DriverB extends Driver {
    public DriverB(String name, boolean hasDriverLicense, int yearsOfExperience) {
        super(name, hasDriverLicense, yearsOfExperience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getName() + " начал движение.");
    }

    @Override
    public void stopOff() {
        System.out.println("Водитель категории В " + getName() + " остановился.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории В " + getName() + " заправил авто.");
    }
}
