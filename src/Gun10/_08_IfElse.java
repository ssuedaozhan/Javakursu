package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123


        Scanner oku = new Scanner(System.in);
        System.out.print("Sayıları 1 bosluk bırakarak giriniz=");
        String sayilar = oku.nextLine();

        int boslukIndex = sayilar.indexOf(" ");//0
        int sonboslukIndex= sayilar.lastIndexOf (" ");//5



        String Sayi1=sayilar.substring(0,boslukIndex);
        String Sayi2=sayilar.substring(boslukIndex +1,sonboslukIndex );
        String Sayi3 =sayilar.substring(sonboslukIndex+1);



        int strSayi1 = Integer.parseInt(Sayi1);
        int strSayi2 = Integer.parseInt(Sayi2);
        int strSayi3 = Integer.parseInt(Sayi3);

        int toplam = strSayi3 + strSayi1 + strSayi2;
        System.out.println("toplam = " + toplam);

        if (toplam % 2 == 0)
            System.out.println("Cift");

        else
            System.out.println("tek");
    }
}


