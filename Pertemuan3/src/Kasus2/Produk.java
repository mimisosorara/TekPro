package Kasus2;

public class Produk {
    private String namaProduk;
    private int harga;
    private int qty;

    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.qty = 0;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public int getTotalHarga() {
        return harga * qty;
    }
}
