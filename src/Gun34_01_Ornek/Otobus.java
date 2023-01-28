package Gun34_01_Ornek;

public class Otobus extends Arac{
    private int yolcukapasitesi;
    public Otobus(String renk, double motorhacmi, String marka, int yolcukapasitesi) {
        super(renk, motorhacmi, marka);
        this.yolcukapasitesi=yolcukapasitesi;



    }

    public int getYolcukapasitesi() {
        return yolcukapasitesi;
    }

    public void setYolcukapasitesi(int yolcukapasitesi) {
        this.yolcukapasitesi = yolcukapasitesi;
    }
}
