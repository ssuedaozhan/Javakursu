package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {


        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<Ogrenci> snf=new ArrayList<Ogrenci>();
        for (int i = 0; i <2 ; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Okul No = ");
            ogr.okulNo=okuInt.nextInt();
            System.out.print("Tam Adı = ");
            ogr.TamAd=okuStr.nextLine();
            System.out.print("Notu = ");
            ogr.Notu=okuInt.nextInt();

            snf.add(ogr);

        }
        bilgileriYaz(snf);
        ortalamaYaz(snf);
    }
    public static void bilgileriYaz(ArrayList<Ogrenci>sinif){
        for(Ogrenci ogr:sinif){
            System.out.println("ogr.okulNo = " + ogr.okulNo);
            System.out.println("ogr.TamAd = " + ogr.TamAd);
            System.out.println("ogr.Notu = " + ogr.Notu);
        }

    }
    public static void ortalamaYaz(ArrayList<Ogrenci>sinif){
        int toplam=0;
        for(Ogrenci ogr:sinif){
            toplam =toplam+ogr.Notu;

        }
        System.out.println("ort = "+(toplam/sinif.size()));

    }
}

