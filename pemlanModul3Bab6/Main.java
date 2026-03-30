package tugas_praktikum.pemlanModul3Bab6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEST CASE MANUSIA");
        Manusia m1 = new Manusia("Budi", "111", true, true);
        System.out.println(m1.toString());
        System.out.println();

        Manusia m2 = new Manusia("Siti", "222", false, true);
        System.out.println(m2.toString());
        System.out.println();

        Manusia m3 = new Manusia("Andi", "333", true, false);
        System.out.println(m3.toString());
        System.out.println();

        System.out.println("TEST CASE MAHASISWA FILKOM");
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("Iqbal", "444", true, false, "215150201111111", 2.9);
        System.out.println(mhs1.toString());
        System.out.println();

        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("Caca", "555", false, false, "225150201111112", 3.4);
        System.out.println(mhs2.toString());
        System.out.println();

        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("Fulan", "666", true, false, "235150201111113", 3.8);
        System.out.println(mhs3.toString());
        System.out.println();

        System.out.println("TEST CASE PEKERJA");
        Pekerja p1 = new Pekerja("Anton", "777", true, true, 5000, LocalDate.now().minusYears(2), 2);
        System.out.println(p1.toString());
        System.out.println();

        Pekerja p2 = new Pekerja("Ani", "888", false, true, 6000, LocalDate.now().minusYears(9), 0);
        System.out.println(p2.toString());
        System.out.println();

        Pekerja p3 = new Pekerja("Joko", "999", true, true, 8000, LocalDate.now().minusYears(20), 10);
        System.out.println(p3.toString());
        System.out.println();

        System.out.println("TEST CASE MANAGER");
        Manager mgr = new Manager("Rina", "101", false, true, 7500, LocalDate.now().minusYears(15), 0, "IT");
        System.out.println(mgr.toString());
    }
}
