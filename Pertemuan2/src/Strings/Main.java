package Strings;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Masukkan string A dan B");
        // menyiapkan scanner untuk membaca input lalu dimasukkan ke string
        Scanner a = new Scanner(System.in);
        String A = a.nextLine();
        Scanner b = new Scanner(System.in);
        String B = b.nextLine();
        // menampilkan hasil penjumlahan panjang dari kedua string
        System.out.println(A.length()+B.length());
        // mengecek jika B tampil di kamus sebelum A
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // menampilkan output gabungan kedua string dimana huruf pertama tiap string adalah huruf kapital
        String output = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(output);
    }
}
