package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // girilen bir sayiyi pozitif,megatif veya sifi roldugunu yazdiriniz.

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        int sayilar = okuyucu.nextInt();
        
        if (sayilar>0)
            System.out.println("pozitif");
        else
            if (sayilar<0)
                System.out.println("negatif");

            if (sayilar==0)
                System.out.println("sifir");




    }
}
