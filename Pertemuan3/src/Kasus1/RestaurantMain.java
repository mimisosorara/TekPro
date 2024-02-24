package Kasus1;

public class RestaurantMain {
    public static void main(String[] args){
        // Penambahan argumen karena ditambahkannya parameter max
        // Pemanggilan nextId dihapus karena dipanggil setiap penambahan
        Restaurant menu = new Restaurant(10);
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000,20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();
    }
}
