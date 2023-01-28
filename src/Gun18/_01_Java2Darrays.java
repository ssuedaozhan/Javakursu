package Gun18;

import javax.script.SimpleScriptContext;
import java.util.Scanner;

public class _01_Java2Darrays {
    public static void main(String[] args) {
        int sayi = 0; //1 tane sayi
        int[] dizi = new int[100]; //100 sayi

        int[] ders1notlari = new int[50]; //50 kisilik sinifin 1.dersin notlari
        int[] ders2notlari = new int[50];
        int[] ders3notlari = new int[50];

        int[][] tumdersnotlari = new int[3][50]; // 3 tane ders 50 tane ogrenci ,150 tane sayi
        //3 satir 50 sutun
        //her satir 50 tane sayi , 50 sutun
        //0. satir , 1.satir , 2.satir
        // satir : 0.1.2 sutun : 0,1,2,3,......49

        ders1notlari[0] = 80; //tek boyutlu dizinin ilk (0) elemanina 80 degerini atadim
        tumdersnotlari[0][0] = 80; // 2 boyutlu dizide 0.satirin , 0.sutununa 80 degeri atandi
        System.out.println("tumdersnotlari[0][0]+" + tumdersnotlari[0][0]);
        Scanner okuyucu = new Scanner(System.in);
        tumdersnotlari[0][0] = okuyucu.nextInt();
    }
}
