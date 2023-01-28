package Gun09;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //girilen iki sayidan buyuk olanini degerini ekrana yazdiriniz
        // esit ise esit yazdiriniz .

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Sayi 1 = ");
        int sayi1 = okuyucu.nextInt();

        System.out.println("Sayi 2 =");
        int sayi2 = okuyucu.nextInt();

        if (sayi1 > sayi2)
            System.out.println("Sayi 1 buyuktur" + sayi1);

        if (sayi1 < sayi2){
            System.out.println("sayi 2 buyuktur " + sayi2);

    }
        if (sayi1== sayi2)
            System.out.println("sayi 1 sayi2 esittir");
    }
}