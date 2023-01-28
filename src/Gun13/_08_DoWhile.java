package Gun13;

import java.util.Scanner;

public class  _08_DoWhile {
    public static void main(String[] args) {
        //kullanicidan  x girilene kadar ekrana "program calisiyor" yaz
        // ve x girildiginde ise "program bitti" yazan programi yapin

        Scanner okuyucu = new Scanner(System.in);
        String harf ;


        // bir oncekinin kisa yontemi

        do { // dongu arasi sart basta olmadigindan
            // en az 1 ez calisir , kontrol sonda
            System.out.println("harf giriniz=");
            harf= okuyucu.next();

            System.out.println("program calisiyor");


        }while (!harf.equalsIgnoreCase("x")); // != anlami farkli esit 0 ise

        System.out.println("program bitti");
    }
}
