/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 28 April 2026
*/

// Superclass
class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println("Suara Anabul");
    }
}

// Kucing
class Kucing extends Anabul {
    protected double bobot; // dalam kg

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Meong");
    }
}

// Anggora
class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }
}

// KembangTelon
class KembangTelon extends Kucing {
    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }
}
