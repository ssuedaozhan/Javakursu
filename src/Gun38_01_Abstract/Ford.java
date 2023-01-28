package Gun38_01_Abstract;

public class Ford extends  Binekoto implements IbinekOto{

    public Ford(String marka, int uretimyili, int vitesadedi) {
        super(marka, uretimyili, vitesadedi);
    }

    @Override
    public int hizlanmasuresi() {
        return 0;
    }
}
