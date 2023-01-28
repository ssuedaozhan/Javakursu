package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayiyin ,  2ayni  sayinin carpimina esit olup  (tam kare) olmadigini bulunuz
        // ornek : 4 girdim , bu tam karedir dicek .
        // 4 girdim -> tamkare
        // 5 girdim -> degildir
        // 9 girdim -> tamkaredir

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("sayi giriniz= ");
        int sayi = okuyucu.nextInt();

        int sayac = 0;

        // mesela 5 girdi , 5 e kadar olan sayilari 1,2,3,4, carparim birbiiryle , 1kere 1 , 2 kere 2 ,
        // besi vermedigi icin tam kare degildir 5.

        while (sayac < sayi)

        {
            System.out.println("sayac = " + sayac); // adimlari gostermesi icin .

            if (sayac * sayac == sayi)

            {
                System.out.println("tam karedir");
                break; // calistiginda donguyu durduruz , donguden cikaer
                // mesela 9 girdim , dokuzdan kucuk 3 var , 3 un karesi 0 dur . tam kare cikar .

            }
               sayac++;


        }
    }
}
