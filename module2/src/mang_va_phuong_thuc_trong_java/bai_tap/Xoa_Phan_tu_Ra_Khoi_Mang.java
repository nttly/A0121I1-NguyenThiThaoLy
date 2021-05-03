package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Xoa_Phan_tu_Ra_Khoi_Mang {
    public static void inputArray(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số luongj  phần tử mảng 1:");
        int a=scanner.nextInt();
        int[] arr1 = new int[a];
        inputArray(arr1,scanner);
        System.out.println("Nhập số cần xóa:");
        int n=scanner.nextInt();
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=n){

            }
        }
    }

}
