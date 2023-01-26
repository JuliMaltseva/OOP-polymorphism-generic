package transport;

import java.util.Objects;

import static transport.ValidateParameters.validateParameters;

public abstract class Driver {

    private String name;
    private boolean hasDriverLicense;
    private int yearsOfExperience;

    public Driver(String name, boolean hasDriverLicense, int yearsOfExperience) {
        this.name = validateParameters(name);
        this.hasDriverLicense = hasDriverLicense;
        this.yearsOfExperience = yearsOfExperience;
    }

    public int validateYearsOfExperience(int value) {
        return value <= 0 ? 1 : value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name +
                ", hasDriverLicense=" + hasDriverLicense +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverLicense == driver.hasDriverLicense && yearsOfExperience == driver.yearsOfExperience && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasDriverLicense, yearsOfExperience);
    }

    public abstract void startMoving();

    public abstract void stopOff();

    public abstract void refuel();

}
