package Gun04;

public class _07_Ornek {
    public static void main(String[] args) {
        // string olarak verilen 2 adetbagis parasinin toplamini yazdiriniz .

        String bagis1 = "500";
        String bagis2 = "1500";
// gorunumu sayi olmali , int olarak sayi karsiligi yok .
        // sadece yazmak icin kullanabilirimstring halde toplama gibi bir isleme giremez ;
        // toplamamamiz gerekirse cevirecegiz , yani :
       int intbagis1 = Integer.parseInt(bagis1) ;
       int intbagis2 = Integer.parseInt(bagis2);
     int toplambagis= intbagis2+intbagis1 ;
        System.out.println("toplambagis = " + toplambagis);

    }
}
