package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
// Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner okuyucu = new Scanner(System.in);
        int [] dizi = new int[5];
        System.out.println("5 tane sayi giriniz=");

        for (int i = 0; i <= 5; i++) {
            System.out.println(i +".sayi");
            int sayi = okuyucu.nextInt();

            enkucukeleman(dizi);
            enbuyukeleman(dizi);
            ortalama(dizi);
        }
    }
    public static void enkucukeleman(int[] sayilar){
        Arrays.sort( sayilar);
        System.out.println("enkucuk = " + sayilar[0]);

    }
    public static void enbuyukeleman(int []sayilar){
        Arrays.sort(sayilar);
        System.out.println("enbüyük = " + sayilar[sayilar.length-1]);

    }
    public static void ortalama(int [] sayilar){
        Arrays.sort(sayilar);
       // System.out.println("ortalma="+);



    }
}
