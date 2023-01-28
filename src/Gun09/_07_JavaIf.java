package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        //girilen bir cumledeki kucuk veya buyuk a harfinin
        // olup olmadigini yazdiriniz .
        // Var ve yok seklinde

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("bir cumledeki kucuk veya buyuk a harfi");
        String cumle = okuyucu.nextLine();

        cumle= cumle.toLowerCase(); // butun buyuk harfler kucuk oldu
        if (cumle.contains("a"))
            System.out.println("EVET");

        if (cumle.contains("a"))
            System.out.println("HAYIR");

        if (cumle.contains("A"))
            System.out.println("EVET");

        if (cumle.contains("A"))
            System.out.println("HAYIR");

    }


}
