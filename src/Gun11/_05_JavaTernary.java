package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // soru : girilen bir sayinin sifirmi negatifmi , pozitif mi oldugunu
        // ternary operator ile yazdiriniz.

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("sayi=");
        int sayi = okuyucu.nextInt();

        System.out.println(sayi== 0 ? "sifir": (sayi >0 ? "poz" : "neg"));



    }
}
