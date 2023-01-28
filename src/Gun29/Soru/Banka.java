package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {
        Musteri mus1= new Musteri();
        mus1.id=1;
        mus1.name="sueda";
        mus1.surname="ozhan";

        mus1.hesapp.parayatir(100);
        mus1.hesapp.parayatir(200);
        mus1.hesapp.paracek(50);
        System.out.println(mus1.hesapp);
    }
}

