//Nama : Muhammad Lutfi Febriansyah
//NIM  : 24060124140197
//Lab  : D2

import java.util.HashMap;
import java.util.Map;

public class LambdaMapMahasiswa {
    public static void main(String[] args) {

        // Membuat object Map
        Map<String, String> mahasiswa = new HashMap<>();

        // Menambahkan data ke Map
        mahasiswa.put("231001", "Rama");
        mahasiswa.put("231002", "Vela");
        mahasiswa.put("231003", "Devano");
        mahasiswa.put("231004", "Ferdy");

        // Menampilkan key dan value menggunakan lambda
        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}