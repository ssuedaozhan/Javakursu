package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        Scanner okuyucu = new Scanner(System.in);
        //girilen 20 sayidan sadece pozitif
        // olanlarin toplamini bulun.

        int sayac =1;
        int toplam = 0;
        while (sayac <= 5)
        {
            System.out.println("sayi giriniz");
           int sayi = okuyucu.nextInt();
           if (sayi>0)
            toplam = toplam +sayi;
            sayac++; // sayac = sayac+1


        }
        System.out.println("proram bitti");

        System.out.println("toplam = " + toplam);


    }
}
