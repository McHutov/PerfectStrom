package Module2.lesson6;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        House[] houses = new House[]{
                new House(27600,18, 20,1,1,"Baker", "residential",2 ),
                new House(27601,19, 30,2,2,"Dubai", "residential",1 ),
                new House(27602,18, 50,2,3,"Raion", "public",3 ),
                new House(27603,11, 50,3,3,"Chetky", "public",5 ),
                new House(27604,11, 10,3,4,"Dom", "residential",1 )
        };

        first:
        {
            while (true) {
                System.out.println("1. List of apartments with a given number of rooms.\n" + "2. List of apartments with given number of " +
                        "rooms and floor.\n" + "3. List of apartments according to area\n" + "4. Exit");
                int choice = s.nextInt();
                switch (choice) {
                    case 1:
                        House.listByGivenRooms(houses);
                        break;
                    case 2:
                        House.listByNumberFloor(houses);
                        break;
                    case 3:
                        House.listByArea(houses);
                        break;
                    case 4:
                        break first;
                    default:
                        System.out.println("Invalid input! Try again!");
                        break;
                }
            }
        }
    }
}
