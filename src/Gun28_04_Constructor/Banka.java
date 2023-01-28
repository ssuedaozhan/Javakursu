package Gun28_04_Constructor;

public class Banka {
    String adi;
    int subesayisi;
    int kurulusyili;

    public Banka() {

    }

    public Banka(String adi, int subesayisi, int kurulusyili) {
        this.adi = adi;
        this.subesayisi = subesayisi;
        this.kurulusyili = kurulusyili;
    }

    public Banka(String adi, int subesayisi) {
        this.adi = adi;
        this.subesayisi = subesayisi;
    }
public String toString(){
    return "Banka{" +
            "adi='" + adi + '\'' +
            ", subeSayisi=" + subesayisi +
            ", kurulusYili=" + kurulusyili +
            '}';
}
}



