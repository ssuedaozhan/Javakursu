package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // girilen bir ad soyadi sueda ozhan S.O. seklinde yazdiriniz .
        // ne yazarsak cikmali sekide // sueda ozhan

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("adiniz ve soyadiniz=");
        String adsoyad= okuyucu.nextLine();

        // sueda ozhan = S.O = S= charat(0) S.
        // indexof(" ")= bislugun indexini veriyor , bunun 1 fazlasini charAt() = T yi verir

        char ilkharf= adsoyad.charAt(0); // S
        int boslukIndex=adsoyad.indexOf(" ");  // BOSLUK
        char soyadilkharf= adsoyad.charAt(boslukIndex+1);// O

        System.out.println( ilkharf+"."+soyadilkharf+ ".");



    }
}
