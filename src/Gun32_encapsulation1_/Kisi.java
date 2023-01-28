package Gun32_encapsulation1_;

public class Kisi {
    String ad ;
    String soyad;
    private  int yas ; // kimse ellemesin ,
    // kullanici kafasina gore yas atayamssin die
    void yasAta(int yas){
        if (yas>0&& yas <150)
            this.yas=yas;
        else
            System.out.println("hatali yas ");
// bu konunun ozelligi korumaya alma , kapsulleme , yani suzgecten geciriyor ,
// onemli kisimleri , 25 0 dan buyuk olma kurali gibi ..
    }

    int yasver(){
        return  this.yas;

    }
    void setSoyad(String soyad){
        if (soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("hatali soyad");
    }
    String getSoyad(){
        return  this.soyad;
    }
   void setAd(String ad){
        if (ad.length()<25)
            this.ad=ad;
        else
            System.out.println("hatali ad ");
   }
   String getAd(){
        return this.ad;
   }


    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
