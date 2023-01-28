package Gun06;

public class  _08_StringContains {
    public static void main(String[] args) {
        // contains : bir stringin icerisinde karakterler var olup olmadigini boolean
        // cinsinden soyler true veya false

        String cumle = "Merhaba Dunya" ;
        boolean varMi = cumle.contains("a") ;
        System.out.println("varMi = " + varMi);

        // direkt de yapabilirisiniz
        System.out.println("varMi = " + cumle.contains("a"));
        System.out.println("ya varmi = " + cumle.contains("ya")) ;
        System.out.println("k varmi = "+ cumle.contains("k"));

    }
}
