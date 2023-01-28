package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int [] dizi = new int [10]; // bos default 0 olan
        int []dizi2 ={2,3,4,5,6,7,65,87};

        int [][] tablo = new int[2][3]; //2 satir row , 3 sutun column
        // bos default deger 0 2x3 kadar 6 adet sayi

        int [][] tablo2= {
                {2, 3, 4},// 0.satir
                {32, 43, 2} // 1.satir
                        } ;
        for (int satir= 0; satir < 2; satir++) {

            for (int sutun = 0; sutun < 3 ; sutun++) {
                System.out.print(tablo2[satir][sutun]+" ");
            }
            System.out.println();
        }
        }
    }

