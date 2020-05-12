package local;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task20 {

    public static void task1(){

        String str = "Белеет парус одинокий в тумане моря голубом";
        Pattern p = Pattern.compile("(?U)\\w\\b");
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.print(m.group());
        }
            System.out.println();
    }
}
