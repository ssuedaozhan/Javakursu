package Gun35._03_Polymorphism_Soru;

public class calisan extends Kisi{
    private  String departmani ;

    public calisan(String ad, String soyad, String gorev,String departmani) {
        super(ad, soyad, gorev);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return
               departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    @Override
    public String toString() {
        return "calisan{" +
                "departmani='" + departmani + '\'' +
                '}';
    }
}
