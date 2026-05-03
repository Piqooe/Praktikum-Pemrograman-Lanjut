package tugas_praktikum.pemlanModul3Bab8;

import tugas_praktikum.pemlanModul3Bab8.Data.Burung;
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
        scanner.nextLine();

        System.out.println("\n=== Input Data Burung (Objek Baru) ===");
        System.out.print("Masukkan Nama Burung  : ");
        String namaBurung = scanner.nextLine();
        System.out.print("Masukkan Umur Burung  : ");
        int umurBurung = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Warna Bulu   : ");
        String warnaBulu = scanner.nextLine();

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

        System.out.println("\nPercobaan Objek Burung (Dengan Method Berbeda)");
        Burung burung = new Burung(namaBurung, umurBurung, warnaBulu);
        burung.makan();
        burung.berjalan();
        burung.bersuara();
        burung.tampilkanNama();
        burung.tampilkanUmur();
        burung.terbang();
        burung.tampilkanJenisBulu();

        scanner.close();
    }
}
