package Gun38_01_Abstract;

public abstract class Binekoto {
    //2 si 1 arada => 1 interface+1 parent ckass=abstract class
    private String marka ;
    private int uretimyili ;
            private int vitesadedi ;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimyili() {
        return uretimyili;
    }

    public void setUretimyili(int uretimyili) {
        this.uretimyili = uretimyili;
    }

    public int getVitesadedi() {
        return vitesadedi;
    }

    public void setVitesadedi(int vitesadedi) {
        this.vitesadedi = vitesadedi;
    }

    public Binekoto(String marka, int uretimyili, int vitesadedi) {
        this.marka = marka;
        this.uretimyili = uretimyili;
        this.vitesadedi = vitesadedi;

    }
    abstract  int hizlanmasuresi();
}
