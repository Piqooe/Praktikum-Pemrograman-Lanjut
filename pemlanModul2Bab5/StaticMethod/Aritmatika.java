package tugas_praktikum.pemlanModul2Bab5.StaticMethod;

public class Aritmatika {
    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    public double hitungPembagian(String nil, String nil2) {
        double angka1 = Double.parseDouble(nil);
        double angka2 = Double.parseDouble(nil2);
        return angka1 / angka2;
    }
}