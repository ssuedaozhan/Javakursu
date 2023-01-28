package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // kisinin agirligini double , boyunu int olarak degerler veriniz .
        // ve bir satirda boyunuz ... ve kilonuz ... seklinde yazdiriniz .
        //vucut kitle indexini de bularak yazdiriniz.

        int boy = 183;
        double kilo =87;
        System.out.println("kilo+ boy  = " + kilo+ boy);

        double kitleIndex= kilo / (boy*boy);
        // int dersek calismaz , sag taraftaki ondalik oldugu icin .
        System.out.println("kitleIndex = " + kitleIndex);







    }
}
