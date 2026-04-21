class CivitasAkademika {
    String nama;

    String getNomor() {
        return "";
    }
}

class Dosen extends CivitasAkademika {
    String nip;

    String getNomor() {
        return nip;
    }
}

class Mahasiswa2 extends CivitasAkademika {
    String nim;
    Dosen wali;

    String getNomor() {
        return nim;
    }

    void setWali(Dosen d) {
        wali = d;
    }

    void tampilData() {
        System.out.println(nim + " | " + nama + " | Wali: " + wali.nama);
    }
}