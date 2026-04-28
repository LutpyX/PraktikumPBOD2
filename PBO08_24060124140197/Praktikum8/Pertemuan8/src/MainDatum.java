public class MainDatum {
    public static void main(String[] args) {
        Datum<Kucing> dataKucing = new Datum<>();

        Anggora a = new Anggora("Mimi", 3.5);
        dataKucing.setIsi(a);

        System.out.println("Isi datum: ");
        dataKucing.getIsi().bersuara();
        System.out.println("Bobot: " + dataKucing.getIsi().getBobot());
    }
}