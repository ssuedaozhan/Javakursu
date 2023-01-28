package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        // Kullanıcının girdiği gün numarasına karşılık gelen günü adınız yazınız.
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Gun no =");
        int gunNo = okuyucu.nextInt();
        // if (gunNo== 1)
       // System.out.println("pazartesi");
        // else
        // if (gunno==2)
        //System.out.println("Sali");

        switch (gunNo){ // SUSLU PARANTEZ OLMAK ZORUNDA

            case 1: System.out.println("PAZARTESI");break; // break bolmek icin
            case 2: System.out.println("SALI");break;
            case 3: System.out.println("CARSAMBA");break;
            case 4: System.out.println("PERSEMBE");break;
            case 5: System.out.println("CUMA");break;
            case 6: System.out.println("CUMARTESI");break;
            case 7: System.out.println("PAZAR");break;
            default: System.out.println(" hatali amk "); // casedekileirn disinda ise



        }
    }
}
