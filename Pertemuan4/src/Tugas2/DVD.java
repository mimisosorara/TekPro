package Tugas2;

public class DVD {
    private String judul;
    private String publisher;
    private int stok;

    public DVD(String judul, String publisher, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    public String toString() {
        return "\nJudul: " + getJudul() + "\nStok: " + getStok()
                + "\nPublisher: " + getPublisher();
    }
}
