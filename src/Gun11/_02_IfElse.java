package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("saat giriniz =");
        int saat = okuyucu.nextInt();

        if (saat>0 && saat<3)
            System.out.println("10tl");
        else

        if (saat>0 && saat<5)
            System.out.println("15tl");

        if (saat>0 && saat>5)
            System.out.println("20tl");




    }
}
