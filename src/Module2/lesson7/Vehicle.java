package Module2.lesson7;

public abstract class Vehicle {
    private int size;
    private int power;

    public Vehicle(){}

    public Vehicle(int size, int power) {
        this.size = size;
        this.power = power;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
