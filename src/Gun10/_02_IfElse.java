package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        // 2 tane sınav oldun. topla 2 ye böl (ortalaması)
        // final kelimesi java ya ait kelime
        Scanner okuyucu= new Scanner(System.in);
        System.out.println("vize notu giriniz=");
        int vizenot= okuyucu.nextInt();
        System.out.println("vizenot = " + vizenot);

        System.out.println("final notu giriniz");
        int finalnot = okuyucu.nextInt();
        System.out.println("finalnot = " + finalnot);

        int ortalama = (finalnot+vizenot)/ 2 ;
        System.out.println("ortalama = " + ortalama);
        if (ortalama>= 60)
        System.out.println("Gectiniz  tebrikler");
        else
            System.out.println("butunlemeye kaldiniz");



        // Süslü parantez kuralı:  sadece 1 satır(;) çalışacak ise zorunlu değil,
        // birden fazla ise zorunlu. Her zaman koyulabilir, hiç bir mahsuru yok

    }
}