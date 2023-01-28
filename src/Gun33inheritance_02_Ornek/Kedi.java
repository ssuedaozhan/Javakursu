package Gun33inheritance_02_Ornek;

public class Kedi extends Hayvan{
    public Kedi(String renk, String kilo, String cinsi) {
        super(renk, kilo, cinsi);

    }

    @Override
    public void konustu() {

        System.out.println("miyavvvvv");

    }
}
