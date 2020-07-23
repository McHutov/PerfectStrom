package lesson6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ProgramTask63
{
    public static void main(String args[])
    {
        int[] array = {1, 2, 3, 4, 5};
        swap(array, 0, 1);

        int[] array2 = new int[]{2, 3, 4, 5, 6, 10};
        swap(array2, 2, 5);
    }
    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
        System.out.println("Result: " + Arrays.toString(array) + "\n");
    }
}
