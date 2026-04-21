/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 21 April 2026
*/

class Mahasiswa {
    String nim;
    String nama;
    String programStudi;

    // Constructor default
    Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }

    // Constructor lengkap
    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = prodi;
    }

    // Constructor cloning
    Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // Overloading method
    void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    void tampil() {
        System.out.println(nim + " | " + nama + " | " + programStudi);
    }
}