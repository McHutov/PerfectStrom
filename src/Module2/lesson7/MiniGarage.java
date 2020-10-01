package Module2.lesson7;

public class MiniGarage implements Storage{
    private Vehicle vehicle;
    public void enter(Vehicle vehicle) {
        if(vehicle instanceof Car){
            this.vehicle = vehicle;
            System.out.println("Car is in the garage");
        } else {
           System.out.println("Garage is only for Car");
        }
    }

    public void leave() {
        if(vehicle != null) {
            System.out.println("Car leaves the garage!");
        }else
        {
            System.out.println("Garage is empty");
        }
    }
}
