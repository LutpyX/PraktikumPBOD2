/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 21 April 2026
*/


public class Coercion {
    public static void main(String[] args) {

        int nilai = 65;

        System.out.println("Integer: " + nilai);
        System.out.println("Char: " + (char) nilai);
        System.out.println("Double: " + (double) nilai);

        double real = nilai;
        int kembali = (int) real;
        System.out.println("Kembali ke integer: " + kembali);


        String X = "1234";
        String Y = "5678";

        String S = X + Y; 
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S (gabungan): " + S);
        System.out.println("Z (penjumlahan): " + Z);

        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R (gabungan): " + R);
        System.out.println("D (penjumlahan): " + D);

        int A = Integer.parseInt(S);
        System.out.println("A: " + A);

        String T = Integer.toString(A);
        System.out.println("T: " + T);
    }
}