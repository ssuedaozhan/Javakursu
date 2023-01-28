package Gun35._03_Polymorphism_Soru;

public class Kisi {
    private String ad ;
    private String soyad ;
    private String gorev; ;

    public Kisi(String ad, String soyad, String gorev) {
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorev='" + gorev + '\'' +
                '}';
    }
    public static  void kimlikyaz(Kisi gelenkisi){
        System.out.println("*********Kimlik Belgeniz********");
        System.out.println("ad="+gelenkisi.getAd());
        System.out.println("soyad="+gelenkisi.getSoyad());
        System.out.println("gorevi="+gelenkisi.getGorev());

        if (gelenkisi instanceof ogrenci)
            System.out.println("Subesi="+((ogrenci) gelenkisi).getSubesi());
        else
            if ( gelenkisi instanceof  calisan)
                System.out.println("departmani="+((calisan)gelenkisi).getDepartmani());

    }
}
