package Gun30._01_StaticVariables_02_Finaldegiskenler.Ornek2;

public class Sabitler {
    final static int birgundekisaat = 24;
    final static int birsaatdekidakika = 60;
    final static int birdakikadakisaniye = 60;

    public static int hesapla(int gun, int saat, int dakika) {
        int toplamsaniye=
        gun
                *birgundekisaat
                *birsaatdekidakika
                *birdakikadakisaniye
                +
                saat
                *birsaatdekidakika
                *birdakikadakisaniye
                +
                dakika
                *birdakikadakisaniye;
        return toplamsaniye;
    }
}

