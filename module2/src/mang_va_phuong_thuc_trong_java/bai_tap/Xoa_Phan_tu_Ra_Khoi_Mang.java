package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Xoa_Phan_tu_Ra_Khoi_Mang {
    public static void nhap(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }
    public static void xuat(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
    public static void xoaPhantu(int[] list, int soCanXoa) {
        int sizze = list.length;

        int dem = 0;
        int k = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == soCanXoa) {
                dem++;
            }
        }
        int newArray[] = new int[sizze - dem];
        for (int i = 0; i < list.length; i++) {
            if (list[i] == soCanXoa) {
                continue;
            }
            newArray[k] = list[i];
            k++;
        }
        if (dem > 0) {
            xuat(newArray);
        } else {
            System.out.println("không tìm thấy giá trị cần xoá");
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số luongj  phần tử mảng 1:");
        int a=scanner.nextInt();
        int[] arr1 = new int[a];
        nhap(arr1,scanner);
        System.out.println("Mảng ban đầu là: ");
        xuat(arr1);
        System.out.println("Nhập số cần xóa:");
        int soCanXoa = scanner.nextInt();
        System.out.println("Mảng sau khi xóa là:");
        xoaPhantu(arr1, soCanXoa);
    }

}
