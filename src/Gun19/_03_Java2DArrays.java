package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        //gunun sorusu : 3x2 lik bir diziyi kullanicidan sayi alarak
        // doldurduktan sonra sadece tek elemanlarini tek boyutlu bir
        // bir diziyi atayiniz .
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int [][] tablo = new int [3][2];
        int     tekmik=0; // bu islem tekmik ve sayilari alabailmek icin

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.println("sayi giriniz=");
                tablo[i][j]=okuyucu.nextInt();

                if(tablo[i][j]%2 !=0)
                    tekmik++;
                
            }
        }
        int[]teklerdizisi=new int [tekmik]; //teklerin dizisi kadar bir dizi tanimlandi
        tekmik=0; // burasinin amaci : ustte buldugumuz tekleri atamak icin b
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo.length; j++) {

                if (tablo[i][j] % 2 != 0) {
                    teklerdizisi[tekmik] = tablo[i][j];
                    tekmik++;
                }

            }
            System.out.println(Arrays.toString(teklerdizisi)); // dizi elemanlarini konsolda gorunur hale geetirmek iciin

            }
                
            }
        }



