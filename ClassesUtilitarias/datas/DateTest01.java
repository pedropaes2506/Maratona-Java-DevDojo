package ClassesUtilitarias.datas;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime() + 3600000);
        System.out.println(date);
    }
}
