package Module2.lesson7;

public abstract class Truck extends Vehicle {
    private int maxWeight;

    public Truck(){}

    public Truck(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Truck(int size, int power, int maxWeight) {
        super(size, power);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
