package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // girilen 5 sayinin toplaminin sonucunu yazdiriniz
        Scanner okuyucu = new Scanner(System.in);


      int sayac =1;
      int toplam = 0;
        while (sayac <= 5)
        {
            System.out.println("sayi giriniz");
            int sayi = okuyucu.nextInt();
            toplam= toplam+sayi;
            sayac++; // sayac = saya+1

        }
        System.out.println("proram bitti");

        System.out.println("toplam = " + toplam);
    }

}
