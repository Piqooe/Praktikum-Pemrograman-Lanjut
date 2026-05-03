package tugas_praktikum.pemlanModul3Bab8;

import tugas_praktikum.pemlanModul3Bab8.Data.Hewan;
import tugas_praktikum.pemlanModul3Bab8.Data.Manusia;

public class Main {
    public static void main(String[] args) {
        System.out.println("Percobaan Objek Manusia");
        Manusia muhamfiqo = new Manusia("Muhamfiqo", 19);
        muhamfiqo.makan();
        muhamfiqo.berjalan();
        muhamfiqo.bersuara();
        muhamfiqo.tampilkanNama();
        muhamfiqo.tampilkanUmur();

        System.out.println("\nPercobaan Objek Hewan");
        Hewan hewan = new Hewan("Kucing", 3);
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
        hewan.tampilkanNama();
        hewan.tampilkanUmur();
    }
}
