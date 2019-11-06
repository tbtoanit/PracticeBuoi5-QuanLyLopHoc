package quanLyLopHoc;

import java.util.Scanner;

public class LopHoc {
    public String tenLopHoc;
    public int soHocSinh;
    public String tenGiaoVien;
    public boolean lopChuyen;
    public HocSinh[] dsHocSinh;

    public LopHoc(){

    }

    public void nhapThongTinLopHoc(){
        LopHoc[] dsLop = new LopHoc[2];
        LopHoc l = new LopHoc();
        for(int i = 0; i <dsLop.length; i++){
            l = new LopHoc();
            Scanner sc = new Scanner(System.in);
            System.out.println("Vui long nhap thong tin ten lop: ");
            l.tenLopHoc = sc.nextLine();
            System.out.println("Vui long nhap thong tin so hoc sinh: ");
            l.soHocSinh = sc.nextInt();
            sc.nextLine();
            System.out.println("Vui long nhap thong tin ten giao vien: ");
            l.tenGiaoVien = sc.nextLine();
            System.out.println("Vui long nhap true de lop nay laf chuyen hoac false de lop nay la khong chuyen:");
            l.lopChuyen = sc.nextBoolean();
            dsLop[i] = l;
        }

        inDanhSachLop(dsLop);
    }

    public void inDanhSachLop(LopHoc[] dsLop){
        for (LopHoc l :dsLop) {
            System.out.println("Ten Lop Hoc: "+ l.tenLopHoc
                                + " - So hoc sinh la: "+ l.soHocSinh
                                + " - Ten Giao Vien la: " + l.tenGiaoVien
                                + " - Lop Chuyen hay khong? "+   (l.lopChuyen == true?" -Chuyen" : "khongchuyen")
            );
        }
    }

    public static void main(String[] args) {
        LopHoc l = new LopHoc();
        l.nhapThongTinLopHoc();
    }


}
