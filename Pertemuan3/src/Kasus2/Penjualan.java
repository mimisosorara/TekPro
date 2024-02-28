package Kasus2;

public class Penjualan {
    private Produk[] daftarProduk;
    private int totalHarga;
    private int jumlahProduk;

    public Penjualan() {
        daftarProduk = new Produk[10];
        totalHarga = 0;
        jumlahProduk = 0;
    }

    public void addProduk(Produk produk) {
        if (jumlahProduk < daftarProduk.length) {
            daftarProduk[jumlahProduk++] = produk;
            totalHarga += produk.getTotalHarga();
        } else {
            System.out.println("Pesanan melebihi batas!");
        }
    }

    public Produk[] getDaftarProduk() {
        return daftarProduk;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }
}
