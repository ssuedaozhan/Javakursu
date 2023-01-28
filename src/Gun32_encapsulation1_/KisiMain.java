package Gun32_encapsulation1_;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
       // kisi1.ad="sueda";
        //kisi1.soyad="ozhan";
        // kisi1.yas=-25; olmadi yanlis hatali
        kisi1.setAd("Sueda");
        kisi1.setSoyad("Ozhan");
        kisi1.yasAta(-20);
        System.out.println(kisi1.yasver());
        System.out.println("kisi1 = " + kisi1);

        //degiskene direk erisimi kapatip
        // bir metod ile korumali veri gonderme ve alma
        // islemine encapsulation denir .
    }
}
