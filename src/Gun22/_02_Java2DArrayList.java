package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
int sayi =5; // tek bir rakam tutabilen bir degisken
int [] dizi = new int[20]; // 20 adet sayi saklayabilen bir degisken ,uzunlugu sabit
int [][] tablo = new int[20][2]; // 20X2 lik sayi saklayabilen degisken , sabit uzunlu


        ArrayList<Integer>liste = new ArrayList<>();// istenildigi kadar sayi eklenebilen, uzunlugu degisken
        /*******************/

        // bir sinif bu sinif da 20 kisi var ve bunlarin 3 dersi olsun .
        // ogrencilerin bu 3 derste ait notlarini
        //nasil bir degiskende saklayabilirm.

        ArrayList <Integer> matnotlari= new ArrayList<>();
        ArrayList<Integer>fiziknotlari=new ArrayList<>();
        ArrayList<Integer>kimnotlari=new ArrayList<>();

        matnotlari.add(50);
        matnotlari.add(70);
        matnotlari.add(80);

        fiziknotlari.add(30);
        fiziknotlari.add(40);

        kimnotlari.add(60);
        kimnotlari.add(70);
        kimnotlari.add(80);
        kimnotlari.add(90);

        // peki , arraylistin arraylistini nasil yaparim , alt kume gibi .
        ArrayList < ArrayList<Integer> > notlarlistesi = new ArrayList<>(); // listelerin listesi
        notlarlistesi.add(matnotlari); // notlar listesi kumesine mat notlri ekleme , matuska gibi
        notlarlistesi.add(fiziknotlari);
        notlarlistesi.add(kimnotlari);
        notlarlistesi.get(0); // matnotlari
        int matbirnot= notlarlistesi.get(0).get(0); // mat notlari iicn get 0 yaptik , daha sonrasinda mat notun ilki icin tekrar get 0 yapiyoruz.
        System.out.println("matbirnot = " + matbirnot);

        notlarlistesi.get(1);
        int matikinot= notlarlistesi.get(1).get(1);
        System.out.println("matikinot = " + matikinot);
        // yikaridakinin yerine bir for dongusu kullanabiliriz .


        // for dongusu yukaridakinin aynisidir fakat for dongusu daha kolay dongu oldugu icin .
        for (int i = 0; i < notlarlistesi.size(); i++) { // 0,1,2 size bana satirlarin kac tane oldugunu sler
             System.out.println("notlarlistesi.get("+i+") = " + notlarlistesi.get(i));

            }

        // 2 tane for ile nasil yapardik ?
            // satir sutun yazdirma
            for (int i = 0; i < notlarlistesi.size(); i++) {
                    for (int j = 0; j < notlarlistesi.get(i).size(); j++) { //notlar [i].lenght : daha oncesindeki bu vardi
                            System.out.println(notlarlistesi.get(i).get(j)+"\t");//notlar [i][j]

                    }
                System.out.println();

            }
    }
}
