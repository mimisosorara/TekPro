package Kasus1;

public class Restaurant {
    // Pecah ke class Menu dan ubah access modifier ke private
    private Menu[] menu;
    private static byte id=0;

    // Buat object menu dengan param max agar ukuran bisa sesuai pesanan
    public Restaurant(int max) {
        menu = new Menu[max];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        menu[id] = new Menu(nama, harga, stok);
        // Panggil method nextId()
        nextId();
    }

    // Ubah access modifier ke private
    private static void nextId(){
        id++;
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++){
            if(menu[i] != null && !menu[i].isOutOfStock()){
                System.out.println(menu[i].getNama() +"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga());

            }
        }
    }




}
