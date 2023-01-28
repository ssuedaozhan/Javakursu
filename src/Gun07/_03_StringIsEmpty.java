package Gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty : bir stringin icinde birsey varmi yokmu boolean olarak verir.

        String s1 = " Merhaba" ;
        System.out.println("s1.isEmpty() = " + s1.isEmpty()); // false cikar cunku bos degil

        String s2 = " "; // bosluk karakteri de A gibi bir karakterdir .
        System.out.println("s2.isEmpty() = " + s2.isEmpty()); // false

        String s3 = ""; // hicbirsey yok yani bos , yani empty
        System.out.println("s3.isEmpty() = " + s3.isEmpty()); // true

    }
}
