package Gun19;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.Arrays;

public class _08_JavaMethod {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.

        int [] dizi = new int[20];
        for (int i = 0; i <= 20; i++) {



            yenifonksoyon(dizi);

        }
    }
    public static void yenifonksoyon(int []sayi){
        for (int i = 0; i < 20; i++) {
            int dizi = (int)(Math.random()*101);

            System.out.println("dizi="+Arrays.toString(sayi));
        }

    }


}

