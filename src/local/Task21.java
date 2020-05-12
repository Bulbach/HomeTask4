package local;

import java.util.Calendar;

public class Task21 {
    static int quantity = 10000;
    static String str = "Черный вечер.Белый снег.Ветер, ветер!";

    public static void counting() {

        String time = " ";

        System.out.println("Подсчет через конкатенацию");

        long op1 = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= quantity; i++) {
            time += str;

        }
        long op2 = Calendar.getInstance().getTimeInMillis();
        long result1 = op2 - op1;
        System.out.println("Время затрачено " + result1);
    }

    public static void countingAp() {

        System.out.println("Подсчет через Append");

        long op3 = Calendar.getInstance().getTimeInMillis();
        StringBuilder ap = new StringBuilder(str);
        for (int c = 0; c <= quantity; c++) {
            ap.append(str);
        }
        long op4 = Calendar.getInstance().getTimeInMillis();
        long result2 = op4 - op3;
        System.out.println("Время затрачено : " + result2);
    }
}
