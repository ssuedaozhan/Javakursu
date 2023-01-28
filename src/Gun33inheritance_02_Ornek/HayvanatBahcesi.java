package Gun33inheritance_02_Ornek;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.(ses cikar)

        Kopek kopke1 = new Kopek("beyaz", "50", "kangal") ;
        kopke1.konustu(); // sadece ses cikardi dio ama havladi demek istiom
        Kedi kedi1 = new Kedi("siyah","3","tekir");
        kedi1.konustu(); // kopkeninkini kullanmaz , normalden alir . ses cikardi yazdi
        Ordek ordek1= new Ordek("siyah","3","govel",90);
    }
}
