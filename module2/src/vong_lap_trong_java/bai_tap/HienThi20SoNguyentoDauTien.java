package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyentoDauTien {
    public static void main(String[] args) {
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);


        System.out.println("20 Số nguyên tố đầu tiên là:");
        System.out.println(2);

        for (int i = 2; i <= 20; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}