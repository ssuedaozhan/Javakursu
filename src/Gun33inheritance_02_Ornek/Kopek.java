package Gun33inheritance_02_Ornek;

public class Kopek extends Hayvan{
    // digerinde constructor oldugu icin bunada olusturduk.
    public Kopek(String renk, String kilo, String cinsi) {

        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("havladi");
    }
}

