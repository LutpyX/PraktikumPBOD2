/*  Nama      : Muhammad Lutfi Febriansyah
    NIM       : 24060124140197
    Tanggal   : Selasa, 21 April 2026
*/

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println("Kucing melata");
    }

    void bersuara() {
        System.out.println("Meong");
    }
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println("Anjing melata");
    }

    void bersuara() {
        System.out.println("Guk-guk");
    }
}

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println("Burung terbang");
    }

    void bersuara() {
        System.out.println("Cuit");
    }
}