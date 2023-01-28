package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {
        //void: TIPSIZ demektir .
        System.out.println("merhaba dunya");

        merhabayaz(); // giden yok , donen yok
        toplamyaz(4,5);//giden var , donen yok (fonskionu birseye esitleyebilriomsn )
        int enb= Math.max(4,5);// giden var , donen var , (fonskionu birseye esitleyebilriomsn)
        double sayi = Math.random(); // gideni yok , donen var .

        enbYaz(4,5);
        enb =enbbul (4,5);
        System.out.println("enb="+enb);
         // fonksiyonda return oldugu icin main de yazdirabiliyoruz
        // yani fonksiyonun sonucunu alabiliyoruz

    }
    public static int enbbul (int a , int b) //donecek tip
    {
        int donecek=0;
        if (a>b)
            donecek=a;
        else
            donecek=b;

        return donecek ; // donecek deger aliriz
    }
    public static void enbYaz (int a,int b){
        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);

}
public static void toplamyaz (int a , int b)
{
    System.out.println(a+b);

}
public static void merhabayaz ()
{
    System.out.println("Merhaba dunya");
}
}

