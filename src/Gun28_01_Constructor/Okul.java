package Gun28_01_Constructor;

public class Okul {
    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci(); // nesne olusma ani
//1.yol
        ogr1.id=1; // ozelliklerinin degerlerini veriyorum
        ogr1.adi="Furkan";
        ogr1.soyad="yildirim";
        ogr1.sinifi=3;
        System.out.println("ogr1.ad"+ogr1.adi);
        //2.yol
        Ogrenci ogr2= new Ogrenci(2,"Sueda","Yildirim",5);
        System.out.println("ogr2.ad"+ogr2.adi);

        // 3.yol
        Ogrenci ogr3= new Ogrenci(2,"ayse","bayrak");
    }
}
