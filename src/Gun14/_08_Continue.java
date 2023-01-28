package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        //girilen bir stringin harflerini teker teker ekrana alt alta olacak sekilde yazdiirin
        //boslulari yazmasin .

        Scanner okuyucu= new Scanner(System.in);
        System.out.print("kelime giriniz");
        String kelime = okuyucu.next();


        for (int i = 0 ; i < kelime.length();i++)
        {
            if (kelime.charAt(i)==' ')
                continue;
            System.out.println(kelime.charAt(i));


        }

    }
}
