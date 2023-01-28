package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0-5 arasi gibi sayilar urettik , hep sifirdan basladi
        // 4-9 arasi nasil uretirdim .
        // yontem su : once aralik kadar normal uret (9-4) yani 0-5 arasi
        // uretilmis olan sayiya min sayiyi ekle , uretilmis sayi+4
        // (int)(Math.Random()* (max-min))+ min

        // girilen max ve min araliginda random sayi uretin.

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("min=");
        int min = okuyucu.nextInt();

        System.out.println("max=");
        int max = okuyucu.nextInt();

        int randomsayi = (int) (Math.random()*(max-min))+ min;
        System.out.println("randomsayi = " + randomsayi);

    }
}
