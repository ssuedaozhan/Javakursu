package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

       // 10 elemanli bir diziyi random (10dahil) olarak doldurktan sonra ,
        //kullanicinin girecegi bir rakami arattriniz
        //burakam var ise indexini yazdirin
        // math random da 1 fazlasini almaliyiz.

        int dizi []= new int[10];
        for (int i = 0; i < dizi.length; i++) {// 10 elemanli bir diziyi random 10 dahail olarak doldurduk

            dizi[i]= (int) (Math.random()*11);

        } // smdi ise :kullanicinin girecegi bir rakami arattriniz
        System.out.println(Arrays.toString(dizi));

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("aranacak sayi(0-10) =");
        int arananrakam= okuyucu.nextInt(); //

        for (int i = 0; i < dizi.length; i++) { //kullaninin girecegi bir rakami arattircaz.


            if (dizi[i]== arananrakam)
                System.out.println("var ora numarasi="+i+".indexde");
        }

    }
}


