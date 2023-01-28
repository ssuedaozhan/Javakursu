package Gun29._Privaterisim_;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan();
        cal1.id=1;
        cal1.name="ismet";
        cal1.surname="temur";
        // cal1.password="1234"
        // ama private olursa kedni paketinden biel cagiramzz

        cal1.sifreata("1234");
        cal1.sifreata("M1345_sd422");
// sotvsifre yazdir s=diyemiyoruz cunku sifre alanmiz pravite oldugu icin yapamiyoruz.
        cal1.sifregoster();
    }


}
