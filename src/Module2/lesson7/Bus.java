package Module2.lesson7;

public abstract class Bus extends Vehicle{
    private int numberSeats;

    public Bus(){}

    public Bus(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public Bus(int size, int power, int numberSeats) {
        super(size, power);
        this.numberSeats = numberSeats;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
}
