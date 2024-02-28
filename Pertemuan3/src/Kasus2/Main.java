package Kasus2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar produk
        Produk[] produk = new Produk[10];
        produk[0] = new Produk("Nasi Goreng", 15000);
        produk[1] = new Produk("Mie Goreng", 12000);
        produk[2] = new Produk("Soto Ayam", 18000);
        produk[3] = new Produk("Bakso", 15000);
        produk[4] = new Produk("Ayam Goreng", 20000);
        produk[5] = new Produk("Ikan Bakar", 25000);
        produk[6] = new Produk("Sate Ayam", 20000);
        produk[7] = new Produk("Gado-gado", 15000);
        produk[8] = new Produk("Es Teh", 5000);
        produk[9] = new Produk("Jus Jeruk", 7000);

        // Menampilkan menu
        System.out.println("**Menu Makanan**");
        for (int i = 0; i < produk.length; i++) {
            System.out.println((i + 1) + ". " + produk[i].getNamaProduk() + " - Rp" + produk[i].getHarga());
        }

        // Menginput pesanan
        Penjualan penjualan = new Penjualan();
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nMasukkan nomor produk yang ingin dipesan (0 untuk keluar): ");
            int pilihan = scanner.nextInt();
            if (pilihan == 0) {
                break;
            } else if (pilihan > 0 && pilihan <= produk.length) {
                System.out.println("Masukkan jumlah yang ingin dipesan: ");
                int qty = scanner.nextInt();
                produk[pilihan - 1].setQty(qty);
                penjualan.addProduk(produk[pilihan - 1]);
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            // Konfirmasi untuk memesan lagi
            System.out.println("Apakah ingin memesan makanan lain? (y/n)");
            String konfirmasi = scanner.next();
            lanjut = konfirmasi.equalsIgnoreCase("y");
        }

        // Menampilkan struk
        for (int i = 0; i < penjualan.getJumlahProduk(); i++) {
            System.out.println(penjualan.getDaftarProduk()[i].getNamaProduk() + " (" + penjualan.getDaftarProduk()[i].getQty() + ") - Rp" + penjualan.getDaftarProduk()[i].getTotalHarga());
        }
        System.out.println("Total: Rp" + penjualan.getTotalHarga());

        System.out.println("\nTerima kasih atas pesanan Anda!");
    }
}


