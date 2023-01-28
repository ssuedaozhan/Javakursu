package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        Scanner okuyucu = new Scanner(System.in) ;

        // Kullanicidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz .

        System.out.print("sayi1= ");
        int sayi1 = okuyucu.nextInt();

        System.out.print("sayi2= ");
        int sayi2 = okuyucu.nextInt();



        int toplam = sayi1 + sayi2 ;
        System.out.println("toplam=" + toplam )  ;

        int carpim = sayi1*sayi2;
        System.out.println("carpim = " + carpim);



    }
}
