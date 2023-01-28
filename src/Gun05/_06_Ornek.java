package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {

        Scanner okuyucu= new Scanner(System.in);
// kare
        int kenar  =  okuyucu.nextInt();

        int cevre = kenar+kenar+kenar+kenar ;
        int alan = kenar*kenar;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
