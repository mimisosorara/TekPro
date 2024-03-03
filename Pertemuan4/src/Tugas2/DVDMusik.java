package Tugas2;

public class DVDMusik extends DVD{
    private String penyanyi;
    private String produser;
    private String tophits;
    private String kategori;

    public DVDMusik(String judul, String publisher, int stok, String penyanyi, String produser, String tophits, String kategori) {
        super(judul, publisher, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.tophits = tophits;
        this.kategori = kategori;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public String getProduser() {
        return produser;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public String getTophits() {
        return tophits;
    }

    public void setTophits(String tophits) {
        this.tophits = tophits;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    @Override
    public String toString() {
        return super.toString() + "\nPenyanyi: " + getPenyanyi() + "\nProduser: " + getProduser()
                + "\nTop Hits: " + getTophits() + "\nKategori: " + getKategori();
    }
}
