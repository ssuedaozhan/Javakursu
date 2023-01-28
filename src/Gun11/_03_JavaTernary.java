package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //kullanicinin girecegi sayinin tekmi ciftmi olduguunu yazdiriniz

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("sayi=");
        int sayi = okuyucu.nextInt();
        //normal yaptigimiz
        if (sayi% 2 == 0 )
            System.out.println("cift");
        else
            System.out.println("tek");

        String sonuc = (sayi % 2 ==0)? "cift" : "tek" ; // ? -> if : -> else
        System.out.println("sonuc = " + sonuc);

        System.out.println(((sayi % 2 == 0)? "cift" : "tek") );

    }
}
