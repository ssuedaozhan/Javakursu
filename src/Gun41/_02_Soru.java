package Gun41;

import Gun39._05_OOP_Soru.Myfunc;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    //canli digital saat yapiniz .
    public static void main(String[] args) {

        // LocalTime saat = LocalTime.now();
        //  System.out.println("saat = " + saat);
        //saat = 22:43:27.931 bu sekilde verir ama ben salise olsun istemiyorum ozaman ne yapacagiz ??

        //DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");
        //System.out.println( saat.format(f));
        // ama ben bunu sonsuz istiyorum ??

        while (true) {
            DateTimeFormatter c = DateTimeFormatter.ofPattern("kk:mm:ss");
            LocalTime saat = LocalTime.now();
            System.out.print("\r" + saat.format(c));
            //alt alta yazmasin bir saniye beklesin oyle yazsin istiyorsak ??
            Myfunc.Bekle(1);

//10:58:18
//10:58:18
//10:58:18
//10:58:18
//10:58:18
//10:58:18
//10:58:18
//10:58:18
//10:58:18
//  bu sekilde oluyor ama  c ' nin basina "\r"
//yaparsak sadece kendi degisir.


        }

    }
}

