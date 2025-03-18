package ClassesUtilitarias.formatacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        String pattern2 = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf2.format(new Date()));
    }
}
