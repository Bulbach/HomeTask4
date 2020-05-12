package local;

public class Main {

    public static void main(String[] args) {
        String str = "Привет! Готов? Сегодня мы изучим знаки препинания: запятая, точка. точка с запятой ;";

        int count = 0;
        char sign;
        for (int i = 0; i < str.length(); i++) {
            sign = str.charAt(i);
            if (sign == ',') {
                count++;
            } else if (sign == '.') {
                count++;
            } else if (sign == '!') {
                count++;
            } else if (sign == '?') {
                count++;
            } else if (sign == ':') {
                count++;
            } else if (sign == ';') {
                count++;
            }
        }
        System.out.println("Количество знаков препинания равно : " + count);
    }
}
