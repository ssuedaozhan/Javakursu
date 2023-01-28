package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran = 3.2 ;
        int sayi = 5 ;

        sayi =(int) oran ; // tehlikeli islem yapiyorsun , bundan dolayi challenger patladi .
        // degerlere bak , eger olusan veri kaybini anladiysan ve kabulunse
        // bana bunu bilerek yaptigini goster


        System.out.println("sayi = " + sayi);
        /*************/
        byte kisakenar = 5;
        byte uzunkenar = 7 ;

        //  byte cevre = kisakenar = uzun kenar + kisakenar + uzunkenar (hata verir)
        // sen esitligin 2. tarafini rakamlar toplandi , benim toplam burada INT durumunda
        // byte cevre = 5+7+5+7 ; // inti byte atmaya calisiyorsun derdi .
        // eger veri kaybi olmayacagindan eminsen , veya veri kaybi onemli degilse
        // bana bunu yazarak gosterir . assadaki dogru hali
        byte cevre = (byte) (kisakenar+uzunkenar+kisakenar+uzunkenar);

        int cevre2 = kisakenar+ uzunkenar+kisakenar+uzunkenar ; // alternatif
        System.out.println("cevre2 = " + cevre2);


        // bilgisayar kendi basina bir rakam gorurse islemin sonucunda olusan bir sayi gibi direk int kabul eder .






        }
    }

