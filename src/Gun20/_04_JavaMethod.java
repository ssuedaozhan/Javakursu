package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // /Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main
        // de yazdırınız.

        Scanner okuyucu =new Scanner(System.in);
        System.out.println("sayi 1 =");
        int sayi1 = okuyucu.nextInt();

        System.out.println("sayi2=");
        int sayi2 = okuyucu.nextInt();


int topla= toplam(sayi1,sayi2);
        System.out.println("topla = " + topla);


    }
    public static int toplam (int sayi1,int sayi2){

        int toplam=0;


        return sayi1+sayi2;

    }
}



