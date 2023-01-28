package Gun26_04_Ornek;

public class Elektrikhesabi {
    int toplamtUKETIM=0;
    double birimfiyat=0.7;
    double fatura =0;

    public void tuketimekle(int aylikTuketim){

    toplamtUKETIM+=aylikTuketim;
    }
   public void toplamTuketimiyaz(){
       System.out.println("toplamtUKETIM = " + toplamtUKETIM);
   }
   public void faturaYaz(String isim ){
        double toplamtutar= toplamtUKETIM*birimfiyat;
       System.out.println("***************");
       System.out.println("faturaniz");
       System.out.println("***************");
       System.out.println("musteri"+isim);
       System.out.println("toplamyuketim="+toplamtUKETIM);
       System.out.println("toplamtutar = " + toplamtutar);
       System.out.println("****************");
        }
   }

