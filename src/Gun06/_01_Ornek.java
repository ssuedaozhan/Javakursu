package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        //kullanicidan cadde , sokak , postakodu(int), ve ulke seklinde adres bilgisi olarak yaziniz.


        Scanner okuStr = new Scanner(System.in); // string okumalarina yap
        Scanner okuInt = new Scanner(System.in); // int okumalri icin


        System.out.println("cadde=");
        String cadde = okuStr.nextLine();

        System.out.println("sokak= ");
        String sokak = okuStr .nextLine();

        System.out.println("posta kodu=");
        int postakodu= okuInt.nextInt();

        System.out.println("ulke=");
        String ulke = okuStr.nextLine();

        System.out.println("adres=" +cadde+ sokak+postakodu+ulke);



    }
}
