package Gun36_06_Interface;

public class Kare extends Dikdortgen{
    @Override
    public double alan(double kenar) {
        return super.alan(kenar,kenar);
    }

    @Override
    public double cevre(double kenar) {
        return super.cevre(kenar,kenar);
    }
}
