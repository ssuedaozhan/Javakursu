package Gun06;

public class _03_StringCharat {
    public static void main(String[] args) {
        // ne yapar bu : istenilen noktadaki karakteri verir
        // karakterlerin sirasi 0 dan baslar ve buna ndex denir .
        // 0123456789 10 11 12

        String cumle = "Merhaba Dunya" ; // length 13 ama karakterlerin odasi 0-12 dahil
        char ilkharf=cumle.charAt(0);
        System.out.println("ilkharf = " + ilkharf);

        char sonharf=cumle.charAt(12);
        System.out.println("sonharf = " + sonharf);
    }
}
