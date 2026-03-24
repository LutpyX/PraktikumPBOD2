/** 
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama      : Muhammad Lutfi Febriansyah
 * NIM       : 24060124140197
 * Tanggal   : Selasa, 24 Maret 2026
 * 
 * 
*/

public class AngkaSialException extends Exception {

    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}