package tugas_praktikum.pemlanKuis1.easy;

import java.util.Scanner;

public class Tabungan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        Student[] accounts = new Student[100];
        int count = 0;

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if (command.equals("CREATE")) {
                String tipe = sc.next();
                String nama = sc.next();
                
                boolean found = false;
                for (int j = 0; j < count; j++) {
                    if (accounts[j].getNama().equals(nama)) {
                        found = true;
                        break;
                    }
                }
                
                if (found) {
                    System.out.println("Akun sudah terdaftar");
                } else {
                    if (tipe.equals("REGULER")) {
                        accounts[count++] = new Reguler(nama);
                        System.out.println("REGULER " + nama + " berhasil dibuat");
                    } else if (tipe.equals("BEASISWA")) {
                        accounts[count++] = new Beasiswa(nama);
                        System.out.println("BEASISWA " + nama + " berhasil dibuat");
                    }
                }
            } else if (command.equals("SAVE")) {
                String nama = sc.next();
                int jumlah = sc.nextInt();
                
                Student s = null;
                for (int j = 0; j < count; j++) {
                    if (accounts[j].getNama().equals(nama)) {
                        s = accounts[j];
                        break;
                    }
                }
                
                if (s == null) {
                    System.out.println("Akun tidak ditemukan");
                } else {
                    s.save(jumlah);
                }
            } else if (command.equals("TAKE")) {
                String nama = sc.next();
                int jumlah = sc.nextInt();
                
                Student s = null;
                for (int j = 0; j < count; j++) {
                    if (accounts[j].getNama().equals(nama)) {
                        s = accounts[j];
                        break;
                    }
                }
                
                if (s == null) {
                    System.out.println("Akun tidak ditemukan");
                } else {
                    s.take(jumlah);
                }
            } else if (command.equals("CHECK")) {
                String nama = sc.next();
                
                Student s = null;
                for (int j = 0; j < count; j++) {
                    if (accounts[j].getNama().equals(nama)) {
                        s = accounts[j];
                        break;
                    }
                }
                
                if (s != null) {
                    System.out.println(s.getNama() + " | " + s.getTipe() + " | saldo: " + s.getSaldo());
                }
            }
        }
        sc.close();
    }
}

abstract class Student {
    protected String nama;
    protected int saldo;
    protected String tipe;

    public Student(String nama, String tipe) {
        this.nama = nama;
        this.tipe = tipe;
        this.saldo = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTipe() {
        return tipe;
    }

    public void save(int jumlah) {
        saldo += jumlah;
        System.out.println("Saldo " + nama + ": " + saldo);
    }

    public abstract void take(int jumlah);
}

class Reguler extends Student {
    public Reguler(String nama) {
        super(nama, "REGULER");
    }

    @Override
    public void take(int jumlah) {
        if (saldo < jumlah) {
            System.out.println("Saldo " + nama + " tidak cukup");
        } else {
            saldo -= jumlah;
            System.out.println("Saldo " + nama + ": " + saldo);
        }
    }
}

class Beasiswa extends Student {
    public Beasiswa(String nama) {
        super(nama, "BEASISWA");
    }

    @Override
    public void take(int jumlah) {
        int biaya = jumlah - 1000;
        if (biaya < 0) {
            biaya = 0;
        }
        if (saldo < biaya) {
            System.out.println("Saldo " + nama + " tidak cukup");
        } else {
            saldo -= biaya;
            System.out.println("Saldo " + nama + ": " + saldo);
        }
    }
}
