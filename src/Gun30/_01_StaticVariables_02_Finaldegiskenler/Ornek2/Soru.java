package Gun30._01_StaticVariables_02_Finaldegiskenler.Ornek2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int gun = 0 ;
        int saat = 0 ;
        int dakika =0;

        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Gun="); gun= okuyucu.nextInt();
        System.out.print("Saat="); saat= okuyucu.nextInt();
        System.out.print("Dakika="); dakika= okuyucu.nextInt();
//1 . yontem
 int toplamsaniye=
         gun
         *Sabitler.birgundekisaat
         *Sabitler.birsaatdekidakika
         *Sabitler.birdakikadakisaniye
         +
                 saat
         *Sabitler.birsaatdekidakika
         *Sabitler.birdakikadakisaniye
         +
                 dakika
         *Sabitler.birdakikadakisaniye;
        System.out.println("toplamsaniye = " + toplamsaniye);


        // 2. yontem
        System.out.println("toplamsaniye = " + Sabitler.hesapla(gun,saat,dakika));



        }


    }


