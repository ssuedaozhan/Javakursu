package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayinin negatifmi , pozitifmi oldugunu yazdurn.
        // sifir ise sifir yazdirin

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        int sayi = okuyucu.nextInt();

        if (sayi>0) {
            System.out.println("pozitif");
        }
        if (sayi<0)
            System.out.println("negatif");
        if (sayi==0)
            System.out.println("sifir"); {

        }
    }
}
