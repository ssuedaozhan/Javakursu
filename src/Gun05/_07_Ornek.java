package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        Scanner okuyucu = new Scanner(System.in);
        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b


        System.out.print("dikdortgenin kisa kenari ") ;
        int kisakenar = okuyucu.nextInt() ;

        System.out.print("dikdortgenin uzun kenari ");
        int uzunkenar = okuyucu.nextInt();

        int cevre = kisakenar=uzunkenar+ kisakenar+ uzunkenar ;
        int alan = kisakenar* uzunkenar ;

        System.out.println("cevre= + "+ cevre);
        System.out.println("alan = " + alan);


    }
}
