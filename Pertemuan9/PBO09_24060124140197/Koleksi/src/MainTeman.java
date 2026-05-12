// Nama    : Muhammad Lutfi Febriansyah
// NIM     : 24060124140197
// Lab     : D2
// Tanggal : Selasa, 5 Mei 2026

public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("Rama");
        t.addNama("Caesar");
        t.addNama("Ferdy");
        t.addNama("Devano");
        t.addNama("Hafidh");
        t.addNama("Zugfar");
        t.addNama("Devano");
        t.addNama("Menza");
        t.addNama("Vela");

        t.showTeman();

        t.gantiNama("Menza", "Menzagtg");
        t.showTeman();

        t.delNama("Vela");
        t.showTeman();
    }
}