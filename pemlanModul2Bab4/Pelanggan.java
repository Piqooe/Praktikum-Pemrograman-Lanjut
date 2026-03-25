package tugas_praktikum.pemlanModul2Bab4;

public class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private String pin;
    private int kesalahanAuth;
    private boolean isBlocked;

    public Pelanggan(String nomorPelanggan, String nama, double saldoAwal, String pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldoAwal;
        this.pin = pin;
        this.kesalahanAuth = 0;
        this.isBlocked = false;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    private boolean autentikasi(String inputNomor, String inputPin) {
        if (isBlocked) {
            System.out.println("TRANSAKSI GAGAL: Akun Anda telah diblokir karena terlalu banyak kesalahan PIN.");
            return false;
        }

        if (this.nomorPelanggan.equals(inputNomor) && this.pin.equals(inputPin)) {
            kesalahanAuth = 0;
            return true;
        } else {
            kesalahanAuth++;
            System.out.println("Autentikasi gagal. Kesalahan ke-" + kesalahanAuth);
            if (kesalahanAuth >= 3) {
                isBlocked = true;
                System.out.println("Akun Anda telah DIBLOKIR karena melakukan 3x kesalahan.");
            }
            return false;
        }
    }

    private double hitungCashback(double nominalPembelian) {
        String jenis = nomorPelanggan.substring(0, 2);
        double cashback = 0.0;

        switch (jenis) {
            case "38":
                if (nominalPembelian > 1000000) {
                    cashback = nominalPembelian * 0.05;
                }
                break;
            case "56":
                if (nominalPembelian > 1000000) {
                    cashback = nominalPembelian * 0.07;
                } else {
                    cashback = nominalPembelian * 0.02;
                }
                break;
            case "74":
                if (nominalPembelian > 1000000) {
                    cashback = nominalPembelian * 0.10;
                } else {
                    cashback = nominalPembelian * 0.05;
                }
                break;
            default:
                break;
        }
        return cashback;
    }

    public void pembelian(String inputNomor, String inputPin, double nominal) {
        System.out.println("\n--- Proses Pembelian ---");
        if (!autentikasi(inputNomor, inputPin)) {
            return;
        }

        if (nominal <= 0) {
            System.out.println("Nominal pembelian tidak valid.");
            return;
        }

        if (saldo < nominal) {
            System.out.println("Transaksi GAGAL. Saldo tidak mencukupi untuk pembelian ini.");
            return;
        }

        double cashback = hitungCashback(nominal);
        double saldoPascaTransaksi = saldo - nominal + cashback;

        if (saldoPascaTransaksi < 10000) {
            System.out.println("Transaksi GAGAL. Saldo pasca transaksi (Rp" + saldoPascaTransaksi + ") kurang dari batas minimal Rp10.000.");
        } else {
            saldo = saldoPascaTransaksi;
            System.out.println("Transaksi BERHASIL.");
            System.out.println("Nominal Pembelian : Rp" + nominal);
            System.out.println("Cashback didapat  : Rp" + cashback);
            System.out.println("Sisa Saldo Anda   : Rp" + saldo);
        }
    }

    public void topUp(String inputNomor, String inputPin, double nominal) {
        System.out.println("\n--- Proses Top Up ---");
        if (!autentikasi(inputNomor, inputPin)) {
            return;
        }

        if (nominal <= 0) {
            System.out.println("Nominal top up tidak valid.");
            return;
        }

        saldo += nominal;
        System.out.println("Top Up BERHASIL. Saldo Anda sekarang: Rp" + saldo);
    }
}
