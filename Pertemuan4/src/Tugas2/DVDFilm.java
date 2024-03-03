package Tugas2;

public class DVDFilm extends DVD{
    private String pemeran;
    private String sutradara;
    private String kategori;

    public DVDFilm(String judul, String publisher, int stok, String pemeran, String sutradara, String kategori) {
        super(judul, publisher, stok);
        this.pemeran = pemeran;
        this.sutradara = sutradara;
        this.kategori = kategori;
    }

    public String getPemeran() {
        return pemeran;
    }

    public void setPemeran(String pemeran) {
        this.pemeran = pemeran;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    public String toString() {
        return super.toString() + "\nPemeran: " + getPemeran()
                + "\nSutradara: " + getSutradara() + "\nKategori: " + getKategori();
    }

}
