package tugas_praktikum.pemlanModul3Bab7;

public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Brownies", 50000, 1.5);
        daftarKue[1] = new KueJadi("Bolu Karamel", 30000, 2);
        daftarKue[2] = new KuePesanan("Lapis Legit", 120000, 2.0);
        daftarKue[3] = new KueJadi("Kue Sus", 5000, 10);
        daftarKue[4] = new KuePesanan("Kue Tart", 200000, 3.5);
        daftarKue[5] = new KueJadi("Onde-Onde", 2000, 15);
        daftarKue[6] = new KuePesanan("Kue Cubit", 15000, 0.5);
        daftarKue[7] = new KueJadi("Nastar", 40000, 3);
        daftarKue[8] = new KuePesanan("Kastengel", 60000, 1.0);
        daftarKue[9] = new KueJadi("Kue Lumpur", 3000, 8);
        daftarKue[10] = new KuePesanan("Putri Salju", 55000, 1.2);
        daftarKue[11] = new KueJadi("Kue Pukis", 2500, 12);
        daftarKue[12] = new KuePesanan("Bika Ambon", 80000, 1.8);
        daftarKue[13] = new KueJadi("Kue Lapis", 4000, 20);
        daftarKue[14] = new KuePesanan("Kue Mangkok", 10000, 0.8);
        daftarKue[15] = new KueJadi("Lemper", 3500, 10);
        daftarKue[16] = new KuePesanan("Kue Ku", 12000, 0.6);
        daftarKue[17] = new KueJadi("Dadar Gulung", 2000, 15);
        daftarKue[18] = new KuePesanan("Kue Talam", 15000, 0.9);
        daftarKue[19] = new KueJadi("Kue Serabi", 5000, 6);

        for (Kue kue : daftarKue) {
            String jenisKue = kue instanceof KuePesanan ? "Kue Pesanan" : "Kue Jadi";
            System.out.println(kue.toString() + " | Jenis: " + jenisKue);
        }

        double totalHargaSemua = 0;
        for (Kue kue : daftarKue) {
            totalHargaSemua += kue.hitungHarga();
        }
        System.out.println("\nTotal Harga Semua Kue: Rp " + totalHargaSemua);

        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: Rp " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);

        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: Rp " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);

        Kue kueTermahal = daftarKue[0];
        for (Kue kue : daftarKue) {
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }
        System.out.println("\nKue dengan Harga Terbesar:");
        String jenisKueTermahal = kueTermahal instanceof KuePesanan ? "Kue Pesanan" : "Kue Jadi";
        System.out.println(kueTermahal.toString() + " | Jenis: " + jenisKueTermahal + " | Harga Akhir: Rp " + kueTermahal.hitungHarga());
    }
}
