package lesson8;

public class ProgramTask83
{
    public static void main(String args[])
    {
        int []arr = {1,2,3,4,5};
        method(1);
        method(1,1);
        method(1.0,1);
        method(1.0,1.0);
        method(arr);

    }

    static int method(int a){
        return a*a;
    }
    static int method(int a, int b){
        return a*b;
    }
    static double method(double a, int b){
        return a*b;
    }
    static double method(double a,double b){
        return a*b;
    }
    static int method(int arr[])
    {
        int sum = 1;
        for(int i = 0; i < arr.length; i++)
        {
            sum*=i;
        }
        return sum;
    }


    /*
    What is method overloading?
    In Java, it is allowed to define two or more methods under the
    same name in the same class, as long as their parameter declarations
    are different. In this case, the methods are called overloading, and
    the process itself is called method overloading.

    How to overload a method?
    When calling an overloaded method, Java uses the type and / or number
    of method arguments to determine the desired variant of it. Therefore,
    overloaded methods must differ in the type and / or number of their
    parameters.

    1. Method:
    public static void sum(int a, double b) {
      ...
   }
   not overload

   2. Method:
   public static double sum(double a, int b) {
      ...
   }
   overload
     */

}
