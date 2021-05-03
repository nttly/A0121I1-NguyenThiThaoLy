package demoClass;

public class NhanVien {
    private String name;
    private int age;
    private int salary;

    public NhanVien(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float calcPersonTax() {
        if (this.salary < 5000000) {
            return this.salary * (float) 0.05;
        }
        if (this.salary < 9000000) {
            return this.salary * (float) 0.1;
        }
        if (this.salary < 18000000) {
            return this.salary * (float) 0.15;
        }
        if (this.salary < 28000000) {
            return this.salary * (float) 0.2;
        }

        return this.salary*(float)0.25;
    }
}