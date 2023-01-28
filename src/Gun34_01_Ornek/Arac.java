package Gun34_01_Ornek;

public class Arac {
    String renk ;
    double motorhacmi ;
    String marka ;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotorhacmi() {
        return motorhacmi;
    }

    public void setMotorhacmi(double motorhacmi) {
        this.motorhacmi = motorhacmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motorhacmi=" + motorhacmi +
                ", marka='" + marka + '\'' +
                '}';
    }

    public Arac(String renk, double motorhacmi, String marka) {
        this.renk = renk;
        this.motorhacmi = motorhacmi;
        this.marka = marka;

    }
}
