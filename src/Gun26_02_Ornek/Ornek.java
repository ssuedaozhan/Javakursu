package Gun26_02_Ornek;

import java.util.Arrays;

public class Ornek {
    public static void main(String[] args) {
        Person cal1 = new Person();
        cal1.name = "Sueda";
        cal1.surname = "Ozhan";
        cal1.age = 20;

        Person cal2 = new Person();
        cal2.name = "Furkan";
        cal2.surname = "Yildirim";
        cal2.age = 21;

        // 1. yontem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surname" + cal1.surname);
        System.out.println("cal1.age=" + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surname" + cal2.surname);
        System.out.println("cal2.age=" + cal2.age);

        //2.yontem normal metod

        Bilgiyazdir(cal1);
        Bilgiyazdir(cal2);

        //3.yontem metodu ait oldugu claasdan cagiriyoruz .
        cal1.Bilgiyazdir();
        cal2.Bilgiyazdir();

        // 4.yontem
        System.out.println("cal1="+cal1);
        // soru : getbirthyear isminda oersona a ait bir metod yaziniz,
        // calistiginda kisinin dogum yilini versin .
        System.out.println("cal1 = " + cal1);
        cal1.getbirthyear();

      // 5.adim
        // getinitials isminda kisinin adinin ilk harfi .
        // soyadinin ilk  harfi seklinde (buyuk harf) veren metodu yazin

        cal1.getInitials(); // 5.soru icin


    }

    public static void Bilgiyazdir(Person cal) {
        System.out.println("cal.name=" + cal.name);
        System.out.println("cal.surname=" + cal.surname);
        System.out.println("cal.age=" + cal.age);
    }

    }


