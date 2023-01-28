package Gun31_01_Ornek;

public class Ornek1Cozum {
    enum Aylar {
        Tanimsiz ,OCAK,SUBAT,MART,NISAN,MAYIS,HAZIRAN,TEMMUZ,AGUSTOS,EYLUL,EKIM,KASIM,ARALIK
    }

    public static void main(String[] args) {
        Aylar ay = Aylar.MAYIS;
        switch (ay){
            case EKIM:
            case MART:
            case OCAK:
            case EYLUL:
                System.out.println(30);break;
            case HAZIRAN:
            case KASIM:
            case MAYIS:
            case NISAN:
            case SUBAT:
                System.out.println(28);break;
            case ARALIK:
                System.out.println(31);break;
            case TEMMUZ:
            case AGUSTOS:
        }
        if (ay==Aylar.MAYIS){
            System.out.println("zam yapildi");
        }
        System.out.println("ay = " + ay);//tostring
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());
        for (Aylar a :Aylar.values())
            System.out.println(a.name()+"-"+a.ordinal());

    }
}
