package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // 100 e kadar olan sayilarin toplamini bulunuz .
        Scanner okuyucu = new Scanner(System.in);
        int sayac =1;
        int toplam = 0;
        while (sayac <= 100)
        {


            toplam= toplam+sayac;
            sayac++; // sayac = saya+1

        }


        System.out.println("toplam = " + toplam);
        }
    }
