package Gun18;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        //2 ye 3luk tabloyu random 100 e kadar sayilarl doldurun
        // butun dooldurma islerimi bittikten sonra yazdirin
        // ve kac tane tek sayi oldugunu bulun.

        int [][] tablo = new int  [2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                tablo [2][3]= (int) (Math.random()*100);

            }
            }
        int tekmiktar=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablo[i][j]+"\t");
                if (tablo [i][j]%2==1)
                    tekmiktar++;




            }
            System.out.println();

        }
        System.out.println("tekmiktar = " + tekmiktar);
        }





    }


