package Gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        //kullanici 0 degeri girene kadar girdigi sayilarin
        // toplamini bulunuz .

        Scanner okuyucu = new Scanner(System.in);
        int sayi ;
        int toplam = 0 ;

        System.out.println("sayi giriniz");
        sayi= okuyucu.nextInt();
        toplam= toplam+sayi;

        while (sayi != 0 )
        {
            System.out.println("Sayi giriniz=");
            sayi= okuyucu.nextInt();

            toplam= toplam+sayi;

        }

        System.out.println("toplam = " + toplam);
        }


    }

