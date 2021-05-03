package demoClass;

public class DongVat {
    private String ten;
    private int tuoi;
    private int soChan;
    private String tiengKeu;

    public DongVat(String ten, int tuoi, int soChan, String tiengKeu) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.soChan = soChan;
        this.tiengKeu = tiengKeu;
    }

    public DongVat() {

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }
    public String dongVat(){

        return "ten "+ this.ten + ", tuoi "+ this.tuoi + ", so chan "+ this.soChan + ", tieng keu "+ this.tiengKeu;
    }

}
