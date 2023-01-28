package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // math.max yontemi ile girilen 3 sayidan buyuk olanini bulunuz.
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("3 tane Sayi Giriniz");

        int Sayi1 = okuyucu.nextInt();
        System.out.println("sayi 1 degeri");

        int Sayi2 = okuyucu.nextInt();
        System.out.println("sayi2 degeri");

        int Sayi3 = okuyucu.nextInt();
        System.out.println("sayi3 degeri");

        int enb= Math.max(Sayi1, Sayi2);
        enb = Math.max(enb, Sayi3);
        System.out.println("enb = " + enb);



    }
}
