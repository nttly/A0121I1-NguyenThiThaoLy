package abstract_interface.thuc_hanh.colorable;

import abstract_interface.thuc_hanh.comparable.Circle;

public class CircleTest {
    public static void main(String[] args) {
        abstract_interface.thuc_hanh.comparable.Circle circle = new abstract_interface.thuc_hanh.comparable.Circle();
        System.out.println(circle);

        circle = new abstract_interface.thuc_hanh.comparable.Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

    }
}
