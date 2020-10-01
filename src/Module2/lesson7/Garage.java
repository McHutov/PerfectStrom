package Module2.lesson7;

public class Garage implements Storage{
    private Vehicle vehicle;
    public void enter(Vehicle vehicle) {
       if(vehicle instanceof Truck){
           this.vehicle = vehicle;
           System.out.println("Truck is in the garage");
       }
       else
       {
           if(vehicle instanceof Car){
               this.vehicle = vehicle;
               System.out.println("Car is in the garage");

           }
           else{
               System.out.println("This garage is too small!");
           }
       }
    }

    public void leave() {
        if(vehicle != null) {
            System.out.println((vehicle instanceof Truck ? "Truck" : "Car") + " leaves the garage!");
        }else{
            System.out.println("Garage is empty");
        }
    }
}
