// Nama     : Muhammad Lutfi Febriansyah
// NIM      : 24060124140197
// Lab      : D1
// Tanggal  : Selasa, 17 Maret 2026

public class Lingkaran extends BangunDatar implements IResize {

    private double jari;

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void printInfo() {
        System.out.println("Lingkaran:");
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}