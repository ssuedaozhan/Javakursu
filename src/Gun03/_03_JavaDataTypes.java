package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi ;// hafizada int kadar yer auiriyor , sadece tam sayi atilabiliyor .

        // tam sayilar
        byte byteDeger = 7 ; // -128 127
        short shortdeger = 1645 ; // -32000 .... 320000
        int intDeger = 250000;
        long longdeger = 2323232323454545L ; // sonunaL eklememizin neteni long oldugunu belli etmek


        // ondalikli sayilar
        // ondalikli sayilarda default DOUBLE dir .
        double doubleD = 3.14144545667677;
        float floatdeger = 3.144343F;   // F kullanmamaizin nedeni usttekiyle karismamasi icindir .

        // karakter ve karakterler
        char basharf= 'A'; // tek karakterlerde tek tirnak
        String isim = "ismet";

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortdeger = " + shortdeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longdeger = " + longdeger);

    }
}
