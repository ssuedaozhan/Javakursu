package Gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle=oku.nextLine();

        // bugün cokguzelim;  // boşluk bana sınırı veriyor

        int boslukIndex=cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0, boslukIndex);
        System.out.println("ilkKelime = " + ilkKelime);

        String  sonkelime=cumle.substring(boslukIndex+1);
        System.out.println("sonkelime = " + sonkelime);

    }
}
