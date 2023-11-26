import java.util.Scanner;
import java.util.*;

public class Main {
    public static Vector<Sach> DanhSach = new Vector<Sach>();
    // Main:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String TenDN = "";
        String MK = "";

        int login;
        while(true)
        {
            // Login:
            login = sc.nextInt();
            System.out.println("Ban Co Muon Nhap Lai ?  1: YES, 0: N0");
            if(login == 1){ // Nếu cần đăng nhập lại
                System.out.println("YES");
                System.out.println("Nhap Ten DN: ");
                TenDN = sc.next();
                System.out.println("Nhap MK: ");
                MK = sc.next();
            }
            else if(login == 0) System.out.println("NO");

            // Nhập tính năng:
            if(TenDN.equals("admin") && MK.equals("admin"))
            {
                Admin admin = new Admin();
                admin.Menu();
                System.out.println("Nhap tinh nang: ");
                admin.ChucNangAdmin = sc.nextInt();

                if(admin.ChucNangAdmin == 1){
                    System.out.println("Nhap sach: ");
                    admin.ThemSach();
                }
                else if(admin.ChucNangAdmin == 2)  admin.XoaSach();
                else if(admin.ChucNangAdmin == 3)  admin.SuaSach();
                else if(admin.ChucNangAdmin == 4){
                    Guest guest = new Guest();
                    guest.Menu();
                    guest.ChucNangGuest = sc.nextInt();

                    if(guest.ChucNangGuest == 1) guest.TimKiem();
                    else if(guest.ChucNangGuest == 2) guest.XemDanhSach();
                }
                else if(admin.ChucNangAdmin == 5)  System.out.println("DangXuat");
            }
            else if(TenDN.equals("Khach"))
            {
                Guest guest = new Guest();
                guest.Menu();
                guest.ChucNangGuest = sc.nextInt();
                if(guest.ChucNangGuest == 1) guest.TimKiem();
                else if(guest.ChucNangGuest == 2) guest.XemDanhSach();
            }
        }
    }
}