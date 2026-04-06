package tugas_praktikum.pemlanKuis1.hard;

import java.util.Scanner;

public class Klinik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama = "";
        while (sc.hasNextLine()) {
            nama = sc.nextLine().trim();
            boolean isAlphabet = true;
            if (nama.isEmpty()) {
                isAlphabet = false;
            } else {
                for (int i = 0; i < nama.length(); i++) {
                    char c = nama.charAt(i);
                    if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                        isAlphabet = false;
                        break;
                    }
                }
            }
            if (isAlphabet) {
                break;
            } else {
                System.out.println("Mooo! Nama sapi harus pakai huruf, bukan angka atau simbol!");
            }
        }

        int berat = 0;
        while (sc.hasNextLine()) {
            String beratStr = sc.nextLine().trim();
            try {
                berat = Integer.parseInt(beratStr);
                if (berat >= 1) {
                    break;
                } else {
                    System.out.println("Sapi astral? Masukkan berat yang valid dulu, bestie!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sapi astral? Masukkan berat yang valid dulu, bestie!");
            }
        }

        String layanan = "";
        while (sc.hasNextLine()) {
            layanan = sc.nextLine().trim();
            if (layanan.equals("spa") || layanan.equals("potong_kuku") || layanan.equals("grooming")) {
                break;
            } else {
                System.out.println("Pilih spa, potong_kuku, atau grooming! Sapi kamu mau dirawat apa, sih?");
            }
        }

        String kelas = "";
        while (sc.hasNextLine()) {
            kelas = sc.nextLine().trim();
            if (kelas.equals("reguler") || kelas.equals("vip")) {
                break;
            } else {
                System.out.println("Pilih reguler atau vip! Sapi kamu mau treatment sultan atau biasa aja?");
            }
        }

        sc.close();

        double hargaPerKg = 0;
        if (layanan.equals("spa")) {
            hargaPerKg = 8000;
        } else if (layanan.equals("potong_kuku")) {
            hargaPerKg = 6000;
        } else if (layanan.equals("grooming")) {
            hargaPerKg = 10000;
        }

        double biayaDasar = berat * hargaPerKg;
        double diskon = (berat > 30) ? (0.10 * biayaDasar) : 0;
        double tambahan = kelas.equals("vip") ? (0.20 * biayaDasar) : 0;

        double subtotal = biayaDasar - diskon + tambahan;
        double pajak = 0.08 * subtotal;
        
        boolean gratis = false;
        if (nama.equals("Moo") || nama.equals("Mooo") || nama.equals("Moooo")) {
            gratis = true;
        }
        
        double totalBiaya = gratis ? 0.0 : (subtotal + pajak);

        System.out.println("============= NOTA KLINIK SAPI =============");
        System.out.println("Nama Sapi: " + nama);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Jenis Layanan: " + layanan);
        System.out.println("Kelas: " + kelas);
        System.out.println("Biaya Dasar: Rp " + biayaDasar);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Biaya Tambahan VIP: Rp " + tambahan);
        System.out.println("Subtotal: Rp " + subtotal);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Total Biaya: Rp " + totalBiaya);
        System.out.println("============================================");

        if (gratis) {
            System.out.println("Terima kasih, " + nama + " ! Sapi spesial memang beda perlakuan~");
        } else {
            System.out.println("Terima kasih, " + nama + " ! Semoga sapinya makin glow up.");
        }
    }
}
