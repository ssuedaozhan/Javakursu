package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // tek seferde girilen bir ad soyadin tam ad yani adini ve soyadini ayirip ayri ayri yazdiriniz /

        Scanner okuyucu = new Scanner(System.in);

        System.out.println("Adinizi ve soyadiniz"); //sueda ozhan
        String adsoyad = okuyucu.nextLine();
        // buraya kadar normal yaxdirma yaptik
         // diger islem icin :

        int boslukIndex = adsoyad.indexOf(" ");
        String ad = adsoyad.substring(0, boslukIndex);
        String soyad = adsoyad . substring(boslukIndex+1); // boslugun bir fazlasi soyadin basina dekledigi icn

        System.out.println("soyad = " + soyad);
        System.out.println("ad = " + ad);

        // girilen dedigi icin scan yapmamiz lazim ki istedigimizi yazabilelim . sout dan ad soyad giricez .
        // yazabilmek icin stringini giriyotruz fakat "okuyucu.nextline()" demeyi unutma
        // boslugun indexini bulmamiz icin int boslukIndex = adsoyad.indexOf(" "); yaptik
        // daha sonrasinda strnglero sirasiyla yaptik ad ve soyad icin .
        // soyad da +1 yaptik cunku oncesinde bosluk vardi bsolugu da karakter olarak saydigi icin
        // dahs sonrasindada teker teker ad soyadi soutv den yazdirdik
    }
}
