package lop_va_doi_tuong_trong_java.thuc_hanh;

public class Lop_Hinh_Chu_Nhat {
    double width, height;

    public Lop_Hinh_Chu_Nhat() {
    }
    public Lop_Hinh_Chu_Nhat(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Hình chữ nhật {"+"width="+width+",height="+height+"}";
    }


}
