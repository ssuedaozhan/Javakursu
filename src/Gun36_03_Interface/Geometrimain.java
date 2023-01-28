package Gun36_03_Interface;

public class Geometrimain {
    public static void main(String[] args) {
        Cember c = new Cember();
        c.ciz(); // cember cizildi

        Dikdortgen d = new Dikdortgen();
        d.ciz(); // dikdortgen cizildi
        // interfacelerden nesne uretileme fakat referans tipi
        // olusturulabilir . bu bize polymorphism sagladi .

        Icizdirir c2 = new Cember();
        c2.ciz(); // cember cizildi
        // direk olarak sadece interface deki
        //ismi verilmis olanlar metodlara erisirisn
        cizdirme(c);
        cizdirme(d);

    }
    public static void cizdirme (Icizdirir iciz){

        iciz.ciz();
    }
}
