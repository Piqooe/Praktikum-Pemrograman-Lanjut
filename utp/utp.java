package tugas_praktikum.utp;

import java.util.*;

public class utp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt())
            return;
        int n = scanner.nextInt();

        GymSystem sys = new GymSystem();

        for (int i = 0; i < n; i++) {
            String cmd = scanner.next();

            if (cmd.equals("ADD")) {
                String tipe = scanner.next();
                String id = scanner.next();
                String nama = scanner.next();
                sys.addMember(tipe, id, nama);
            } else if (cmd.equals("TOPUP")) {
                String id = scanner.next();
                int jumlah = scanner.nextInt();
                sys.topUp(id, jumlah);
            } else if (cmd.equals("BUY")) {
                String id = scanner.next();
                String layanan = scanner.next();
                int sesi = scanner.nextInt();
                sys.buy(id, layanan, sesi);
            } else if (cmd.equals("CHECK")) {
                String id = scanner.next();
                sys.check(id);
            } else if (cmd.equals("COUNT")) {
                System.out.println("Total member: " + sys.count());
            }
        }
        scanner.close();
    }
}
