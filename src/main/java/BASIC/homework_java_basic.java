package BASIC;

import java.util.Scanner;

public class homework_java_basic {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int soLuong;
        double diemTrungBinh;
        boolean dangChay;
        char luaChon;

        dangChay = true;
        diemTrungBinh = 0.0;

        System.out.println("========QUAN LY MANG SO NGUYEN============");

        System.out.print("Nhap so luong phan tu cua mang: ");
        soLuong = sc.nextInt();

        if (soLuong <= 0) {
            System.out.println("So luong khong hop le");
            return;
        } else {
            System.out.println("So luong hop le, tiep tuc...");
        }

        int[] mang = nhapMang(soLuong);

        while (dangChay) {
            hienThiMenu();
            System.out.print("Chon chuc nang: ");
            luaChon = sc.next().charAt(0);

            switch (luaChon) {
                case '1':
                    inMang(mang);
                    break;
                case '2':
                    int max = timMax(mang);
                    System.out.println("Gia tri lon nhat: " + max);
                    break;
                case '3':
                    int min = timMin(mang);
                    System.out.println("Gia tri nho nhat: " + min);
                    break;
                case '4':
                    diemTrungBinh = tinhTrungBinh(mang);
                    System.out.println("Gia tri trung binh: " + diemTrungBinh);
                    break;
                case '5':
                    sapXepTangDan(mang);
                    System.out.println("Da sap xep mang tang dan!");
                    inMang(mang);
                    break;
                case '0':
                    dangChay = false;
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }

        sc.close();
    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    
    

    public static void inMang(int[] arr) {
        System.out.print("Mang hien tai: [ ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("]");
    }
    
    
    
    
    

    public static int timMax(int[] arr) {
        int max = arr[0];
        int i = 1;
        if (arr.length > 1) {
            do {
                if (arr[i] > max) {
                    max = arr[i];
                }
                i++;
            } while (i < arr.length);
        }
        return max;
    }

    
    
    
    public static int timMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    
    
    

    public static double tinhTrungBinh(int[] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }
        return (double) tong / arr.length;
    }
    
    
    

    public static void sapXepTangDan(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tam = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tam;
                }
            }
        }
    }

    public static void hienThiMenu() {
        System.out.println("\n =====MENU =====");
        System.out.println("1. In mang");
        System.out.println("2. Tim gia tri lon nhat");
        System.out.println("3. Tim gia tri nho nhat");
        System.out.println("4. Tinh gia tri trung binh");
        System.out.println("5. Sap xep");
        System.out.println("0. Thoat");
    }
}
