package abstract_interface.bai_tap.resizeable;
import abstract_interface.bai_tap.resizeable.Circle;
import abstract_interface.bai_tap.resizeable.Shape;
import abstract_interface.bai_tap.resizeable.Square;
import abstract_interface.bai_tap.resizeable.Resizeable;
public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(3,4);
        System.out.println("before increase percent");
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + " " + shape.getArea());
        }
        for (Shape shape : shapes) {
            shape.resize(Math.floor(Math.random() * 5 + 10));
        }
        System.out.println("after increase percent");
        for (Shape shape : shapes) {
            System.out.println(" " + shape.getArea());
        }
    }
}
