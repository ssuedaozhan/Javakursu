package Gun07;

public class _07_StringStartsWith {
    public static void main(String[] args) {

        // starswith : bununla basliyor mu ?
        // sonuc true veya false

        String text = "HCL Teknoloji " ;
        System.out.println("text.startsWith(HC)  = " +text.startsWith("HC") ); // TRUE
        System.out.println("text.startsWith(\"te\") = " + text.startsWith("te")); // false
        System.out.println("text.startsWith(\"h\") = " + text.startsWith("h")); // false

    }
}
