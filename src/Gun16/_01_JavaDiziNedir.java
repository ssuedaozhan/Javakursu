package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        //bi siniftaki notlari ogrenmek istioyruz
        int ogrnot; // 1 tane not saklar

        // 50 kisi var, kimler gecti kimler kaldi ?

        int ogr1not;
        int ogr2not;
        int ogr3not;
        //....

        int ogr50not;
        // bana bir tanimlamana birden fazla deger tutabilen
        // bir degiskene ihtiyacim var ;

        int[] notlar = new int[50]; //50 tane int saklayabilen notlar isimli degisken deriz
        notlar[0] = 75;
        notlar[1] = 88;
        //...
        //...
        //...
        notlar[49] = 95; // 0 da oldgu icin 49akadar
        //hafizada bunlar kutu kutu siralnr.
        //double ,string hepsi uyar.

        //bana bir tanimlamada birden fazla deger tutabilen  bir degiskene ihtiyacim var
        //javaya ole bisi eklyelimki bir klaemde 50 notu tanimlayalim.
        // notlalr 50 dersek challenger patlar// en son eleman : toplam eleman sayisi-1 yani lenght -1 dir
        // boylece 0-49 indexdir .

        System.out.println("notlar[0] = " + notlar[0]); //0. not

        System.out.println("notlar.length=" + notlar.length);// 50 yani toplam elemen sayisini verir
        // dizinin elemean sayisini verir .


        // diziyi nasil okuturlir ? for ile yapilir , cunku basi belli sonu belli ve artisi belli


        Scanner okuyucu = new Scanner(System.in);
        for (int i = 0; i < notlar.length; i++)

        {
            System.out.println("notu girin");
            notlar[i] = okuyucu.nextInt();

        }
        for (int i = 0; i < notlar.length; i++)
        {
            System.out.println(notlar[i]); // i -> 0,1,2,3,4,.....49

            //ortada bir for döngüsü var
            //notlar.length e kadar dönüyor değil mi?
            //ve her döndüğünde de sizden bir tane sayi aliyor
            //bunlari bir listenin içine kaydediyor
            //daha sonra ise bu alma islemi bittiğinde
            //ona verdiğiniz tüm sayilari konsola yazdırmasi için 2. bir döngü daha yazmis

        }

    }
}


