package ClassesUtilitarias.formatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = Locale.of("it", "IT");
        Locale localeCH = Locale.of("it", "CH");
        Locale localeIndia = Locale.of("hi", "IN");
        Locale localeJapao = Locale.of("ja", "JP");
        Locale localeHolanda = Locale.of("nl", "NL");
        Locale localeBrasil = Locale.of("pt", "BR");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);

        System.out.println("Itália " + df1.format(calendar.getTime()));
        System.out.println("Suíça " + df2.format(calendar.getTime()));
        System.out.println("Índia " + df3.format(calendar.getTime()));
        System.out.println("Japão " + df4.format(calendar.getTime()));
        System.out.println("Holanda " + df5.format(calendar.getTime()));
        System.out.println("Brasil " + df6.format(calendar.getTime()));
    }
}
