package Module2.lesson8.Task2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "12 var3 34 2%^i 90";
        String[] strings = str.split("[^\\d]+");
        System.out.println(Arrays.toString(strings));
        //String[] strings1 = str.split("");//([a-zA-Z]+\d)

        Pattern pattern = Pattern.compile("\\d\\d");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println(str.substring(matcher.start(),matcher.end()));
        }

    }
}
