/** 
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * Nama      : Muhammad Lutfi Febriansyah
 * NIM       : 24060124140197
 * Tanggal   : Selasa, 24 Maret 2026
 * 
 * 
*/

public class ExceptionOnArray {
    public static void main(String[] args) {

        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // ini akan menyebabkan error (index out of bounds)
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
