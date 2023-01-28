package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanicinin girecegi bir rakama kadar olan sayilarin toplmaii bulunuz.
        Scanner okuyucu = new Scanner(System.in);
        int i = 1 ;
        int toplam =0 ;
        System.out.println("sayi giriniz");

        int girilensayi = okuyucu.nextInt();

        for (i=1; i<=girilensayi; i++)
            toplam= toplam+i;

        System.out.println("toplam = " + toplam);
        }



    }

