package OOP_Homework;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {

    private static ArrayList<Person> danhSach = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n===== QUAN LY NHAN VIEN =====");
            System.out.println("1. Them nhan vien (Add)");
            System.out.println("2. Sua nhan vien (Edit)");
            System.out.println("3. Xoa nhan vien (Delete)");
            System.out.println("4. Hien thi danh sach (Display)");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: themNhanVien(); break;
                case 2: suaNhanVien();  break;
                case 3: xoaNhanVien();  break;
                case 4: hienThiTatCa(); break;
                case 0: System.out.println("Tam biet!"); break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }

    public static void themNhanVien() {
        System.out.println("\n--- THEM NHAN VIEN ---");
        System.out.print("Ma NV: ");      String id = sc.nextLine();
        System.out.print("Ho ten: ");     String ten = sc.nextLine();
        System.out.print("Tuoi: ");       int tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Dia chi: ");    String dc = sc.nextLine();
        System.out.print("Luong: ");      double luong = Double.parseDouble(sc.nextLine());
        danhSach.add(new Employee(id, ten, tuoi, dc, luong));
        System.out.println("Them thanh cong!");
    }

    public static void suaNhanVien() {
        System.out.print("\nNhap ma NV can sua: ");
        String id = sc.nextLine();
        Person p = timTheoId(id);
        if (p == null) {
            System.out.println("Khong tim thay NV co ma " + id);
            return;
        }

        System.out.print("Ho ten moi: ");
        p.setHoTen(sc.nextLine());
        System.out.print("Tuoi moi: ");
        p.setTuoi(Integer.parseInt(sc.nextLine()));
        System.out.print("Dia chi moi: ");
        p.setDiaChi(sc.nextLine());
        System.out.print("Luong moi: ");
        ((Employee) p).setLuong(Double.parseDouble(sc.nextLine()));
        System.out.println("Da cap nhat!");
    }

    public static void xoaNhanVien() {
        System.out.print("\nNhap ma NV can xoa: ");
        String id = sc.nextLine();
        Person p = timTheoId(id);
        if (p == null) {
            System.out.println("Khong tim thay NV co ma " + id);
            return;
        }
        danhSach.remove(p);
        System.out.println("Da xoa NV " + id);
    }

    public static void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("\n===== DANH SACH NHAN VIEN =====");
        for (Person p : danhSach) {
            p.hienThiThongTin();
        }
    }

    private static Person timTheoId(String id) {
        for (Person p : danhSach) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
