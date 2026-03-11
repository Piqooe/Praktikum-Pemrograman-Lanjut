package tugas_praktikum.pemlanModul1Bab2.A_Constructor;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        // Student anna = new Student();
        // anna.setName("Anna");
        // anna.setAddress("Malang");
        // anna.setAge(20);
        // anna.setMath(100);
        // anna.setScience(89);
        // anna.setEnglish(80);
        // anna.displayMessage();

        // // menggunakan constructor lain
        // System.out.println("===================");
        // Student chris = new Student("Chris", "Kediri", 21);
        // chris.setMath(70);
        // chris.setScience(60);
        // chris.setEnglish(90);
        // chris.displayMessage();

        // // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui
        // // constructor
        // System.out.println("===================");
        // anna = new Student("anna", "Batu", 18);
        // anna.displayMessage();

        // // siswa denagan nama chris dirubah informasi alamat dan umurnya melalui
        // method
        // System.out.println("===================");
        // chris.setAddress("Surabaya");
        // chris.setAge(22);
        // chris.displayMessage();

        // // membuat objek menggunakan constructor dengan parameter nilai mata
        // pelajaran
        // System.out.println("===================");
        // Student budi = new Student(85, 90, 88);
        // budi.setName("Budi");
        // budi.setAddress("Bandung");
        // budi.setAge(20);
        // budi.displayMessage();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa yang ingin di data: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput Data Siswa ke-" + (i + 1));

            students[i] = new Student();

            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            students[i].setName(nama);

            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            students[i].setAddress(alamat);

            System.out.print("Umur: ");
            int umur = scanner.nextInt();
            students[i].setAge(umur);

            System.out.print("Nilai Matematika: ");
            int math = scanner.nextInt();
            students[i].setMath(math);

            System.out.print("Nilai Bahasa Inggris: ");
            int english = scanner.nextInt();
            students[i].setEnglish(english);

            System.out.print("Nilai Sains: ");
            int science = scanner.nextInt();
            students[i].setScience(science);

            scanner.nextLine();
        }

        System.out.println("\nHASIL DATA SISWA YANG TELAH DIINPUT");

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nSiswa ke-" + (i + 1) + ":");
            students[i].displayMessage();
        }

        System.out.println();
        Student.jumlahObjek();

        scanner.close();
    }
}