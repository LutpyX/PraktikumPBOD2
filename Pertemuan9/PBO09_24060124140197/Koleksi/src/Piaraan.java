// Nama    : Muhammad Lutfi Febriansyah
// NIM     : 24060124140197
// Lab     : D2
// Tanggal : Selasa, 5 Mei 2026

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll();
        if (a != null) {
            nbelm--;
        }
        return a;
    }

    public void showAnabul() {
        System.out.println("Daftar Anabul:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public int bobotKucing() {
        return countKucing(); 
    }

    public void showJenisAnabul() {
        System.out.println("Daftar Anabul + Jenis:");
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + " - " + a.getClass().getSimpleName());
        }
    }
}
