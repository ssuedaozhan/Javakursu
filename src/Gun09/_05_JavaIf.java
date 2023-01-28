package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        //girilen bir ogrencinin notuna gore 50 den buyuk-esit
        // ise gectiniz , kucuk ise kaldiniz yazdiriniz .

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Ogrenci notu =");
        int ogrNot = okuyucu.nextInt();

        if (ogrNot>=50 ) // buyuk veya esittir
            System.out.println("Gectiniz");

        if (ogrNot<50) // kucuktur
            System.out.println("yaz okuluna kaldiniz");


    }
}
