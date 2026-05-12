// Nama    : Muhammad Lutfi Febriansyah
// NIM     : 24060124140197
// Lab     : D2
// Tanggal : Selasa, 5 Mei 2026

import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;

    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return Lnama.size();
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

   public boolean isMember(String nama) {
    for (String n : Lnama) {
        if (n.equals(nama)) {
            return true;
        }
    }
    return false;
}

    public void gantiNama(String nama, String namaBaru) {
        int idx = Lnama.indexOf(nama);
        if (idx != -1) {
            Lnama.set(idx, namaBaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String n : Lnama) {
            System.out.println("- " + n);
        }
    }
}