package introduction_to_java;
import java.util.Scanner;
public class BT_UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double vnd =23000;
        double usd;
        System.out.print("Mời bạn nhập số tiền USD: ");
        usd=scanner.nextDouble();
        double doi= usd*vnd;
        System.out.print("Giá trị VND:"+doi);

    }
}
