package Gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 luk  bir tabloyu kullanicidan sayi olarak doldurun
        // daha sonra ayri bir dongu de en buyuk sayiyi bulunuz.

        Scanner okuyucu = new Scanner(System.in);
        int[][] tablo = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("sayi giriniz=");
                tablo[i][j]= okuyucu.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(tablo[i][j]+"\t");
            }
            System.out.println();
        }
        int enb = tablo[0][0]; // deger degil , oda numarasi gibi
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablo[i][j]>enb)
                    enb=tablo[i][j];
               // System.out.println("enb = " + enb); en buyugunu bole vermez
            }
            System.out.println("enb = " + enb);
        }

    }
}
