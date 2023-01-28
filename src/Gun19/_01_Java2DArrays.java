package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int [][] tablo={ // 2 satir 3 sutun
                {3,5,67},
                {234,34,32}


        }; //2 satir 3 sutun
        System.out.println("satir uzunlugu="+tablo.length);//2// satir uzunlugu
        System.out.println("0. satirin sutun  uzunlugu ="+tablo[0].length);// //2// sutun uzunlugu
        System.out.println("1.satirin sutun uzunlugu="+tablo[1].length);//3//sutun uuznlugu

        for (int i = 0; i < tablo.length; i++) { //satir sayisi

            //ilgili satirdaki sutun uzunlugu
            for (int j = 0; j < tablo.length; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
