package Gun31_04_Pizzasiparishatti;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Pizzasiparishatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do{
            // menu
            menu();
            secim = oku.nextInt();
            // scanner la secimi alalım
            // secilen pizza ArrayListe ekleyelim
         switch (secim){
                 case 1 : //small
                     Pizza small= new Pizza(PizzaSize.SMALL);
                     siparisler.add(small);
                 break;

                 case 2 : //medium
                 Pizza med= new Pizza(PizzaSize.MEDIUM);
             break;

                 case 3 : //large
                 Pizza larg=new Pizza(PizzaSize.LARGE);
                 siparisler.add(larg);
             break ;

                 case 4 : siparisyazdir(siparisler); // kactanr yazdirdigini burda yazdir bu metodla
                 break;
             // eğer 4 ü seçerse arraylist i bir metoda gönder
             // orada hangi pizzadan kaç sipariş verdiğini göster

}

        }while(secim <= 4);
    }

    public static void menu()
    {
        System.out.println("******** Pizza Menü *******");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al-Spiariş Göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seciminiz=");
    }
    public static void  siparisyazdir(ArrayList<Pizza>siparisler){
        int s =0 ;
        int m =0;
        int l=0;

        for (Pizza p:siparisler) {
            if (p.size==PizzaSize.SMALL) s++;
            else
                if (p.size==PizzaSize.MEDIUM) m++;
                else
                    if (p.size==PizzaSize.LARGE) l++;

        }
        System.out.println("*****SIPARISLERINIZ *******");
        System.out.println("small pizza count="+s);
        System.out.println("medium pizza count="+m);
        System.out.println("large pizza count="+l);


    }
}
