package Gun26_01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // bir kamous programi icin assagidaki ozellikte bilgilerin kaydedilecegi classlar yaziniz .
        //okul:adi,muduradi,ucreti(double)-> tip
        // ogrenci : okulno, tamad,okulu-> tip

        // bu sekilde bir ogrenci tanimlayip butun bilgileri kendiniz atayip yazdirin.
        Ogrenci ogr = new Ogrenci();
        ogr.okulno=1;
        ogr.tamad= " sueda ozhan";

        //1.yontem
        ogr.okulu=new Okul();
        ogr.okulu.adi="LUMINA EGITIM KUURMLARI";
        ogr.okulu.muduradi="Furkan Yildirim";
        ogr.okulu.ucreti=50000;

        System.out.println("Okulno="+ogr.okulno);
        System.out.println("Ogrencinin ismi="+ogr.tamad);
        System.out.println("okul ad "+ogr.okulu.adi);
        System.out.println("Yakisikli Mudurumuz ="+ogr.okulu.muduradi);
        System.out.println("Yillik okul ucreti="+ ogr.okulu.ucreti);

    }
}
