class Seminar {
    CivitasAkademika[] peserta = new CivitasAkademika[100];
    int banyakPeserta = 0;

    void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            peserta[banyakPeserta++] = c;
        }
    }

    int countPeserta() {
        return banyakPeserta;
    }

    int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }

    void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(peserta[i].getNomor() + " | " + peserta[i].nama);
        }
    }
}