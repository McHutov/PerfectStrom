package Module1.lesson5;

import java.util.Scanner;

public class ProgramTask56
{
    public static void main(String args[])
    {
        int number;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();

        switch(number)
        {
            case 12:
            case 1:
            case 2: System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5:System.out.println("Spring"); break;
            case 6:
            case 7:
            case 8:System.out.println("Summer"); break;
            case 9:
            case 10:
            case 11: System.out.println("Autumn");break;
            default: System.out.println("You entered number out of renge, try again");

        }
    }
}
