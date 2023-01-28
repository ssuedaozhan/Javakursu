package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // girilen 2 tam sayiyi kullanicidan aldiktan sonra
        // toplama icin t , cikarma icin C , Carpma icin P , bolme icin B
        // harflerini  yine kullanicidan alarak istege uygun olan islemi yaptirip sonucu yazidirn
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("1.SAYI");
        int sayi1 = okuyucu.nextInt();

        System.out.println("2.SAYI");
        int sayi2= okuyucu.nextInt();

        System.out.println("toplama icin T");
        System.out.println(" cikarma icin C");
        System.out.println("carpma icin P ");
        System.out.println("bolme icin B");

        System.out.println("seciminiz");
        Scanner okustr = new Scanner(System.in);

        String secim = okustr.next();
         // merdivenli if , ladder if
        if (secim.equalsIgnoreCase("T"))
            System.out.println("topla= "+(sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("C"))
                System.out.println("farki ="+(sayi1-sayi2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("Carpimi="+(sayi1*sayi2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.println("Bolumu="+(sayi1/ sayi2));
                    else
                        System.out.println("Yanlis secim");










    }
}
