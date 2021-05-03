package demoClass;

public class HocSinh {
    private float toan;
    private float van;
    private float anh;

    public HocSinh() {
    }

    public HocSinh(float toan, float van, float anh) {
        this.toan = toan;
        this.van = van;
        this.anh = anh;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public float getAnh() {
        return anh;
    }

    public void setAnh(float anh) {
        this.anh = anh;
    }

    public float diemTb() {
        float diemTb = (this.toan + this.van + this.anh) / 3;
        return diemTb;
    }
}
