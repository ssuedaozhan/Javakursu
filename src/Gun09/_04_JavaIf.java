package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = okuyucu.nextInt();

        if (sayi%2 !=0) // 1 veya -1
        System.out.println("tek");

        if (sayi%2 ==0)
            System.out.println("cift");

         // tek mi cift mi nasil anlasilir ?
        // mantiken sonuna bakariz 1 oldugu icin yani tek

    }
}
