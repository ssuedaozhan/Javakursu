package Gun26_03_Ornek;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.
        // (properties, fields, özellik, eleman, items) : width, length
        // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
        // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.
Rectangle r = new Rectangle();
r.lenght=5;
r.width=4;

r.Cevre();
r.Alan();

        System.out.println("alan" +r.lenght*r.width);

        System.out.println("cevre"+2*(r.lenght+r.width));


    }
}

