/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 21 April 2026
*/

public class MainAnabul {
    public static void main(String[] args) {

        Anabul a1 = new Kucing();
        Anabul a2 = new Anjing();
        Anabul a3 = new Burung();

        a1.gerak(); a1.bersuara();
        a2.gerak(); a2.bersuara();
        a3.gerak(); a3.bersuara();
    }
}