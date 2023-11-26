import java.util.Vector;
import java.util.Scanner;
// Chưa làm đc: In ra bảng
//              Xuất ra phân tìm kiếm từ khóa không được bôi đen
//              Lỗi :Duplicated code fragment
//              Lỗi: Redundant call to 'format()'

public class Main {
    public static Vector<VanPhongPham> DanhSach = new Vector<>();
    public static int login;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        login = 0; //check xem có còn ở tài khoản cũ hay ko, nếu đc lagout thì cho login về 0, admin = 2, guest = 1
        while(true)
        {
            if(login == 2) // vấn đang ở admin
            {
                System.out.println("Ban dang du dung tai khoan ADMIN");
                System.out.println("1. Them san pham.");
                System.out.println("2. Sua san pham.");
                System.out.println("3. Xoa san pham.");
                System.out.println("4. Test chuc nang khach");
                System.out.println("5. Thoat");
                System.out.print("Nhap lua chon cua ban: ");
                int luachon = sc.nextInt();
                Menu_Admin admin = new Menu_Admin();

                if(luachon == 1) admin.ThemSanPham();
                else if(luachon == 2) admin.SuaSanPham();
                else if(luachon == 3) admin.XoaSanPham();
                else if(luachon == 4) admin.ChucNangGuest();
                else if(luachon == 5) admin.Thoat();
                else System.out.println("Chuc nang khong ton tai");
            }
            else if(login == 1) //vấn đang ở guest
            {
                System.out.println("Ban dang du dung tai khoan GUEST");
                System.out.println("1 : TimKiem");
                System.out.println("2 : XemDanhSach");
                System.out.println("3 : Thoat");
                int luachon = sc.nextInt();
                Menu_Guest guest = new Menu_Guest();
                if(luachon == 1) guest.TimKiem();
                else if(luachon == 2) guest.XemDanhSach();
                else if(luachon == 3) guest.Thoat();
                else System.out.println("Chuc nang khong ton tai");
            }
            else{
                System.out.println("Ban Chua Dang Nhap, Moi Ban Lua Chon:");
                System.out.println("2.Admin");
                System.out.println("1.Guest");
                login = sc.nextInt();
            }
        }
    }
}