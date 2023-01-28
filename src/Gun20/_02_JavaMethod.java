package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        //kullanicnin girecegi 2 sayidan buyuk olanini bulma islemini bir metodda yaptiktan
        // sonra main de yazdirin .
        Scanner okuyucu = new Scanner(System.in);
        System.out.println(" sayilari  giriniz");
        int sayi1= okuyucu.nextInt();
        int sayi2= okuyucu.nextInt();


     int enbul=  buyukolanibulmaislemi(sayi2,sayi1);
        System.out.println("enbul = " + enbul);

    }


    public static  int  buyukolanibulmaislemi(int a , int b) {
    int donecek=0;

        if (a>b)
            donecek=a;
        else
            donecek=b;

return donecek;

    }

}

