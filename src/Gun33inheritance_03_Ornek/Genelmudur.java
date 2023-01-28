package Gun33inheritance_03_Ornek;

public class Genelmudur extends Calisan{

    private double tazminat;

    public Genelmudur(String isim, double maas, int maaskatsayisi,double tazminat) {
        super(isim, maas, maaskatsayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "Genelmudur{" +
                "isim"+ getIsim()+
                "maas"+ getMaas()+
                "maaskatsayisi"+getMaaskatsayisi()+
                "tazminat=" + tazminat +
                "odenecek maas"+ maasHesapla()+
                '}';
    }
}


