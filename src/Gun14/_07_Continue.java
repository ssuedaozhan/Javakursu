package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        //kullanicidan 5 sayi isteyiniz.
        // bu sayilardan 6 ile 10 ara sindakileri haric , digerleri toplasin.
        Scanner okuyucu = new Scanner(System.in);
        int toplam = 0 ;
        for (int i =0 ; i <5 ; i++)
        {
            System.out.println("BIR sayi giriniz=");
            int sayi = okuyucu.nextInt();
            {
                if (sayi>=6 && sayi<=10)
                    continue;// calistigi anda endisinden sonra gelen komutlari pass gecer , es gecer .

                toplam= toplam+sayi;
                System.out.println("toplam = " + toplam);

            }
        }
    }
}
