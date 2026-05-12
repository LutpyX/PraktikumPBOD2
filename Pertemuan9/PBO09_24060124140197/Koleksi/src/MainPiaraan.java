/**
 * File : MainPiaraan.java
 * Deskripsi : Main program Piaraan
 */

public class MainPiaraan {

    public static void main(String[] args) {

        Piaraan p = new Piaraan();

        p.enqueueAnabul(new Kucing("Usro"));
        p.enqueueAnabul(new Anjing("fuso"));
        p.enqueueAnabul(new Burung("Rusdi"));
        p.enqueueAnabul(new Kucing("Cipung"));

        p.showAnabul();

        System.out.println("\nJumlah elemen : "
                + p.getNbelm());

        System.out.println("Jumlah Kucing : "
                + p.countKucing());

        System.out.println("Bobot Kucing : "
                + p.bobotKucing());

        System.out.println();

        p.showJenisAnabul();

        System.out.println("\nDequeue : "
                + p.dequeueAnabul().getNama());

        System.out.println("\nSetelah dequeue:");
        p.showAnabul();
    }
}