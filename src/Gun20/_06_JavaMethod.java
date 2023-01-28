package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1=45;
        int s2=4;
        int s3=67;
        int s4=23;

        int sonuc1= toplambul("furkan",s1,s2);
        int sonuc2= toplambul("furkansueda",s1,s2,s3);
        int sonuc3= toplambul("furkan",s1,s2,s3,s4);
         // parametreler ayni tip sadce miktarlari farkli
        // bu tip duurmlar icin bir kolaylik saglanmis
        System.out.println("sonuc3 = " + sonuc3);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc1 = " + sonuc1);

    }
    // ... ile ilgili 2 kural var
    // 1- bir metodda parametre olarak sadece 1 tane olabilir
    // 2- herzaman son parametre olmali
    // gelen kac sayi olursa olsun hepsini al dizisi seklinde metoda al
    public static int toplambul (String isim , int...sayilar){
        int toplam=0;
        System.out.println("isim = " + isim);
        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];

        }
        return toplam ;

    }

}
