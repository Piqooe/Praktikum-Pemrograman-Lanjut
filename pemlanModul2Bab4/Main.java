package tugas_praktikum.pemlanModul2Bab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Pelanggan[] daftarPelanggan = {
            new Pelanggan("3812345678", "Andi (Silver)", 50000, "123456"),
            new Pelanggan("5612345678", "Budi (Gold)", 2000000, "654321"),
            new Pelanggan("7412345678", "Citra (Platinum)", 5000000, "111222")
        };

        System.out.println("=== Selamat Datang di Sistem Transaksi Swalayan Tiny ===");
        System.out.println("Daftar Akun Tersedia untuk Testing:");
        System.out.println("1. Andi  - Nomor: 3812345678 (Silver),   Pin: 123456, Saldo: Rp 50.000");
        System.out.println("2. Budi  - Nomor: 5612345678 (Gold),     Pin: 654321, Saldo: Rp 2.000.000");
        System.out.println("3. Citra - Nomor: 7412345678 (Platinum), Pin: 111222, Saldo: Rp 5.000.000");

        while (true) {
            System.out.println("\n--- Menu Utama ---");
            System.out.println("1. Pembelian");
            System.out.println("2. Top Up");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu (1/2/3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 3) {
                System.out.println("Terima kasih telah berbelanja di Swalayan Tiny!");
                break;
            }

            if (pilihan == 1 || pilihan == 2) {
                System.out.print("Masukkan Nomor Pelanggan (10 digit): ");
                String noPelanggan = scanner.nextLine();

                Pelanggan akunAktif = null;
                for (Pelanggan p : daftarPelanggan) {
                    if (p.getNomorPelanggan().equals(noPelanggan)) {
                        akunAktif = p;
                        break;
                    }
                }

                if (akunAktif == null) {
                    System.out.println("Akun/Nomor pelanggan tidak ditemukan!");
                    continue;
                }

                System.out.print("Masukkan PIN: ");
                String pin = scanner.nextLine();

                if (pilihan == 1) {
                    System.out.print("Masukkan nominal pembelian: Rp");
                    double nominal = scanner.nextDouble();
                    scanner.nextLine();
                    
                    akunAktif.pembelian(noPelanggan, pin, nominal);
                    
                } else if (pilihan == 2) {
                    System.out.print("Masukkan nominal top up: Rp");
                    double nominal = scanner.nextDouble();
                    scanner.nextLine();
                    
                    akunAktif.topUp(noPelanggan, pin, nominal);
                }

            } else {
                System.out.println("Pilihan tidak valid, mohon ulangi.");
            }
        }
        
        scanner.close();
    }
}
