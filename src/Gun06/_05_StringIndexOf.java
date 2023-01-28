package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {

        // indexof nedir ?
        // 01234: harfkerin oda numaralari 0 dan baslar : index deriz
        // bugun

        String cumle = "Merhaba Dunya";
        // d nin indexi kactir ?
        // m nin indexi kactir ?
        //0(733)592009 = parentezin oda numarasi kactir ?
        // verilen karakter veya lerin string icindeki INDEX ini verir .

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); //0
        System.out.println("cumle.indexOf(a)= " + cumle.indexOf("a"));// 4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha"));//3
        System.out.println("cumle.indexOf() = " + cumle.indexOf(" "));//
        System.out.println("cumle.indexOf (A)= " + cumle.indexOf("A"));// -1 YOK
        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf("a",5)); // 6
        // a yi arama ama 5. kelimeden sonra 5 dahil nolu indexten sonra basla

    }
}
