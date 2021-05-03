package demoClass;

public class Student {
    public String name;
    private String firstName;
    private int age;
    private String address;
    private boolean sex;

    public Student() {
    }

    public Student(String name, int age, String address, boolean sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }
}


// class body
// constructor
// variable
// method

// public
// private
// protected
// default
