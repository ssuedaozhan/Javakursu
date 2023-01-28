package Gun09;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {

        // kullanicinin 2 kez girecegi sifresinin ayni oldugunu
        // AYNI veya DEGIL seklinde cevaplayiniz (confirm new password)

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("sifreniz=");
        String sifre = okuyucu.nextLine();

        System.out.println("sifeniz tekrar=");
        String sifreTekrar = okuyucu.nextLine();
        boolean ayniMi = sifre.equals(sifreTekrar);

        if (ayniMi==true)
            System.out.println("AYNI");

        if (ayniMi==false)
        System.out.println("DEGIL");

        // 2.yontem
        if (sifre.equals(sifreTekrar)==true)
            System.out.println("sifreTekrar");

        if (sifre != sifreTekrar)
            System.out.println("DEGIL");

    }
}
