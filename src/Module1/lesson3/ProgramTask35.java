package Module1.lesson3;

public class ProgramTask35
{
    public static void main(String args[])
    {
        float A = 1245.554f;
        double B = 256.3785;
        double C = A * B;
        int D = (int)C;

        System.out.println("The fractional part of the multiplication of two variables: " + (C - D));
    }
}
