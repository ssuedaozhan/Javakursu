package Gun29.Soru;

public class Hesap {
  private   int yatanpara=0;
    private  int cekilenpara=0;
    private int bakiye=0 ;

void parayatir(int yatanparaa)
{
    yatanpara=yatanpara +yatanparaa;
    bakiye=bakiye+yatanparaa;


}
void paracek(int cekilenparaa){
    cekilenpara=cekilenpara+cekilenparaa;
    bakiye=bakiye-cekilenparaa;
}

    @Override
    public String toString() {
        return "Hesap{" +
                "yatanpara=" + yatanpara +
                ", cekilenpara=" + cekilenpara +
                ", bakiye=" + bakiye +
                '}';
    }
}


