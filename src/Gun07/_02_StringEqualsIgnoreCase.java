package Gun07;

public class _02_StringEqualsIgnoreCase {
    public static void main(String[] args) {

        String s1 = "Merhaba" ;
        String s2 = "MERHABA" ;
        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // false olur cunku esit degil
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2)); // true olur
        // cunku ignore yapti , kucukluk buyukluk bakimindan

    }
}
