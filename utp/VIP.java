package tugas_praktikum.utp;

public class VIP extends Member {
    public VIP(String id, String nama) {
        super(id, nama);
    }

    @Override
    public int hitungPembayaran(int hargaDasar, int sesi) {
        int diskonSesi = (sesi > 5) ? (hargaDasar * 10 / 100) : 0;
        int diskonMember = hargaDasar * 15 / 100;
        int subtotal = hargaDasar - diskonSesi - diskonMember;
        if (subtotal < 0)
            subtotal = 0;
        int pajak = subtotal * 5 / 100;
        return subtotal + pajak;
    }
}
