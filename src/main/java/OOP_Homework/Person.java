package OOP_Homework;
public abstract class Person implements IManageable {

    private String id;
    protected String hoTen;
    protected int tuoi;
    String diaChi;

    public Person() {
        this.id = "P000";
        this.hoTen = "Chua co";
        this.tuoi = 0;
        this.diaChi = "Chua co";
    }

    public Person(String id, String hoTen, int tuoi, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi > 0) {
            this.tuoi = tuoi;
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public abstract String getLoaiNhanVien();
}
