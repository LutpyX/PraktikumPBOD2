/*Nama File  : Titik.java
  Deskripsi  : berisi atribut dan method dalam class Titik
  Pembuat    : Muhammad Lutfi Febriansyah
  Tanggal    : Jum'at, 20 Februari 2026
*/




public class Titik {
    // Atribut
    double absis;
    double ordinat;

    // Method untuk mengatur nilai absis dan ordinat
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    //Mengambalikan Nilai Absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat 
    double getOrdinat(){
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //mengeset nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
} // End of class Titik
