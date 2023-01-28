package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);


        System.out.print("kilonuz=");

        double kilo = oku. nextDouble();

        System.out.print("Boyunuz=") ;
        double boy = oku.nextDouble();

        double vucutKitleInd= kilo/ (boy*boy) ;
        System.out.println("vucutKitleInd=" + vucutKitleInd ) ;

        }



    }

