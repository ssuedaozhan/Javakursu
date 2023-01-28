package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // girilen bir ay numarasina gore ayin kac gun surdugunu yazdiriniz
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("ay numarasi giriniz =");
        int ayinnumarasi = okuyucu.nextInt();

        switch (ayinnumarasi) {

            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11 :
                System.out.println("30");
            case 12:
                System.out.println("31");
            default:
                System.out.println("yanlis girdin amk");




        }
    }
}
