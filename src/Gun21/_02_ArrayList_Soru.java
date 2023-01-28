package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // kullanicidan alacaginiz 6 elemanli bir dizinin
        // sadece tek sayi olan elemanlarini
        // ayri diziye(array list) atarak yazdiirn
        Scanner oku = new Scanner(System.in);
        int dizi[] = new int[6]; // sabit bi diziye 6 eleman alma

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Sayi=");
            dizi[i]= oku.nextInt();
        }
        System.out.println("dizi="+Arrays.toString(dizi));

        ArrayList<Integer>tekler= new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i]%2==1)
                tekler.add(dizi[i]);
        }
        System.out.println("tekler = " + tekler);
    }

}
