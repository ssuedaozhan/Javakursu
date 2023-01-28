package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _04_JavaLocalDateTime {
    public static void main(String[] args) {// hem tarih hem de saat bilgisini tutar .

        LocalDateTime dt = LocalDateTime.now();

        System.out.println("dt = " + dt);
        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("birinci ay = " + dt.getMonth());
        System.out.println("Ayin kaci= " + dt.getMonthValue());
        System.out.println("dt = " + dt.getDayOfYear());
        System.out.println("dt = " + dt.getDayOfMonth());
        System.out.println("dt = " + dt.getDayOfWeek());
        System.out.println("dt = " + dt.getHour());
        System.out.println("dt = " + dt.getMinute());
        System.out.println("dt = " + dt.getNano());

        System.out.println("ISO_DATE_TIME = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("SHORT = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        // özel formatta istediğimiz gibi yazdırma
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("dt.format(f) = " + dt.format(f));

    }

}
