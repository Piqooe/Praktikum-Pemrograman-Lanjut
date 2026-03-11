package tugas_praktikum.pemlanModul1Bab2;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private static int objectCount = 0;

    public Student() {
        objectCount++;
        name = "";
        address = "";
        age = 0;
    }

    public Student(String n, String a, int ag) {
        objectCount++;
        name = n;
        address = a;
        age = ag;
    }

    public Student(double math, double english, double science) {
        objectCount++;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    public boolean statusAkhir() {
        return getAverage() > 60;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    public static void jumlahObjek() {
        System.out.println("Jumlah objek Student yang dibuat: " + objectCount);
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        if (statusAkhir()) {
            System.out.println("Status : Lulus");
        } else {
            System.out.println("Status : Tidak Lulus");
        }
    }
}
