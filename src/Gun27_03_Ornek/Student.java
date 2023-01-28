package Gun27_03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersekle(Lesson ders) { // propertiesleri kullandigi icin nesnedir
        int suAnToplamSaat = 0;
        for (Lesson d : dersleri)
            suAnToplamSaat += d.saat;

        if (suAnToplamSaat + ders.saat <= maxSaat)
            dersleri.add(ders);
        else
            System.out.println(ders.name + ": Kredi sınırı aşıldı");

    }

    public void dersleriYazdir() {
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın " + name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d : dersleri)
            System.out.println(d.name + " " + d.saat+d.saat);

    }
    public static void universitekurallari(){
        System.out.println("KURAL1 :caysiz ve uzumsuz derse gelme");
        System.out.println("KURAL 2: uykunu mutlaka al ");
        System.out.println("Kural3 : Herzaman dinç dinamik ol");
        System.out.println("Kural4 : Başta verdiğini kararı UNUTMA!");
        System.out.println("Kural5 : Biz imkansızlıkları, inş aşacağız");
    }
}
