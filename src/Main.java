import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Hello world!");

        boolean true_1 = true;
        boolean true_2 = true;
        boolean false_1= false;
        int x = 2;
        int y = 3;

        int result;
        //result = (true == true_1) ? true : false;
        result = y ^ 2;
        out.println(result++);
        out.println(++result);

        String str = "Hello!";
        String str1 = "Hello!";

        boolean res = str == str1 ? true : false;
        out.println(res);

        String str2 = new String("Hello! ");
        String str3 = new String("Hello! ");
        res = str2 == str ? true : false;
        out.println(res);

        res = str2.equals(str) ? true : false;
        out.println(res);

        res = str2.equalsIgnoreCase(str3) ? true : false;
        out.println(res);

        str3 = str3.toUpperCase();
        str3 = str3.toUpperCase();
        str3 = str3.strip();

        out.println(str3.startsWith("He"));
        out.println(str3.endsWith("!"));

        out.println(str3);
        out.println(str3.indexOf("L"));

        str3 = str3.replace("H", "X");
        out.println(str3);

        str3 += "$";
        out.println(str3);
        str3.charAt(3);
        out.println(str3);

        
        // Partie Date
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
    }
}
