package Gun36_04_Interface;
// bir class birden fazla interface implemente edebilir

import javax.jws.soap.SOAPBinding;

public class A4 implements Igosterir,Iyazdirir{

    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yazdiri() {
        System.out.println("yazdirdi");
    }
}
