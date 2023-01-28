package Gun30._01_StaticVariables_02_Finaldegiskenler.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {
Vatandas v1= new Vatandas("sueda ozhan");
        Vatandas v2= new Vatandas("sueda ozhannur");
        Vatandas v3= new Vatandas("sueda ozhanahmet");
        System.out.println("v3 = " + v3);
        System.out.println("v2 = " + v2);
        System.out.println("v1 = " + v1);
//v1.tcno=456;
        //final degiskenlereine sadece 1 kez veri atanabilir
        //odaya tanimlarken yada consturctor da

        final double pi = 3.14; // tanimlanirken
        //pi=5; // sonradan degistiirleemz
        //math.pi ; javanin nasil yaptigina baktim , oda bizim gibi yapmis .

    }
}
// final : değer atandıktan sonra değiştirilmeyi engelliyor
//         bu sebeple, hem sabit değerler için, hem de sonradan
//         değişmesini istemediğimiz değerler için kullanılır
// static sayac ise: her yeni nesne oluşturulduğunda
// yeni artan değer almasını sağlıyor

