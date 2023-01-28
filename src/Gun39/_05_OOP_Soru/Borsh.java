package Gun39._05_OOP_Soru;

public class Borsh implements Ifood {
    @Override
    public void teste() {
        System.out.println("Sicak sebze corbasi ");
    }

    @Override
    public double ucret() {
        return 40;

    }
    void boil (){
        System.out.println("Kisik ateste kaynatiliyor");
    }
    void eattomorrow(){
        System.out.println("bir gun sonra servis edilir .");
    }
}
