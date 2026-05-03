package tugas_praktikum.pemlanModul3Bab8;

import tugas_praktikum.pemlanModul3Bab8.Data.Hewan;
import tugas_praktikum.pemlanModul3Bab8.Data.Manusia;

public class Main {
    public static void main(String[] args) {
        System.out.println("Percobaan Objek Manusia");
        Manusia manusia = new Manusia("Budi", 20);
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();
        manusia.tampilkanNama();
        manusia.tampilkanUmur();

        System.out.println("\nPercobaan Objek Hewan");
        Hewan hewan = new Hewan("Kucing", 3);
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
        hewan.tampilkanNama();
        hewan.tampilkanUmur();
    }
}
