package Gun17;

public class _04_CharveSAYI {
    public static void main(String[] args) {
        int sayi = 65;

        System.out.println("sayi = " + sayi);

        char harf =(char) sayi;
        System.out.println("harf = " + harf);

        sayi=96 ;
        harf=(char) sayi;

        System.out.println("harf = " + harf);

        for (int i = 0; i <= 255 ; i++) {

            harf=(char) i;
            System.out.println(i + ".harf = " + harf);


        }
    }
}
