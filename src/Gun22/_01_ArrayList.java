package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>rakamlar=new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(423);
        rakamlar.add(532);
        rakamlar.add(32);

        System.out.println("rakamlar = " + rakamlar);
        // siralama islemi

        Collections.sort(rakamlar); // arraylsletri siralar , kucukten buyuge.
        System.out.println("rakamlar = " + rakamlar);

        // Tersine cevir
        Collections.reverse(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        // max ve min eleman bulma
        System.out.println("Max()="+Collections.max(rakamlar));
        System.out.println("min()="+Collections.min(rakamlar));

        // butun elemanlari set etme
        Collections.fill(rakamlar,0);
        System.out.println("rakamlar = " + rakamlar); // yani hepsii 0 oldu

        // replace
        Collections.replaceAll(rakamlar,0,5);
        System.out.println("rakamlar = " + rakamlar); // 0 lara 5 atadi

       // tanimlarken deger atama
        int []dizi = {2,3,4,5};
        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(3,4,5,6));
        ArrayList<String>strListe= new ArrayList<>(Arrays.asList("furkani ", "cok","seviyorum")); // string yaptik
        System.out.println("strListe = " + strListe);

        ArrayList<Integer>list2=new ArrayList<>();
        Collections.addAll(list2,2,4,5,6,7);
        System.out.println("list2 = " + list2);

        //diziyi direk arrayloste nasil atarim ?
        Integer[]dizi2= {2,3,4,5};
        ArrayList<Integer>List3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("List3 = " + List3);

    }


}
