package lop_va_doi_tuong_trong_java.thuc_hanh;
import java.util.Scanner;
public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height =scanner.nextDouble();
        Lop_Hinh_Chu_Nhat rectangle = new Lop_Hinh_Chu_Nhat(width,height);
        System.out.println("Your Rectangle \n"+rectangle.display());
        System.out.println("Chu vu hình chữ nhật:"+rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật:"+rectangle.getArea());
    }
}
