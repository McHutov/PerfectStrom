package Lesson8;

import java.util.Scanner;

public class ProgramTask81
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int c;

        method1();

        System.out.println("\nEnter the number bigger than 1");
        a = s.nextInt();
        method2(a);

        System.out.println("\nEnter two number:");
        a = s.nextInt();
        b = s.nextInt();
        method3(a, b);

        System.out.println("\nEnter the sides of triangle:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        method4(a,b,c);


    }

    static void method1()
    {
        for(int i = 1; i < 20; i++)
        {
            System.out.println(i + "     " + ++i);
        }
    }

    static void method2(int a)
    {
        int sum = 0;
        for(int i=1; i <= a; i++)
        {
            sum+=i;
        }

        System.out.println("Sum = " + sum);
    }

    static void method3(int a, int b)
    {
        System.out.println("Numbers divisible by 3: ");
        for(int i = a; i <= b; i++)
        {
            if(i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }

    static void method4(int a, int b, int c)
    {
        if(a+b > c || b+c > a || a+c > b)
        {
            System.out.println("Possible");
        }
        else
        {
            System.out.println("Not Possible");
        }
    }
}
