package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {

        tekmiciftmi(55);
        tekmiciftmi(43);
        //kullanicidan sayi alarak onu tek mi ciftmi yazdiralim
        tekmiciftmioku();

    }
    public static void tekmiciftmi(int sayi){
        if (sayi% 2 !=0)
            System.out.println("tek");
        else
            System.out.println("cift");

    }
    public static void tekmiciftmioku(){

        Scanner okuucu=new Scanner(System.in);
        System.out.println("sayi giriniz=");
        int sayi = okuucu.nextInt();

        tekmiciftmi(sayi);
    }
}
