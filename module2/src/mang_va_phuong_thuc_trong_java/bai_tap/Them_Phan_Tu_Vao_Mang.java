package mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class Them_Phan_Tu_Vao_Mang {
    public static void input(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }
    public static void output(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
    public static void add(int[] list, int value, int index) {
        if (index < 1 && index > list.length - 1) {
            System.out.println("vị trí ko hợp lệ");
            return;
        } else {
            int[] list1 = new int[list.length + 1];
            for (int i = 0; i < list1.length; i++) {
                if (i < index) {
                    list1[i] = list[i];
                } else if (i > index) {
                    list1[i] = list[i - 1];
                } else {
                    list1[index] = value;
                }
            }

            output(list1);

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số luong  phần tử mảng :");
        int n=scanner.nextInt();
        int[] arr1 = new int[n];
        input(arr1,scanner);
        System.out.println("Mảng sau khi nhập là:");
        output(arr1);
        System.out.println("Nhập phần tử cần thêm:");
        int value = scanner.nextInt();
        System.out.println("Nhập vị trí mún chèn:");
        int index=scanner.nextInt();
        add(arr1,value,index);
    }
}
