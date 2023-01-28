package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //baklama dilimiz = if
        // girilen bir sayi 10 dan buyuk ise ekrana 10 dan buyuk yazdiriniz
        //algoristma
        //basla
        //sayioku sayi.oku.nextInt()
        //sayu>10 ise 10 dan buyuk yaz == if (sayi>10)sout ..
        // dur

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("sayi giriniz = ");
        int sayi = okuyucu.nextInt();

        if (sayi > 10){

            System.out.println("10 dan buyuk ");

        }

    }
}

