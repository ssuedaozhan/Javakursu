package Gun39._05_OOP_Soru;

public class Palov implements Ifood{

    @Override
    public void teste() {
        System.out.println("Cocuklarin vazgecilmezi ");

    }

    @Override
    public double ucret() {
        return 20;

    }
    void fry (){
        System.out.println("pirinc ve sehriye kavruldu ");

    }
    void boil (){
        System.out.println("Kisik ateste pisirildi");
    }


}
