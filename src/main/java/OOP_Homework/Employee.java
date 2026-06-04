package OOP_Homework;
public class Employee extends Person implements IManageable {

    private double luong;

    public Employee() {
        super();
        this.luong = 0;
    }

    public Employee(String id, String hoTen, int tuoi, String diaChi, double luong) {
        super(id, hoTen, tuoi, diaChi);
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String getLoaiNhanVien() {
        return "Nhan vien";
    }

    @Override
    public double tinhLuong() {
        return luong;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("---------------------------------------");
        System.out.println("Loai    : " + getLoaiNhanVien());
        System.out.println("Ma NV   : " + getId());
        System.out.println("Ho ten  : " + hoTen);
        System.out.println("Tuoi    : " + tuoi);
        System.out.println("Dia chi : " + diaChi);
        System.out.println("Luong   : " + tinhLuong());
    }
}
