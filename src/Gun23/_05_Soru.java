package Gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elemanli bir diziyi random 10 (dahil) kadar olan sayilarla
        // doldurun
        // tekrarli degerli degerleri olmayscak sekilde yeni bir diziye atayiniz.

        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);

        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        // 1.yontem
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < dizi.length; i++) {
            hs.add(dizi[i]);

        }
        System.out.println("hs = " + hs);



    }
}
