/*Nama File  : MTitik.java
  Deskripsi  : berisi atribut dan method dalam class Titik
  Pembuat    : Muhammad Lutfi Febriansyah
  Tanggal    : Selasa, 24 Februari 2026
*/
public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        Titik T2 = new Titik();
        T2.printTitik();

        T1.geser(3, 4);
        T1.printTitik();
        T2.printTitik();

        T2 = T1.getRefleksiX();
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println("Jarak ke T1 sendiri: " + T1.getJarak(T1));
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik());
        

    }

}