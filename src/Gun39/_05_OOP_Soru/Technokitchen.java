package Gun39._05_OOP_Soru;

public class Technokitchen {
    public static void hazirla (Ifood f){

        System.out.println(f.getClass().getSimpleName());
        if (f instanceof adanakebabp)
        {
            ((adanakebabp)f).marine();
            ((adanakebabp)f).grill();
        }
        else
        if (f instanceof Lahmacun)
        {
            ((Lahmacun)f).dough();
            ((Lahmacun)f).addmeat();
            ((Lahmacun)f).bake();
        }
        else
        if (f instanceof Borsh)
        {
            ((Borsh)f).boil();
            ((Borsh)f).eattomorrow();
        }
        else
        if (f instanceof Palov)
        {
            ((Palov)f).fry();
            ((Palov)f).boil();
        }

        f.teste();
        System.out.println();
    }

}


