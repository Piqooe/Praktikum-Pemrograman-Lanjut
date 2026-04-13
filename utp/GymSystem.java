package tugas_praktikum.utp;

import java.util.*;

public class GymSystem {
    private List<Member> members = new ArrayList<>();

    public void addMember(String tipe, String id, String nama) {
        if (findMember(id) != null) {
            System.out.println("Member sudah terdaftar");
            return;
        }
        if (tipe.equals("REGULER")) {
            members.add(new Reguler(id, nama));
        } else if (tipe.equals("VIP")) {
            members.add(new VIP(id, nama));
        }
        System.out.println(tipe + " " + id + " berhasil ditambahkan");
    }

    public void topUp(String id, int jumlah) {
        Member m = findMember(id);
        if (m == null) {
            System.out.println("Member tidak ditemukan");
            return;
        }
        m.topUp(jumlah);
        System.out.println("Saldo " + id + ": " + m.getSaldo());
    }

    public void buy(String id, String layanan, int sesi) {
        Member m = findMember(id);
        if (m == null) {
            System.out.println("Member tidak ditemukan");
            return;
        }

        if (!layanan.equals("cardio") && !layanan.equals("yoga") && !layanan.equals("personal_training")) {
            System.out.println("Layanan tidak valid");
            return;
        }

        int total = m.buy(layanan, sesi);

        if (m.getSaldo() < total) {
            System.out.println("Saldo " + id + " tidak cukup");
            return;
        }

        m.topUp(-total);
        System.out.println("Total bayar " + id + ": " + total);
        System.out.println("Saldo " + id + ": " + m.getSaldo());
    }

    public void check(String id) {
        Member m = findMember(id);
        if (m == null) {
            System.out.println("Member tidak ditemukan");
            return;
        }
        System.out.println(m.getInfo());
    }

    public int count() {
        return members.size();
    }

    public Member findMember(String id) {
        for (Member m : members) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }
}
