package mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class Chuyen_doi_Nhiet_Do {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f;
        double c;
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1.Chuyển từ độ C qua F");
            System.out.println("2.Chuyển từ độ F sang C");
            System.out.println("3.exit");
            System.out.println("Nhập lựa chọn:");
            choice=input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào độ C:");
                    c = input.nextDouble();
                    System.out.println("Độ C chuyển qua độ F là:" + cQuaf(c));
                    break;
                case 2:
                    System.out.println("Nhập vào độ F:");
                    f = input.nextDouble();
                    System.out.println("Độ F chuyển qua độ C là:" + fQuac(f));
                    break;
                case 0:
                    System.exit(0);
            }
        } while(choice!=0);

    }
    public static double cQuaf(double c){
        double f =(9.0/5)*c+32;
        return f;
    }
    public static double fQuac(double f){
        double c = (5.0/9)*(f-32);
        return c;
    }
}
