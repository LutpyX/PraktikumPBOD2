class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T nilai) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = nilai;
            banyak++;
        }
    }

    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return ruang[posisi - 1];
        }
        return null;
    }

    public int getSize() {
        return banyak;
    }
}