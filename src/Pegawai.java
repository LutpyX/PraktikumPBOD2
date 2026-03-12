// Nama     : Muhammad Lutfi Febriansyah
// NIM      : 24060124140197
// Lab      : D1
// Tanggal  : Selasa, 10 Maret 2026

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {

    protected String nip;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public Period getMasaKerja(){
        return Period.between(tmt, LocalDate.now());
    }

    public void printInfo(){
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("TMT : " + tmt);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}