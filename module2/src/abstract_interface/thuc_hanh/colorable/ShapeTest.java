package abstract_interface.thuc_hanh.colorable;

import abstract_interface.thuc_hanh.comparable.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        abstract_interface.thuc_hanh.comparable.Shape shape = new abstract_interface.thuc_hanh.comparable.Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
