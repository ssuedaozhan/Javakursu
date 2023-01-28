package Gun36_05_Interface;

public class test implements Igosterir,Iyazdirir{
    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);
    }

    @Override
    public void yaz() {
        System.out.println("yazdirdi");
    }
}
