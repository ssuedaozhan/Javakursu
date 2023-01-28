package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // daha once cozdugunuz hesap makinesi sorusnu , switch ile cozunuz.
        Scanner okuyucu = new Scanner(System.in);


        System.out.println("1.SAYI");
        int sayi1 = okuyucu.nextInt();

        System.out.println("2.SAYI");
        int sayi2= okuyucu.nextInt();

        System.out.println("toplama icin T");
        System.out.println("cikarma icin C");
        System.out.println("carpma icin P");
        System.out.println("bolme icin B");
        System.out.println("Seciminiz");
        Scanner okustr= new Scanner(System.in);
        String secim = okustr.next();

        switch (secim.toUpperCase()) // yapilacak olan islemin basligi
        {
            case "T" : System.out.println("toplam="+ (sayi1+sayi2));// break
            case "C" : System.out.println("FARK="+ (sayi1-sayi2));
            case "P" : System.out.println("CARPIMI="+ (sayi1*sayi2));
            case "B" : System.out.println("BOLME="+ (sayi1/sayi2));
            default:
                System.out.println("hatali");

        }
    }
}
