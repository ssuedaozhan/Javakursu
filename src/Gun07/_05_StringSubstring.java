package Gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {
        // stringin belli bir bolumunu alma islemini yapar .
        //            012345678901234567
        String s1 = "Merhaba arkadaslar " ;
        String parca1 = s1.substring(3,9); // 3 nolu indexten  9 nolu indexe kadar, 7 dahil degil .
        System.out.println("parca1 = " + parca1);

        String parca2 = s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        String parca3 = s1.substring(8); // eger bir rakam verirsem verilenden baslayip sonuna kadar alir
        System.out.println("parca3 = " + parca3);

    }
}
