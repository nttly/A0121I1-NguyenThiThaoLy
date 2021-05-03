package lop_va_doi_tuong_trong_java.bai_tap;
import java.util.Scanner;
public class BT_Fan {
    public static void main(String[] args) {
       Fan fan =new Fan(Fan.FAST,true,10,"yeloow");
       Fan fan1 =new Fan(Fan.MEDIUM,false,5,"blue");
       System.out.println(fan);
        System.out.println(fan1);
    }
}
