/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 28 April 2026
*/

public class MainTukar {
    public static void main(String[] args) {

        // Integer
        Integer[] angka = {3, 6};
        OperatorGenerik.Tukar(angka);
        System.out.println("Integer: " + angka[0] + ", " + angka[1]);

        // String
        String[] teks = {"A", "B"};
        OperatorGenerik.Tukar(teks);
        System.out.println("String: " + teks[0] + ", " + teks[1]);

        // Anabul
        Kucing[] kucing = {
            new Anggora("Mimi", 3),
            new KembangTelon("Pussy", 2.5)
        };
        OperatorGenerik.Tukar(kucing);
        System.out.println("Anabul: ");
        kucing[0].bersuara();
        kucing[1].bersuara();
    }
}