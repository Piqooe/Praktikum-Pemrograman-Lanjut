package tugas_praktikum.pemlanModul2Bab5.KonstantaFinal;

public class TestVehicle1 {
    public static void main(String[] args) {
        System.out.println("Creating a vehicle with a 10,000 kg maximumload.");

        Vehicle1 vehicle = new Vehicle1();
        System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500));
        System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250));
        System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000));
        System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000));
        System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300));
        System.out.println("Vehicle load is " + vehicle.getLoad() + "kg");

        System.out.println("\nCreating a vehicle with a 1,000 kg maximumload.");
        Vehicle1 vehicle2 = new Vehicle1(1000);
        System.out.println("Add box #1 (500kg) : " + vehicle2.addBox(500));
        System.out.println("Add box #2 (600kg) : " + vehicle2.addBox(600)); // Should fail
        System.out.println("Vehicle2 load is " + vehicle2.getLoad() + "kg");
    }
}