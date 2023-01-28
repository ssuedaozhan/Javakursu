package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan
        // sayıların çarpımını (faktöryel)
        //bir fonksiyonda buldurup, bunun sonucunu
        // main de tek mi çift mi olduğunu yazdırınız.

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("sayi giriniz=");
        int sayi = okuyucu.nextInt();
        int carpim = faktoriyel (sayi);

        if (carpim% 2 ==0 )
        System.out.println("cift");
        else
        System.out.println("tek");


}
public static int faktoriyel(int sayi)
{
int carpim = 1 ;
    for (int i = 0; i < sayi; i++) {
        carpim= carpim*i ; // sayıya kadar olan sayıları çarp demiş
            //sayı = 5 olsun
           // çarpim = 1
          // i=1
         // i sayı kadar olana  dek dönsün diyor
        // her turda i 1 artacak
        //  ilk turda
       // çarpim = çarpim * i ==> carpim = 1*1 oluyor
        //ikinci turda
        //çarpim = çarpim * i ==> carpim = 1*2 oluyor
        //3. turda
        // çarpim = çarpim * i ==> carpim = 2*3 oluyor
        //4. turda
               // çarpim = çarpim * i ==> carpim = 6*4 oluyor
        //5. turda
               // çarpim = çarpim * i ==> carpim = 24*5 oluyor

              //  çarpim = 120 oluyor

    }
    return carpim;
}
}


