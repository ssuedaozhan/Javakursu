package Gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        // toUpperCase : string buyuk harfe cevirir

        String text = "Merhaba Dunya " ;
        System.out.println("orijinal hali= "+ text);
        System.out.println("text.toUpperCase()="+ text.toUpperCase());

        System.out.println("me veya ME ile basliyormu="+text.toUpperCase().startsWith("ME"));// TRUE

        System.out.println("text = " + text);

    }
}
