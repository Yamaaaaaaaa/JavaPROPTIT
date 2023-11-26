import java.util.Scanner;

public class Admin {
    public int ChucNangAdmin;

    public void Menu(){
        System.out.println("1 : Them Sach");
        System.out.println("2 : Xoa Sach");
        System.out.println("3 : Sua Sach");
        System.out.println("4 : Chuc Nang Cua Khach");
        System.out.println("5 : Thoat Tai Khoan Admin");
    }
    public void ThemSach(){
        Scanner sc = new Scanner(System.in);
        Sach tmp = new Sach();
        tmp.TieuDe = sc.next();
        tmp.Tacgia = sc.next();
        tmp.TheLoai = sc.next();
        tmp.NgayXuatBan = sc.next();
        Main.DanhSach.addElement(tmp);
    }
    public void XoaSach(){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Xoa sach thu : " + k);
        Main.DanhSach.removeElementAt(k);
    }

    public void SuaSach(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Sua sach thu : ");
        int k = sc.nextInt();

        System.out.println("Tai Muc: ");
        String Muc = sc.next();

        System.out.println("Noi Dung: ");
        String NoiDung = sc.next();

        if(Muc.equals("TieuDe")){
            Main.DanhSach.get(k).TieuDe = NoiDung;
        }
        else if(Muc.equals("NgayXuatBan")){
            Main.DanhSach.get(k).NgayXuatBan = NoiDung;
        }
        else if(Muc.equals("TheLoai")){
            Main.DanhSach.get(k).NgayXuatBan = NoiDung;
        }
        else if(Muc.equals("TacGia")){
            Main.DanhSach.get(k).Tacgia = NoiDung;
        }
    }
}