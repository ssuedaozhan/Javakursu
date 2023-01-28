package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
          // kullanici 0 degeri girene kadar ,
        // girdigi sayilarin toplamini bulunuz.
        Scanner okuyucu= new Scanner(System.in);
        int sayi ;
        int toplam = 0 ;
        // bir oncekinin kisa yontemi

        do { // dongu arasi sart basta olmadigindan
            // en az 1 ez calisir , kontrol sonda
            System.out.println("sayi giriniz=");
            sayi= okuyucu.nextInt();

            toplam= toplam+sayi;


        }while (sayi !=0); // != anlami farkli esit 0 ise
        System.out.println("toplam = " + toplam);



    }
}
