package tugas_praktikum.utp;

public abstract class Member {
    private String id;
    private String nama;
    private int saldo;

    public Member(String id, String nama) {
        this.id = id;
        this.nama = nama;
        this.saldo = 0;
    }

    public void topUp(int jumlah) {
        this.saldo += jumlah;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public String getInfo() {
        String tipe = this instanceof VIP ? "VIP" : "REGULER";
        return id + " | " + nama + " | " + tipe + " | saldo: " + saldo;
    }

    public int buy(String layanan, int sesi) {
        int harga = 0;
        if (layanan.equals("cardio"))
            harga = 20000;
        else if (layanan.equals("yoga"))
            harga = 25000;
        else if (layanan.equals("personal_training"))
            harga = 40000;

        int hargaDasar = harga * sesi;
        return hitungPembayaran(hargaDasar, sesi);
    }

    public abstract int hitungPembayaran(int hargaDasar, int sesi);

    public String getId() {
        return id;
    }
}
