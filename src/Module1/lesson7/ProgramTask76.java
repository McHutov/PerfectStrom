package Module1.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProgramTask76
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int a = s.nextInt();
        int index = 0;

        while(a != 0)
        {
            arr.add(a % 10);
            a = a / 10;
        }

        Integer arr1[] = arr.toArray(new Integer[arr.size()]);



        for(int i = arr.size()-1; i > 0; i--)
        {
            for(int j =0; j < i; j++)
            {
                if(arr1[i] == arr1[j])
                {
                    index++;
                }
            }
        }
        System.out.println(index);
        if(index == 0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}
