package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {
        int a = 9 ;
        int b= 5;
        System.out.println("Toplama Islemi ");
        System.out.println("a+b sonucu = "+(a+b));//14

        System.out.println("cikartma islemi");
        System.out.println("a-b sonucu = " +(a-b));// 4

        System.out.println("carpma islemi");
        System.out.println("axb sonucu ="+ (a*b));// 45

        System.out.println("bolme islemi");
        System.out.println("a/b sonucu = "+(a/b));
        //normal sonuc 1.8 , fakat tam sayiya bolumunda kusurat atilir
        // bu sebebple sonuc 1 olur , yuvarlama yapmaz . cunku int/int
        // tam sonuc istersen bir tanesini double cevirmen yeterli
        System.out.println("(double)a/b = " + (double)a/b);

        System.out.println("Modul islemi");
        System.out.println("a % b sonucu = +(a % b)"); // 9%5 = 4 kalan
        System.out.println("b % a sonucu =+ (b % a)");// 5%9 = 5  cunku 5 9 dan daha kucuk ,
        // direk onu geciririz

    }
}
