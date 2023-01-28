package Gun06;

public class _07_StringConcat {
    public static void main(String[] args) {
        // concat : bir string digerine birlestiriyor

        String s1 = "Asko";
        String s2 = "Kusko" ;
        System.out.println("birlesik hali =" + s1+s2 );

        System.out.println("birlesik hali = "+s1.concat(s2)); // birlesmis hali
        System.out.println("birlesik hali = "+s1.concat("").concat(s2));
        System.out.println("birlesik hali= "+ s1.concat((" "+s2)));// s1+ "" + s2
        System.out.println("birlestirme="+s1.concat("Kusko")); // s1+ "venus"

        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1);



    }
}
