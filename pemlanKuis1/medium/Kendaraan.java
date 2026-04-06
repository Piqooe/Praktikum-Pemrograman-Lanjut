package tugas_praktikum.pemlanKuis1.medium;

import java.util.Scanner;

public class Kendaraan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine(); 
        
        Vehicle[] vehicles = new Vehicle[100];
        int count = 0;

        for (int i = 0; i < n; ) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            i++;
            String[] parts = line.split("\\s+");
            String cmd = parts[0];

            if (cmd.equals("ADD")) {
                String tipe = parts[1];
                String kode = parts[2];
                String nama = parts[3];
                int harga = Integer.parseInt(parts[4]);

                boolean found = false;
                for (int j = 0; j < count; j++) {
                    if (vehicles[j].getKode().equals(kode)) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println("Kendaraan sudah terdaftar");
                } else {
                    if (tipe.equals("CAR")) {
                        vehicles[count++] = new Car(kode, nama, harga);
                        System.out.println("CAR " + kode + " berhasil ditambahkan");
                    } else if (tipe.equals("BIKE")) {
                        vehicles[count++] = new Bike(kode, nama, harga);
                        System.out.println("BIKE " + kode + " berhasil ditambahkan");
                    }
                }
            } else if (cmd.equals("RENT")) {
                String kode = parts[1];
                int hari = Integer.parseInt(parts[2]);
                boolean promo = parts.length > 3 && parts[3].equalsIgnoreCase("PROMO");

                Vehicle v = null;
                for (int j = 0; j < count; j++) {
                    if (vehicles[j].getKode().equals(kode)) {
                        v = vehicles[j];
                        break;
                    }
                }

                if (v == null) {
                    System.out.println("Kendaraan tidak ditemukan");
                } else {
                    v.rent(hari, promo);
                }
            } else if (cmd.equals("RETURN")) {
                String kode = parts[1];
                
                Vehicle v = null;
                for (int j = 0; j < count; j++) {
                    if (vehicles[j].getKode().equals(kode)) {
                        v = vehicles[j];
                        break;
                    }
                }

                if (v == null) {
                    System.out.println("Kendaraan tidak ditemukan");
                } else {
                    v.returnVehicle();
                }
            } else if (cmd.equals("DETAIL")) {
                String kode = parts[1];
                
                Vehicle v = null;
                for (int j = 0; j < count; j++) {
                    if (vehicles[j].getKode().equals(kode)) {
                        v = vehicles[j];
                        break;
                    }
                }

                if (v == null) {
                    System.out.println("Kendaraan tidak ditemukan");
                } else {
                    String statusStr = v.isTersedia() ? "TERSEDIA" : "DISEWA";
                    System.out.println(v.getKode() + " | " + v.getTipe() + " | " + v.getNama() + " | harga: " + v.getHarga() + " | status: " + statusStr);
                }
            } else if (cmd.equals("COUNT")) {
                System.out.println("Total kendaraan: " + count);
            }
        }
        sc.close();
    }
}

abstract class Vehicle {
    protected String kode;
    protected String nama;
    protected int harga;
    protected boolean tersedia;
    protected String tipe;

    public Vehicle(String kode, String nama, int harga, String tipe) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.tipe = tipe;
        this.tersedia = true;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getTipe() {
        return tipe;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void returnVehicle() {
        if (tersedia) {
            System.out.println("Kendaraan belum disewa");
        } else {
            tersedia = true;
            System.out.println(kode + " berhasil dikembalikan");
        }
    }

    public abstract void rent(int hari, boolean promo);
}

class Car extends Vehicle {
    public Car(String kode, String nama, int harga) {
        super(kode, nama, harga, "CAR");
    }

    @Override
    public void rent(int hari, boolean promo) {
        if (!tersedia) {
            System.out.println("Kendaraan sedang disewa");
        } else {
            int diskon = promo ? 20000 : 0;
            int total = (harga * hari) - diskon;
            if (total < 0) total = 0;
            tersedia = false;
            System.out.println("Total sewa " + kode + ": " + total);
        }
    }
}

class Bike extends Vehicle {
    public Bike(String kode, String nama, int harga) {
        super(kode, nama, harga, "BIKE");
    }

    @Override
    public void rent(int hari, boolean promo) {
        if (!tersedia) {
            System.out.println("Kendaraan sedang disewa");
        } else {
            int diskon = promo ? 10000 : 0;
            int total = (harga * hari) - diskon;
            if (total < 0) total = 0;
            tersedia = false;
            System.out.println("Total sewa " + kode + ": " + total);
        }
    }
}
