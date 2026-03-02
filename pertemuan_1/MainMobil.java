package tugas_praktikum.pertemuan_1;

import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        // instan objek bernama m1
        // Mobil m1 = new Mobil();
        Scanner input = new Scanner(System.in);

        // m1.setKecepatan(50);
        // m1.setManufaktur("Toyota");
        // m1.setNoPlat("AB 1231 UA");
        // m1.setWarna("Merah");
        // m1.displayMessage();
        // System.out.println("================");

        // instan objek baru bernama m2
        Mobil m2 = new Mobil();

        // m2.setKecepatan(100);
        // m2.setManufaktur("Mitsubishi");
        // m2.setNoPlat("N 1134 AG");
        // m2.setWarna("Pink");
        // m2.displayMessage();
        // System.out.println("================");

        // merubah warna dari objek m1
        // System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        // m1.setWarna("Hijau");

        // menampilkan hasil perubahan
        // m1.displayMessage();

        System.out.print("\nMasukkan kecepatan mobil: ");
        int kecepatan = input.nextInt();
        input.nextLine();
        m2.setKecepatan(kecepatan);
        System.out.print("\nMasukkan manufaktur mobil: ");
        String manufaktur = input.nextLine();
        m2.setManufaktur(manufaktur);
        System.out.print("\nMasukkan no plat mobil: ");
        String noPlat = input.nextLine();
        m2.setNoPlat(noPlat);
        System.out.print("\nMasukkan warna mobil: ");
        String warna = input.nextLine();
        m2.setWarna(warna);
        System.out.print("\nMasukkan waktu tempuh: ");
        double waktu = input.nextDouble();
        m2.setWaktu(waktu);
        m2.displayMessage();

        input.close();
    }
}