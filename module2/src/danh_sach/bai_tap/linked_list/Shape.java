package danh_sach.bai_tap.linked_list;

public class Shape {
    private String name;
    private String describe;

    public Shape() {
    }

    public Shape(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
