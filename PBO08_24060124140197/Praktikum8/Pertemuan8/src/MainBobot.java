/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 28 April 2026
*/

public class MainBobot {
    public static void main(String[] args) {
        Anggora a = new Anggora("Mimi", 3.0);
        KembangTelon k = new KembangTelon("Kitty", 2.0);

        double total = OperatorGenerik.Bobot2(a, k);
        System.out.println("Total bobot: " + total);
    }
}