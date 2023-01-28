package Gun05;

import java.util.Scanner;

public class _01JavaScanner {
    public static void main(String[] args) {
        //tipi     adi     ilk degeri    islem tamam bu adimi calistir
        int        sayi     = 0         ;

        Scanner okuyucu = new Scanner(System.in) ;
        // tipi  adi      yeni okuyucu olustur diyoruz
        // (ilk degeri)(klavyeden (in sayesinde ) - konsoldan )

        // nasil kullaniriz ?

        System.out.println("Sayi giriniz = " ); // ne istedigini belli etmek icin sayi giriniz yazdk.
        sayi = okuyucu.nextInt() ; // kursor bekliyor sayi girisi  icin
        // rakam girilip enter a basildiginda degeri alip sayiya atiyor

        System.out.println("sayi = " + sayi);


    }
}
