package tugas_praktikum.pemlanModul3Bab8;

import tugas_praktikum.pemlanModul3Bab8.Data.Hewan;
import tugas_praktikum.pemlanModul3Bab8.Data.Manusia;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("=== Input Data Manusia ===");
        System.out.print("Masukkan Nama Manusia : ");
        String namaManusia = scanner.nextLine();
        System.out.print("Masukkan Umur Manusia : ");
        int umurManusia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n=== Input Data Hewan ===");
        System.out.print("Masukkan Nama Hewan   : ");
        String namaHewan = scanner.nextLine();
        System.out.print("Masukkan Umur Hewan   : ");
        int umurHewan = scanner.nextInt();

        System.out.println("\n===========================");
        System.out.println("Percobaan Objek Manusia");
        Manusia manusia = new Manusia(namaManusia, umurManusia);
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();
        manusia.tampilkanNama();
        manusia.tampilkanUmur();

        System.out.println("\nPercobaan Objek Hewan");
        Hewan hewan = new Hewan(namaHewan, umurHewan);
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
        hewan.tampilkanNama();
        hewan.tampilkanUmur();

        scanner.close();
    }
}
