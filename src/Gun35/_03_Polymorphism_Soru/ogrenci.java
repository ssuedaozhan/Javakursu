package Gun35._03_Polymorphism_Soru;

public class ogrenci extends Kisi{
    private  String subesi;
    public ogrenci(String ad, String soyad, String gorev,String subesi) {
        super(ad, soyad, gorev);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "subesi='" + subesi + '\'' +
                '}';
    }
}
