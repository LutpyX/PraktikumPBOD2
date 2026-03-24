/** 
 * File      : Asersi.java
 * Deskripsi : program untuk menunjukkan asersi
 * Nama      : Muhammad Lutfi Febriansyah
 * NIM       : 24060124140197
 * Tanggal   : Selasa, 24 Maret 2026
 * 
 * 
*/


public class Asersi {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        }else{ 
            assert(x < 0 ): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
	

