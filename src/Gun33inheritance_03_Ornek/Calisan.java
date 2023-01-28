package Gun33inheritance_03_Ornek;

public class Calisan {
    private String isim ;
    private double maas ;
    private int maaskatsayisi;


    public  double maasHesapla(){
        return maas*maaskatsayisi;
    }

    public Calisan(String isim, double maas, int maaskatsayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaaskatsayisi(maaskatsayisi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getMaaskatsayisi() {
        return maaskatsayisi;
    }

    public void setMaaskatsayisi(int maaskatsayisi) {
        this.maaskatsayisi = maaskatsayisi;

    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maaskatsayisi=" + maaskatsayisi +
                '}';
    }
}
