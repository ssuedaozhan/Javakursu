package Gun39._05_OOP_Soru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        List<Ifood> siparisler = new ArrayList<>(); //arraylist ifood seklinde olmali
        Scanner oku = new Scanner(System.in);
        int secim = 0;

        do {
            menu();
            secim= oku.nextInt();
            switch (secim)
            {// ifood yaparak interfaceden aldik .
                case 1: Ifood ak = new adanakebabp();
                siparisler.add(ak);
                break;

                case 2: Ifood Lah= new Lahmacun();
                siparisler.add(Lah);
                break;

                case 3 : Ifood pal= new Palov();
                siparisler.add(pal);
                break;

                case 4 :  Ifood bos= new Borsh();
                siparisler.add(bos);
                break;

            }

        }while (secim<5);

        System.out.println("Alinan Siparisler");

        for (Ifood f : siparisler){
            System.out.println(f.getClass().getSimpleName());

        }
        System.out.println("Siparisiniz hazirlaniyor.. ");
        Myfunc.Bekle(2);

        double toplam = 0 ;
        for (Ifood f : siparisler){
            Technokitchen.hazirla(f);
            toplam+= f.ucret();
            Myfunc.Bekle(2);
        }

        }

public static void menu (){
    System.out.println("*****Menu******"+
            "\n1-Adana Kebap (75 TL)"+
            "\n2-Lahmacun(20 TL)"+
            "\n3-Borsh(40 TL)"+
            "\n4-Palov(20 TL)"+
            "\n5-Tamam"+
            "\nSeciminiz=");
}


}
