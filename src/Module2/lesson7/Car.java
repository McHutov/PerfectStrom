package Module2.lesson7;

public abstract class Car extends Vehicle {
    private int maxSpeed;

    public Car(){}

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(int size, int power, int maxSpeed) {
        super(size, power);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
