package Gun30;

public class GununSorusu {
    int a ;
    static  int b = 0 ; // sen bi tanesin , 2 tane zaten olamaz , clasaa aittir cunku

    void artir (){
        a++;
        b++;
    }

    public static void main(String[] args) {
        GununSorusu gs1= new GununSorusu();
        gs1.a=5;
        GununSorusu gs2= new GununSorusu();
        gs2.a=7;
          // anin degeri kac oldu suanda ?
         //  burada verilecek cevap : hangi a yi soruyosunuz olmali
        // burada her nesnin a si var  ve gs1=5 , gs=27 degeri vardir

        System.out.println("gs2.a = " + gs2.a);
        System.out.println("gs1.a = " + gs1.a);

        // soru bnin degeri kactir ?
        System.out.println("GununSorusu.b="+GununSorusu.b);

        gs1.artir(); // gs1.a -> 6 , b=1
        gs2.artir(); // gs2.a->8 , b=2
        // soru : a ve benin en son degerleri kactir ?
        System.out.println("s1.a= " + gs2.a);
        System.out.println("s2.a= " + gs1.a);
        System.out.println("Soru.b = " + GununSorusu.b);


    }
}
