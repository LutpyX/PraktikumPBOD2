// Nama     : Muhammad Lutfi Febriansyah
// NIM      : 24060124140197
// Lab      : D1
// Tanggal  : Selasa, 17 Maret 2026

public class MainBangunDatar {

    public static void main(String[] args) {

        // OBJECT (POLYMORPHISM)
        BangunDatar P1 = new Persegi(5, "Merah", "Hitam");
        Persegi P2 = new Persegi(10, "Biru", "Putih");

        BangunDatar L1 = new Lingkaran(7, "Hijau", "Kuning");
        Lingkaran L2 = new Lingkaran(14, "Ungu", "Abu");

        System.out.println("=================================");
        System.out.println("        DATA BANGUN DATAR         ");
        System.out.println("=================================\n");

        // PERSEGI
        System.out.println(">> Informasi Persegi (P1)");
        System.out.println("--------------------------");
        P1.printInfo();
        System.out.println("Luas               : " + P1.getLuas());
        System.out.println("Keliling           : " + P1.getKeliling());

        System.out.println("\n>> Informasi Persegi (P2)");
        System.out.println("--------------------------");
        P2.printInfo();
        System.out.println("Luas               : " + P2.getLuas());
        System.out.println("Keliling           : " + P2.getKeliling());
        System.out.println("Diagonal           : " + P2.getDiagonal());

        System.out.println();

        // LINGKARAN
        System.out.println(">> Informasi Lingkaran (L1)");
        System.out.println("----------------------------");
        L1.printInfo();
        System.out.println("Luas               : " + L1.getLuas());
        System.out.println("Keliling           : " + L1.getKeliling());

        System.out.println("\n>> Informasi Lingkaran (L2)");
        System.out.println("----------------------------");
        L2.printInfo();
        System.out.println("Luas               : " + L2.getLuas());
        System.out.println("Keliling           : " + L2.getKeliling());

        // PERBANDINGAN
        System.out.println("        PERBANDINGAN DATA         ");
        System.out.println("Apakah luas P1 sama dengan P2?      : " + P1.isEqualLuas(P2));
        System.out.println("Apakah keliling P1 sama dengan L1?  : " + P1.isEqualKeliling(L1));

        // RESIZE (INTERFACE)
        System.out.println("      RESIZE (INTERFACE)     ");
        System.out.println("\n>> Persegi P2 diperbesar (zoomIn)");
        P2.zoomIn();
        P2.printInfo();

        System.out.println("\n>> Lingkaran L2 diperkecil (zoomOut)");
        L2.zoomOut();
        L2.printInfo();

        BangunDatar.printcounterBangunDatar();
    }
}