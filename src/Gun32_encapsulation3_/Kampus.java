package Gun32_encapsulation3_;

import java.util.Scanner;

public class Kampus {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("Kabataş Okulu", 3); // maxOgr 3

        do{
            System.out.println("adiniz=");
            String ad= okuStr.nextLine();

            System.out.println("Soyadiniz=");
            String soyad=okuStr.nextLine();

            System.out.println("yasiniz=");
            Integer yas = okuInt.nextInt();

            if (yas<15){
                Ogrenci ogr= new Ogrenci(ad,soyad,yas);
                yeniOkul.getOgrenciler().add(ogr);
            }
            else
            {
                System.out.println("ogrenci yasi okul icin uygun degil ");
            }

        }while(yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan() );

    }
}
