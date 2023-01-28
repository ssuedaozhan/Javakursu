package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in) ;// okuma islemini yapacak olna degisken tanimlandi

        System.out.print("Adiniz ve soyadiniz=");// ekrana neyin girilecegini yazdik bilgilendirme

        String adSoyad = okuyucu.nextLine(); // okuma islemini bu noktada yapiliyor . hepsi
        System.out.println("adSoyad = " + adSoyad); // verinin gercekten okunabildigini
        // yazarak kontrol ettim



    }
}
