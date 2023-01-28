package Gun33inheritance_02_Ornek;

public class Ordek extends Hayvan{
   private int kanatacikligi;

    public Ordek(String renk, String kilo, String cinsi, int kanatacikligi) {
        super(renk, kilo, cinsi);
        this.kanatacikligi=kanatacikligi; //extra proportesi boyle ekleriz.

    }

    public int getKanatacikligi() {
        return kanatacikligi;
    }

    @Override
    public void konustu() {
        System.out.println("vakvakkk");
    }

    public void setKanatacikligi(int kanatacikligi) {
        this.kanatacikligi = kanatacikligi;
    }
}

