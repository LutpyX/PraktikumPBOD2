/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 21 April 2026
*/

public class MainMahasiswa {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("123", "Lutfi", "Informatika");

        // Overloading dipakai
        m1.setProgramStudi();
        m2.setProgramStudi("Sistem Informasi");

        Mahasiswa m3 = new Mahasiswa(m2);
        m3.setProgramStudi(m1);

        m1.tampil();
        m2.tampil();
        m3.tampil();
    }
}