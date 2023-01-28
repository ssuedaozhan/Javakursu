package Gun28_02_Constructor;

public class Kitapci {
    // book class yaziniz . fields : name , publisher , auothor
    // 3 adet Constructor ekleyiniz.
    // kitaplarin ozelliklerini tek bir satirda yazdiran bir metod ekleyiniz.
    //3 adet kitabi farkli constructorla olusturup , mainde yazdiirn .

    public static void main(String[] args) {
        Kitap kitap1= new Kitap();
        kitap1.name="Harray Poter";
        kitap1.author="JK Rowling";
        kitap1.publishyear=1993;

        Kitap kitap2= new Kitap("yzuukler",1995,"JRR Tolkien");
       Kitap kitap3= new Kitap("uzum ve cay",2000);
        System.out.println("kitap3 = " + kitap3);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap1 = " + kitap1);
    }
}
