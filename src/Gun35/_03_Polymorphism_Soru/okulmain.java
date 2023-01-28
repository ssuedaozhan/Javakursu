package Gun35._03_Polymorphism_Soru;

public class okulmain {
    public static void main(String[] args) {
        ogrenci ogr = new ogrenci("Ayse","Yilmaz","ogrenci","5a");
        calisan cal = new calisan("ali","yilmaz","yazilim","bim");

       // System.out.println("cal = " + cal);
        //System.out.println("ogr = " + ogr);
        //herbir class kendi tostringini kullnaiyo
        // buyuzden soutv tek olabilecek  metod degildir bu

       Kisi.kimlikyaz(ogr);
       Kisi.kimlikyaz(cal);

        }
    }


