package Gun29._Privaterisim_;

public class Calisan {
    // bunlarin hepsi default tur , public vs yazmiyor cunku .
    int id ;
    String name ;
    String surname ;
    String password ;

    public void  sifreata(String sifre){
        // sifreyi kontrol ederek atayacagim
        if (sifre.length()<8){
            System.out.println("zayig sifre");
        }
        else {
            this.password=sifre;
            System.out.println("sifre basariyla atandi");
        }
    }
    public void sifregoster(){
        System.out.println("****"+password.substring(4));
    }
}
