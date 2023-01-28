package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //Local date sadece gun ay yil bilgisi tutar .

        LocalDate tarih = LocalDate.now(); //suandaki zamani verdi .
// bu bilgilerin hepsini windowstan aliyor
        System.out.println("tarih = " + tarih);
        System.out.println("taruh.getyear()="+tarih.getYear()); //taruh.getyear()=2023

        System.out.println("tarih.getMonth"+tarih.getMonth()); //tarih.getMonthJANUARY
        System.out.println(tarih.getMonthValue()); // 1
        System.out.println(tarih.getDayOfMonth());// 12
        System.out.println(tarih.getDayOfWeek());// THURSDAY
        System.out.println(tarih.getDayOfWeek().getValue()); // 4
        System.out.println(tarih.getDayOfYear());

        //kendisinindeki hazir formatlara bakalim
        System.out.println(tarih.format((DateTimeFormatter.ISO_DATE) ));
        System.out.println("SHORT="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        System.out.println("FULL almanya gosterimi=\n"+
        tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));


        // lokalizasyon tanımlaması
        // en-US : birincisi DİLİ, ikncisi Ülkeyi temsil ediyor.  Amerikan ingilizcesi
        // en-UK : UK ingilizcesi
        // fr-CA :Kanada fransızcası
        // en-CA :
        // tr-TR :

        Locale[] kullanilabiliLokaller= Locale.getAvailableLocales();

        for(Locale l : kullanilabiliLokaller){
            if (l.getDisplayCountry().toLowerCase().contains("chi")) {

                System.out.print("Dil = " + l.getDisplayLanguage());
                System.out.print(", Ülke = " + l.getDisplayCountry());
                System.out.print(",  " + l.getLanguage());
                System.out.println(" - " + l.getCountry());
            }
        }

        Locale lokalCince=new Locale("zh","CN");
        System.out.println("FULL Çince gösterimi  =\n"+
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));


        System.out.println("\n*************İstediğim formatta gösterim**************");
        // İstediğim formatta gösterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter oz2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy = " + tarih.format(oz2));

        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(oz3));

        DateTimeFormatter oz4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(oz4));

        System.out.println("ozel format ve loc EEEE dd.MM.yyyy = " + tarih.format(oz3.withLocale(Locale.UK)));

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(oz5));


        System.out.println("\n***************");
        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH, 12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));


    }
}
