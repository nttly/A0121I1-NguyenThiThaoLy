package abstract_interface.thuc_hanh.comparable_circle;

import abstract_interface.thuc_hanh.comparable.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        abstract_interface.thuc_hanh.comparable.Rectangle rectangle = new abstract_interface.thuc_hanh.comparable.Rectangle();
        System.out.println(rectangle);

        rectangle = new abstract_interface.thuc_hanh.comparable.Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
