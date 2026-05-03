package tugas_praktikum.pemlanModul3Bab8.Praktikum;

public class Main {
    public static void main(String[] args) {
        Invoice belanja1 = new Invoice("Beras 5kg", 1, 75000);
        Invoice belanja2 = new Invoice("Minyak Goreng 2L", 2, 35000);
        Invoice belanja3 = new Invoice("Gula Pasir 1kg", 3, 16000);

        Invoice[] daftarBelanja = { belanja1, belanja2, belanja3 };

        Employee karyawan = new Employee(10245, "Muhamfiqo", 4000000, daftarBelanja);

        karyawan.cetakInformasiGaji();
    }
}
