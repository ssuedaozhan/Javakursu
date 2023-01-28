package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

        // girilen bir stringin sadece son harfini yazdiriniz . yani
        // (giriline bir cumlenin son harfini veriniz )
        Scanner okuyucu = new Scanner(System.in);

        System.out.println("Bir cumle giriniz");
        String cumle= okuyucu.nextLine();
        // 01234 = haflerin oda numaralari : index
        // son harfin oda numarasini bulmam lazim

        //bugun = son harfin oda numarasi uzunlugun bir eksigi -1

        int uzunluk=cumle.length();
        char sonharf = cumle.charAt(uzunluk-1);
        System.out.println("sonharf = " + sonharf);






    }
}
