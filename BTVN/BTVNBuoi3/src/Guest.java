import java.util.Scanner;

public class Guest {
    public int ChucNangGuest;
    public void Menu(){
        System.out.println("1 : TimKiem");
        System.out.println("2 : XemDanhSach");
    }
    public void TimKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Tu Khoa: ");
        String tmp = sc.next();
        int check = 0;
        for(Sach s: Main.DanhSach){
            if(s.NgayXuatBan.equals(tmp)) {
                check = 1;
                System.out.println("Ngay Xuat Ban: " + tmp + " ");
                s.xuat();
            }
            if(s.Tacgia.equals(tmp)) {
                check = 1;
                System.out.println("Tac gia: " + tmp + " ");
                s.xuat();
            }
            if(s.TheLoai.equals(tmp)) {
                check = 1;
                System.out.println("The Loai: " + tmp + " ");
                s.xuat();
            }
            if(s.TieuDe.equals((tmp))) {
                check = 1;
                System.out.println("Tieu De: " + tmp + " ");
                s.xuat();
            }
        }
        if(check == 0) System.out.println("Khong Co Sach Hop Le");
    }

    public void XemDanhSach(){
        for(Sach s: Main.DanhSach){
            s.Xuat();
        }
    }
}