// Nama     : Muhammad Lutfi Febriansyah
// NIM      : 24060124140197
// Lab      : D1
// Tanggal  : Selasa, 17 Maret 2026

public abstract class BangunDatar {
    private int JmlhSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar (int JmlhSisi, String warna, String border) {
        this.JmlhSisi = JmlhSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public static void printcounterBangunDatar(){
        System.out.println("Jumlah objek BangunDatar: " + counterBangunDatar);
    }
    
    public int getJmlhSisi (){
        return JmlhSisi;
    }

    public void setJmlhSisi ( int JmlhSisi) {
        this.JmlhSisi = JmlhSisi;
    }

    public String getwarna (){
        return warna;
    }

    public void setwarna (String warna) {
        this.warna = warna;
    }

    public String getBorder (){
        return border;
    }

    public void setBorder (String border) {
        this.border = border;
    }
    
    public void printInfo (){
        System.out.println("jumlah sisi: " + JmlhSisi);
        System.out.println("warna: " + warna);
        System.out.println("border: " + border);
    }
}