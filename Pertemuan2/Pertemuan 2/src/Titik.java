/*Nama File  : Titik.java
  Deskripsi  : berisi atribut dan method dalam class Titik
  Pembuat    : Muhammad Lutfi Febriansyah
  Tanggal    : Jum'at, 20 Februari 2026
*/




public class Titik {
    // Atribut
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // Method untuk mengatur nilai absis dan ordinat
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Mengembalikan nilai CounterTitik
    static int getCounterTitik(){
        return counterTitik;
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

    //Mengembalikan nilai kuadran dari titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1; // Kuadran I
        } else if (absis < 0 && ordinat > 0) {
            return 2; // Kuadran II
        } else if (absis < 0 && ordinat < 0) {
            return 3; // Kuadran III
        } else if (absis > 0 && ordinat < 0) {
            return 4; // Kuadran IV
        } else {
            return 0; // Titik berada pada sumbu atau di titik asal
        }
    }

    //Mengembalikan getjarakpusat dari titik ke titik lain
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //Mengembalikan jarak antara titik ini dengan titik T
    double getJarak(Titik t) {
        double dx = absis - t.getAbsis();
        double dy = ordinat - t.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    //refleksiX
    void refleksiX() {
        ordinat = -ordinat;
    }

    //refleksiY
    void refleksiY() {
        absis = -absis;
    }

    //getRefleksiX
    Titik getRefleksiX() {
        Titik tBaru = new Titik();
        tBaru.setAbsis(this.absis);
        tBaru.setOrdinat(-this.ordinat);
        return tBaru;
    } 

    //getRefleksiY
    Titik getRefleksiY() {
        Titik tBaru = new Titik();
        tBaru.setAbsis(-this.absis);
        tBaru.setOrdinat(this.ordinat);
        return tBaru;
    }
    
    } // End of class Titik