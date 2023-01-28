package Gun39._01_OOP_Soru;

public abstract class Hayvan {
    // guvenli olsun diye final yazariz
    // assayda kendimiz idsayaci yapariz.
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    // basina abstract getirmeliyiz, kullanicisi desede dmeesede
    abstract void yiyecegi(); // basina abstract getirmeliyiz, kullanicisi desede dmeesede
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

// assada getter +setter yaptik
    private static int idSayac=1;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.id = idSayac++;
    }

    @Override
    public String toString() {
        System.out.print("yiyeceği="); yiyecegi();
        System.out.print("yemek mik="); yemekMiktari();
        System.out.print("uyku süresi="); gunlukUykuSuresi();
        System.out.print("sesi="); sesi();

        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                "}\n";
    }

    public void guzelYaz()
    {
        System.out.println("id = " + id);
        System.out.println("isim = " + isim);
        System.out.println("vahsi = " + vahsi);
        System.out.println("dogumTarihi = " + dogumTarihi);

        System.out.print("yiyeceği="); yiyecegi();
        System.out.print("yemek mik="); yemekMiktari();
        System.out.print("uyku süresi="); gunlukUykuSuresi();
        System.out.print("sesi="); sesi();
    }


    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
