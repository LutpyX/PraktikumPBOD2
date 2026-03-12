// Nama     : Muhammad Lutfi Febriansyah
// NIM      : 24060124140197
// Lab      : D1
// Tanggal  : Selasa, 10 Maret 2026

public class MainBangunDatar {

    public static void main(String[] args) {

        Persegi P1 = new Persegi(5, "Merah", "Hitam");

        Lingkaran L1 = new Lingkaran(7, "Biru", "Putih");

        System.out.println("===== PERSEGI =====");
        P1.printInfo();
        System.out.println("Luas Persegi : " + P1.getLuas());
        System.out.println("Keliling Persegi : " + P1.getKeliling());
        System.out.println("Diagonal Persegi : " + P1.getDiagonal());

        System.out.println();

        System.out.println("===== LINGKARAN =====");
        L1.printInfo();
        System.out.println("Luas Lingkaran : " + L1.getLuas());
        System.out.println("Keliling Lingkaran : " + L1.getKeliling());

        System.out.println();

        BangunDatar.printcounterBangunDatar();
    }
}