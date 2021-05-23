package abstract_interface.thuc_hanh.comparable_circle;

import abstract_interface.thuc_hanh.comparable.Square;

public class SquareText {
    public static void main(String[] args) {
        abstract_interface.thuc_hanh.comparable.Square square = new abstract_interface.thuc_hanh.comparable.Square();
        System.out.println(square);

        square = new abstract_interface.thuc_hanh.comparable.Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
