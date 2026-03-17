// Nama     : Muhammad Lutfi Febriansyah
// NIM      : 24060124140197
// Lab      : D1
// Tanggal  : Selasa, 17 Maret 2026

public class Persegi extends BangunDatar implements IResize {

    private double sisi;

    public Persegi () {
        super();
        setJmlhSisi(4);
    }

    public Persegi (double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // IMPLEMENT INTERFACE
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void printInfo() {
        System.out.println("Persegi:");
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Diagonal : " + getDiagonal());
    }
}