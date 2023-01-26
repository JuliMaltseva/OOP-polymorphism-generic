package transport;

public class DriverD extends Driver{

    public DriverD(String name, boolean hasDriverLicense, int yearsOfExperience) {
        super(name, hasDriverLicense, yearsOfExperience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getName() + " начал движение.");
    }

    @Override
    public void stopOff() {
        System.out.println("Водитель категории D " + getName() + " остановился.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D " + getName() + " заправил авто.");
    }
}
