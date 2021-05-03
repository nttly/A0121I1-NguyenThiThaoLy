package demoClass;

public class DemoClassMain {
    public static void main(String[] args) {
        /*Student st1 = new Student();
        st1.setName("Nga");
        st1.setAge(18);
        st1.setSex(false);
        st1.setAddress("Da Nang");
        st1.getName();
        Student st2 = new Student("Linh", 19, "Quang Nam", true);*/
//        HocSinh linh = new HocSinh();
//        linh.setToan(5);
//        linh.setAnh(7);
//        linh.setVan(3);
//        System.out.println("diem trung binh" + linh.diemTb());
//        DongVat dongVat = new DongVat();
//        dongVat.setSoChan(4);
//        dongVat.setTen("cho");
//        dongVat.setTiengKeu("gau gau");
//        dongVat.setTuoi(10);
//        System.out.println(dongVat);
//        System.out.println(dongVat.dongVat());
         NhanVien linh= new NhanVien();
         linh.setName("Linh");
         linh.setAge(18);
         linh.setSalary(11000000);
        System.out.println("so thue may phai chiu :"+ (int)linh.calcPersonTax());
    }

}
