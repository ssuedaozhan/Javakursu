package Gun36_06_Interface;

public abstract class Dikdortgen implements ISekil{


    @Override
    public double alan(double kisaKenar, double uzunKenar) {
        return kisaKenar*uzunKenar;
    }

    @Override
    public double cevre(double kisaKenar, double uzunKenar) {
        return (kisaKenar+uzunKenar)*2;
    }

    public abstract double alan(double kenar);

    public abstract double cevre(double kenar);
}
