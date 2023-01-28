package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("red");
        renkler.add("green");
        renkler.add("blue");
        renkler.add("red");
        renkler.add("RED");
        // ekran yazdirma
        System.out.println("renkler = " + renkler);
// ekrana nasi tek tek nasil yazdirirm ?

        for (String eleman : renkler) { // sira garanti degil .
            System.out.println("eleman = " + eleman);
        }
        // int [] dizi = {32,43,34,24,3345,4323};
        //for (int sayi :dizi)
        // {// System.out.println("sayi = " + sayi);//



    // set in kendi sırası nasıl ise onun aynısını verir
    Iterator gosterge= renkler.iterator();
        while (gosterge.hasNext()) // has next nedemek : sıradaki eleman var ise
    { // sinir belli degil ise while kunaaniriz , belli olsaydi foreach


        System.out.println("gosterdiği eleman = " + gosterge.next());
        // .Next gostergenin gösterdiği elemanı temsil ediyor
    }

        }
    }

