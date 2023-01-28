package Gun39._05_OOP_Soru;

public class Myfunc {


    public static void Bekle(int sn){
    //more action + try catch yaptik
        try {

            Thread.sleep(1000*sn); // ms cinsinde bekledigi
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
