package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //soru : girilen bir sayi 50 den buyuk ise 1 , degilse 0 degerini ekrana yazdiriniz.
        // ternary operator ile yapiniz.


        Scanner okuyucu = new Scanner(System.in);
        System.out.println("sayi=");
        int sayi = okuyucu.nextInt();

        
        String sonuc = (sayi > 50  )? "1" : "0" ; // ? -> if : -> else
        System.out.println("sonuc = " + sonuc);


        System.out.println(((sayi > 50  )? "1" : "0") );
    }
}
