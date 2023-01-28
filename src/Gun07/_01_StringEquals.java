package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        // nedir string equals : 2 stringin birbirine esit olup olmadigini kontrol eder .
        // sonuc boolean
        String s1 = "Merhaba " ;
        String s2 = "MERHABA";
        boolean esitmi = s1.equals(s2); // s1 esit mi s2 ye
        System.out.println("esitmi = " + esitmi);

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // Merhaba MERHABA
        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba")); // Merhaba MERHABA


    }
}
