package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        //Kullanicidan adini ve soyadini ayri ayri okutarak alip birlikte ekrana yazdiriniz .

        Scanner okuyucu = new Scanner(System.in) ; // sistemi tanittim

        System.out.println("Adiniz =");
        String ad=okuyucu.next() ;

        System.out.println("soyadiniz");
        String soyad = okuyucu.next();

        System.out.println("birlesik= " + ad +" "+soyad);







    }
}
