package Gun14;

public class _02_forLoop {
    public static void main(String[] args) {
        // 1 den 5 e kadar olay sayilari ekrana yazdiriniz
        // dongu kackere doncegu belli olayn durumlarda bunu kullancagiz
        int i = 0; // sayac yerine i kullnacagiz .
        while (i <= 5)
        {
            System.out.println("while_i = " + i);
            i++;

        }

        System.out.println();
        // for dongusu , basi beli , sonu belli ,yani kac adim doncegi belli  artisibelli ise bunu kullancagiz .

        for (i=0 ; i<=5; i++)

            System.out.println("for_i = " + i);

    }
    }