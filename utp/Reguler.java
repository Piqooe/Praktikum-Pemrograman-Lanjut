package tugas_praktikum.utp;

public class Reguler extends Member {
    public Reguler(String id, String nama) {
        super(id, nama);
    }

    @Override
    public int hitungPembayaran(int hargaDasar, int sesi) {
        int diskonSesi = (sesi > 5) ? (hargaDasar * 10 / 100) : 0;
        int subtotal = hargaDasar - diskonSesi;
        if (subtotal < 0)
            subtotal = 0;
        int pajak = subtotal * 5 / 100;
        return subtotal + pajak;
    }
}
