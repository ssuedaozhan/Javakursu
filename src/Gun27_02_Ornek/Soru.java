package Gun27_02_Ornek;

public class Soru {

        // Math sınıfndaki metodlarıdan 5 tanesini
       // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
      // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
     // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.

    public static void main(String[] args) {

        int max= MyMath.getMax(4,6);
        int min= MyMath.getMax(4,6);
        int randomm=MyMath.getrandom(10);
        double ussonuc=MyMath.getussunual(2,3);
        double karekok=MyMath.getkarekok(16);

        System.out.println("karekok = " + karekok);
        System.out.println("ussonuc = " + ussonuc);
        System.out.println("randomm = " + randomm);
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        }
    }

