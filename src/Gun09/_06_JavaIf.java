package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

        // girilen bir cumlede a harfinin gecip gecmedigini
        // bulunuz geciyor ise EVET , gecmiyor ise HAYIR yazdiriniz

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Girilen cumlede a harfi varmidir");
        String cumle = okuyucu.nextLine();// yada indexOf ile de olablir
        //1.YOL
        if (cumle.contains("a"))
            System.out.println("EVET");

        if (!cumle.contains("a")) // ! degilse demek
            System.out.println("HAYIR");
//2.YOL
        boolean varMi = cumle.contains("a") ;
        if (varMi== false)
            System.out.println("EVET");

        if (varMi==false)
            System.out.println("HAYIR");
    }
}
