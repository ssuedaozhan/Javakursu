package Gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        //sayilari birbirine cevirdik
        // ama bir de yazilarin rakamlara cevrilmesi , rakamlarin yaziya cevrilmesi vardir , ornek :

        String ad = "ismet" ;
        String kelimeSayi = "65" ;  // gorunumu sayi olmali , int olarak sayi karsiligi yok .
        // sadece yazmak icin kullanabilirimstring halde toplama gibi bir isleme giremez ;
        // toplamamamiz gerekirse cevirecegiz , yani :
        int sayiDeger = Integer.parseInt(kelimeSayi); // sayiya donusur
        int toplam = sayiDeger+ sayiDeger ;
        System.out.println("toplam = " + toplam);

        // toplam suanda int yani sayi , bunu string nasil donustururm  ?
        String strToplam = Integer.toString(toplam) ; // strine donusuruyoruz
        System.out.println("strToplam = " + strToplam);

        // 0733592009 bu da bir strgintir numara kodlanmistir yani
        // 454545644 ucak kodu buda bir string
        // 3845384994828492844bankacailik uygulamasi (iban)
        // TC no da bir stringtir
        //
        }
}
