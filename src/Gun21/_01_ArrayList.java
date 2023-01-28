package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
     // dizi array ; boyut sayisi belli , sonradan degistirelemez
     int [] dizi = new int[5]; // aaray 5 elemanli boyutu sonradan degistirelmiyor .

           // boyutu dinamik olsun , eleman ekledikce uzasin , sildikce kisalsin
          // buna arraylist deriz.
         //  boyutunu basta vermemize gerek yok , boyutu baslangicta 0
        // eleman ekledikce artar , sildikce kisalir .
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<Integer> stringList = new ArrayList<>();
        ArrayList<Integer> doubleList = new ArrayList<>();

        ArrayList<String> Isimler = new ArrayList<>();
        System.out.println("Isimler = " + Isimler);
        Isimler.add("Ahmet"); // uzunluk 1
        Isimler.add("furkan"); // uzunluk 1
        Isimler.add("faruk"); // uzunluk 1
        Isimler.add("sueda"); // uzunluk 1

        System.out.println("Isimler = " + Isimler);
        System.out.println("Isimler.size()="+Isimler.size()); // bize kac isim birdigimii  verir ADICA : 4

        Isimler.add(1,"Muhammed"); // verilen indexe e ekliyoruz , digerleri 1 kayiyor sonra dogru
        System.out.println("Isimler = " + Isimler);

        Isimler.set(1,"Zafer"); // verilen indexteki elemani degistirir // YANI :USTTEKI  MUHEMMED GIDER ZAFER GELIR
       System.out.println("Isimler = " + Isimler);

       boolean varMi= Isimler.contains("Furkan") ;// varmi
       System.out.println("varMi = " + varMi);

       Isimler.remove("Sueda"); // degere gore siler
       System.out.println("Isimler = " + Isimler);

       Isimler.remove(1); // rama verildiginde index kabul edi  yor ve ona gore siliyor
       System.out.println("Isimler = " + Isimler);

       int  indexofsueda= Isimler.indexOf("sueda");
        System.out.println("indexofsueda = " + indexofsueda);

        String ilkelaman = Isimler.get(0); // verilen indexteki degeri verir
        System.out.println("ilkelaman = " + ilkelaman);

        Isimler.clear(); // herseyi temizlior
        System.out.println("Isimler = " + Isimler);
    }
}
