package Gun08;

public class _06_JavaComparisonOperators {
    public static void main(String[] args) {

        int a = 50 ;
        int b = 50 ;
        // atama isareti , == esit mi ?
        System.out.println("a b ye esit mi ?  "+ (a==b));// true
        System.out.println("a b ye farkli mi ? "+ (a!=b));// false

        System.out.println("a b den buyuk ?"+ (a>b)); // false
        System.out.println("a b den kucuk mu ?"+ (a<b));// false

        System.out.println("a b den buyuk veya esit mi ?"+(a>=b));//true
        System.out.println("a b den kucuk veya esit mi ?"+(a<=b));//true


    }
}
