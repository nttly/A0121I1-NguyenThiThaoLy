package ke_thua.bai_tap;
import java.util.Scanner;
public class vd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng");
        int n =scanner.nextInt();
        float tong=0;
        for (int i=1;i<=n;i++){
            tong+=(float)1/i;
        }
        System.out.println(tong);
    }
}
