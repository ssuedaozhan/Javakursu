package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //kullanicin girecegi 2 sayinin birbirine esit olup olmadigini  yazdiriniz

        Scanner okuyucu= new Scanner(System.in);


        System.out.print("sayi1= ");
        int sayi1 = okuyucu.nextInt();

        System.out.print("sayi2= ");
        int sayi2 = okuyucu.nextInt();

        System.out.println("sayi1 ve sayi2  esit mi ?  ="+ (sayi1==sayi2));


    }
}
