package lesson6;

import java.util.Arrays;

public class ProgramTask64
{
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        swap(array, 1, 2);
        swap(array, 1, 3);
        swap(array, -1, 0);

        int[] array2 = new int[]{2, 4, 6, 8, 10};
        swap(array2, 2, 3);
        swap(array2, 4, 5);
        swap(array2, -2, 0);
    }
    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);
        if(indexA > array.length-1 || indexA < 0 )
        {
            System.out.println("indexA("+indexA+") incorrecct!\n");
            return;
        }
        if(indexB > array.length-1 || indexB < 0 )
        {
            System.out.println("indexB("+indexB+") incorrecct!\n");
            return;
        }
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
        System.out.println("Result: " + Arrays.toString(array) + "\n");
    }

}
