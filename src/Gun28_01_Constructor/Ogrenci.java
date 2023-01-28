package Gun28_01_Constructor;

public class Ogrenci {
    int id;
    String adi;
    String soyad;
    int sinifi;
    public Ogrenci (){
        System.out.println("nesne olusturuldu");


    }
    public Ogrenci(int id ,String adi, String soyad,int sinifi){
        this.id=id;
        this.adi=adi;
        this.soyad=soyad;
        this.sinifi=sinifi;

    }
    public  Ogrenci(int id ,String adi,String soyad){
        this(id,adi,soyad,0); // this ogrenci m etodunun kendisi
        //  ogrenci yazamadigimiz icin this yaptik
    }

}
