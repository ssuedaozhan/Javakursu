package Gun30._01_StaticVariables_02_Finaldegiskenler.Ornek1;

public class Vatandas {

    String isim ;

   final int tcno; // degisitirilemez , yani sadece 1 kez veri atama sansi verir .

static  int tcnoSayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcno=tcnoSayac++;
        // final degiskenlerine sadece 1 kez veri atanabilir .
        // odaya tanimlarken , yada consturctor da

    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcno=" + tcno +
                '}';
    }
}




