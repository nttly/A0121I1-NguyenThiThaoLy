package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Hien_Thi_Cac_Loai_Hinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1.In hình chữ nhật");
        System.out.println("2.In hình tam giác vuông");
        System.out.println("3.In hình tam giác vuông  ngược");
        System.out.println("4.In hình tam giác cân");
        System.out.println("0.Exit");
        System.out.println("Enter your choice:");
        choice = input.nextInt();
        if (choice == 1) {
            int dai, rong;
            System.out.println("Nhập chiều dài:");
            dai = input.nextInt();
            System.out.println("Nhâp chiều rộng:");
            rong = input.nextInt();
            System.out.println("In hình chữ nhật");
            for (int i = 0; i < rong; i++) {
                for (int j = 0; j < dai; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (choice == 2) {
            int a;
            System.out.println("Nhập độ dài cạnh góc vuông a");
            a = input.nextInt();

            System.out.println("In tam giác vuông");
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (choice == 3) {
            int a;
            System.out.println("Nhập độ dài cạnh góc vuông a");
            a = input.nextInt();

            System.out.println("In tam giác vuông");
            for (int i = a; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (choice == 4) {
            int a;
            System.out.println("Nhập độ dài cạnh tam giác cân a");
            a = input.nextInt();

            System.out.println("In tam giác cân");
            for (int i = 1; i <= 10; i += 2) {
                for (int j = 0; j <= (4 - i / 2); j++) {
                    System.out.println(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.println("*");
                }
                System.out.println("");
            }
        }
    }
}
