package Kasus1;

public class Menu {

        // attribute
        private String nama;
        private double harga;
        private int stok;

        // constructor
        public Menu(String nama, double harga, int stok) {
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
        }

        // getter dan setter
        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public double getHarga() {
            return harga;
        }

        public void setHarga(double harga) {
            this.harga = harga;
        }

        public int getStok() {
            return stok;
        }

        public void setStok(int stok) {
            this.stok = stok;
        }

        // method
        public boolean isOutOfStock(){
            if (getStok() == 0){
                return true;
            }else {
                return false;
            }
        }

}
