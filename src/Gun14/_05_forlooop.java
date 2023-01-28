package Gun14;

import java.util.Scanner;

public class _05_forlooop {
        public static void main(String[] args) {
        // sorunun 2. bolumu : carpimin degeri 10000u gectiginde islem sonlansin
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("sayi giriniz= ");
        int sinirsayi = okuyucu.nextInt();

        double carpim = 1;

        for (int i = 1; i <= sinirsayi; i++) {
            carpim = carpim * i;

            if (carpim>= 10000)
                break;
            System.out.println("islem sonlandirilmistir");

        }
        System.out.println("carpim = " + carpim);

    }
}
