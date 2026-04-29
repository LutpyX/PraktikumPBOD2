/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 28 April 2026
*/

class OperatorGenerik {

    public static <T> void Tukar(T[] data) {
        T temp = data[0];
        data[0] = data[1];
        data[1] = temp;
    }

// Fungsi Bobot2 (khusus Kucing)
    public static double Bobot2(Kucing k1, Kucing k2) {
        return k1.getBobot() + k2.getBobot();
    }
}