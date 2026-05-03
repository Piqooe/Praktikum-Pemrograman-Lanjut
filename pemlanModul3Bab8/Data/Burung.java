package tugas_praktikum.pemlanModul3Bab8.Data;

public class Burung implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;
    private String jenisBulu;

    public Burung(String nama, int umur, String jenisBulu) {
        this.nama = nama;
        this.umur = umur;
        this.jenisBulu = jenisBulu;
    }

    @Override
    public void makan() {
        System.out.println("Makan menggunakan paruh (biji-bijian/serangga)");
    }

    @Override
    public void berjalan() {
        System.out.println("Berjalan dan melompat menggunakan dua kaki kecil");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya berkicau dengan merdu (Cuit cuit)");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama burung: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur burung: " + this.umur + " tahun");
    }

    public void terbang() {
        System.out.println("Burung ini terbang mengepakkan sayapnya tinggi di angkasa!");
    }

    public void tampilkanJenisBulu() {
        System.out.println("Memiliki warna/jenis bulu: " + this.jenisBulu);
    }
}
