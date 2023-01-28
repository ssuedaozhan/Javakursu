package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // girilen bir sayinin birler basamaginin degerini yazi ile yazdiriniz.

        // 234 -> birler basmaagi = 4
        // 234% 4 = 4 = dort kalan
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Sayi giriniz =");
        int sayi = okuyucu.nextInt();

        int birlerbasamagi = sayi %10 ; // 4 u verir , cunku 10a bolumunden kalan

        // birler basamagi icin sayi % 10
        // onlar basamagi icn sayi / 10 % 10
        // yuzler basamagi icin sayi / 100
        switch (birlerbasamagi)
        {
            case 0 : System.out.println("sıfır"); break;
            case 1 : System.out.println("bir"); break;
            case 2 : System.out.println("iki"); break;
            case 3 : System.out.println("üç"); break;
            case 4 : System.out.println("dört"); break;
            case 5 : System.out.println("beş"); break;
            case 6 : System.out.println("altı"); break;
            case 7 : System.out.println("yedi"); break;
            case 8 : System.out.println("sekiz"); break;
            case 9 : System.out.println("dokuz"); break;
        }

        // Kural: bir sayıdan herhangi bir rakamı almak istiyorsan:
        // istediğin rakam sonda kalacak şekilde böl, sonrada modül 10 al


    }
}
