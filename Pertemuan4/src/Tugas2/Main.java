package Tugas2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static DVD[] dvd = new DVD[10];
    static byte id=2;

    public static void main(String[] args) {
        dvd[0] = new DVDFilm("Fate/kaleid liner PRISMA☆ILLYA: Vow in the Snow", "KADOKAWA",1,"Noriaki Sugiyama, Kaori Nazuka","Shin Oonuma","R");
        dvd[1] = new DVDMusik("Secretgarden","Lantis",3,"ChouCho","Lantis","starlog, Sora to kimi no message","P");

        int pilihan;
        do {
            System.out.println("======= MENU =======");
            System.out.println("1. Entri Data DVD Film");
            System.out.println("2. Entri Data DVD Musik");
            System.out.println("3. View Data DVD");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    entriDataDVDFilm();
                    break;
                case 2:
                    entriDataDVDMusik();
                    break;
                case 3:
                    viewDataDVD();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }

    private static void entriDataDVDFilm() {
        System.out.println("==== Entri Data DVD Film ====");
        System.out.println("Judul: ");
        String judul = scanner.next();
        System.out.println("Publisher: ");
        String publisher = scanner.next();
        System.out.println("Stok: ");
        int stok = scanner.nextInt();
        System.out.println("Pemeran: ");
        String pemeran = scanner.next();
        System.out.println("Sutradara: ");
        String sutradara = scanner.next();
        System.out.println("Kategori (SU/D/R/A): ");
        String kategori = scanner.next();

        dvd[id] = new DVDFilm(judul, publisher, stok, pemeran, sutradara, kategori);
        nextId();
        System.out.println("Data DVD Film berhasil disimpan.");
        System.out.println(dvd[id-1]);
    }

    private static void entriDataDVDMusik() {
        System.out.println("==== Entri Data DVD Musik ====");
        System.out.println("Judul: ");
        String judul = scanner.next();
        System.out.println("Publisher: ");
        String publisher = scanner.next();
        System.out.println("Stok: ");
        int stok = scanner.nextInt();
        System.out.println("Penyanyi: ");
        String penyanyi = scanner.next();
        System.out.println("Produser: ");
        String produser = scanner.next();
        System.out.println("Top Hits: ");
        String tophits = scanner.next();
        System.out.println("Kategori (C/J/P/R/O): ");
        String kategori = scanner.next();

        dvd[id] = new DVDMusik(judul, publisher, stok, penyanyi, produser, tophits, kategori);
        nextId();
        System.out.println("Data DVD Musik berhasil disimpan.");
        System.out.println(dvd[id-1]);
    }

    private static void viewDataDVD() {
        System.out.println("==== View Data DVD ====");
        // Implementasi view data DVD
        for (int i = 0; i <= id; i++){
            if(dvd[i] != null){
                System.out.println(dvd[i]);
            }
        }
    }
    private static void nextId(){

        id++;
    }
}
