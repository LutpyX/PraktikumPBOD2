//Nama : Muhammad Lutfi Febriansyah
//NIM  : 24060124140197
//Lab  : D2

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Rama");
        mahasiswaList.add("Vela");
        mahasiswaList.add("Devano");
        mahasiswaList.add("Ferdy");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
    
}
