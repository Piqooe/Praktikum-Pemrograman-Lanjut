package tugas_praktikum.pemlanModul3Bab8.Praktikum;

public class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public Integer getPayableAmount() {
        Integer totalHutang = 0;
        if (invoices != null) {
            for (Invoice inv : invoices) {
                Payable p = inv;
                totalHutang += p.getPayableAmount();
            }
        }
        return this.salaryPerMonth - totalHutang;
    }

    public void cetakInformasiGaji() {
        System.out.println("=======================================");
        System.out.println("        SLIP GAJI KARYAWAN NV. MENEER  ");
        System.out.println("=======================================");
        System.out.println("No Registrasi : " + this.registrationNumber);
        System.out.println("Nama Karyawan : " + this.name);
        System.out.println("Gaji Pokok    : Rp " + this.salaryPerMonth);
        System.out.println("\n--- Detail Belanja Koperasi ---");

        Integer totalHutang = 0;
        if (invoices != null && invoices.length > 0) {
            for (int i = 0; i < invoices.length; i++) {
                Payable p = invoices[i];
                System.out.println("- " + invoices[i].getProductName() +
                        " | " + invoices[i].getQuantity() + " pcs @ Rp" + invoices[i].getPricePerItem() +
                        " = Rp " + p.getPayableAmount());
                totalHutang += p.getPayableAmount();
            }
        } else {
            System.out.println("Tidak ada catatan hutang belanja.");
        }

        System.out.println("---------------------------------------");
        System.out.println("Total Hutang Koperasi : Rp " + totalHutang);
        System.out.println("=======================================");

        Payable employeePayable = this;
        System.out.println("GAJI BERSIH DITERIMA  : Rp " + employeePayable.getPayableAmount());
        System.out.println("=======================================");
    }
}
