/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 28 April 2026
*/

public class MainData {
    public static void main(String[] args) {

        Data<Kucing> data = new Data<>();

        data.setIsi(1, new Anggora("Mimi", 3));
        data.setIsi(2, new KembangTelon("Kitty", 2));

        // getIsi
        System.out.println("Isi posisi 1:");
        data.getIsi(1).bersuara();

        // getSize
        System.out.println("Jumlah data: " + data.getSize());
    }
}