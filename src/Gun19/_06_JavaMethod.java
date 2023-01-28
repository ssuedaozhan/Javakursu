package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        merhabayaz();// math.random();
        merhabayazIsme("ismet");// math.abs(-10)
        cokMerhabaYaz(5);
    }
    public static void merhabayaz() {
        System.out.println("Merhaba Dunya");
        System.out.println("merhaba dunya");

    }
    public static void merhabayazIsme(String isim){

        System.out.println(isim+"merhaba");}
    public static void cokMerhabaYaz(int miktar){
        for (int i = 0; i < miktar; i++) {
            System.out.println("merhaba");
        }
    }
}
