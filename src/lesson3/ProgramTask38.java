package lesson3;

public class ProgramTask38
{
    public static void main(String args[])
    {
        int x = 123;
        int num123b;
        StringBuilder str = new StringBuilder();

        int xcopy = x;
        while(xcopy != 0)
        {
            str.append(xcopy % 2);
            xcopy = xcopy / 2;
        }

        str.reverse();
        num123b = Integer.parseInt(str.toString());
        System.out.println("123 in binary form: " + num123b);

        str.delete(0,str.length());

        xcopy = x;
        while(xcopy != 0)
        {
            str.append(xcopy % 8);
            xcopy = xcopy / 8;
        }

        str.reverse();
        num123b = Integer.parseInt(str.toString());
        System.out.println("123 in octal form: " + num123b);

        str.delete(0,str.length());

        xcopy = x;
        while(xcopy != 0)
        {
            if(xcopy % 16 > 9)
            {
                switch (xcopy % 16)
                {
                    case 10: str.append("A");break;
                    case 11: str.append("B");break;
                    case 12: str.append("C");break;
                    case 13: str.append("D");break;
                    case 14: str.append("E");break;
                    case 15: str.append("F");break;
                }
            }
            else
            {
                str.append(xcopy % 16);
            }
            xcopy = xcopy / 16;
        }

        str.reverse();
        System.out.println("123 in octal form: " + str);

    }
}
