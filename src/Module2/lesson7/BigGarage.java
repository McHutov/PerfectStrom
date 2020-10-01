package Module2.lesson7;

public class BigGarage implements Storage{
    private static Vehicle vehicle;
    private static Vehicle vehicle1;

    @Override
    public void enter(Vehicle v) {
        if(v instanceof Truck){
            if(isFree(vehicle)){
                vehicle = v;
                System.out.println("Truck is in the garage");
            }else
            {
                if(isFree(vehicle1)){
                    vehicle1 = v;
                    System.out.println("Truck is in the garage");
                }
            }
        }
        else
        {
            if(v instanceof Car){
                if(isFree(vehicle)){
                    vehicle = v;
                    System.out.println("Car is in the garage");
                }else
                {
                    if(isFree(vehicle1)){
                        vehicle1 = v;
                        System.out.println("Car is in the garage");
                    }
                }

            }
            else{
                if(v instanceof Bus){
                    if(isFree(vehicle)){
                        vehicle = v;
                        System.out.println("Bus is in the garage");
                    }else
                    {
                        if(isFree(vehicle1)){
                            vehicle1 = v;
                            System.out.println("Bus is in the garage");
                        }
                    }
                }
            }
        }
    }

    @Override
    public void leave() {
        if(vehicle != null && vehicle1 != null){
            System.out.println("Both vehicle leaves the garage");
        }else{
            if(vehicle != null || vehicle != null){
                System.out.println("Only one vehicle leaves the garage");
            }
            else
            {
                System.out.println("Garage is empty");
            }
        }
    }

    public static boolean isFree(Vehicle v){
        if(v != null){
            return false;
        }else{
            return true;
        }

    }
}

