/** 
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
 * Nama      : Muhammad Lutfi Febriansyah
 * NIM       : 24060124140197
 * Tanggal   : Selasa, 24 Maret 2026
 * 
 * 
*/

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();

        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() sudah ada pada class Exception
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
