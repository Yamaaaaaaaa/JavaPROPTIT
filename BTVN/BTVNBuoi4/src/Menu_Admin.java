import java.util.Scanner;

public class Menu_Admin {
    Scanner sc = new Scanner(System.in);
    public void ThemSanPham() {
        System.out.println("1: Sach");
        System.out.println("2: VoGhi");
        System.out.println("3: ButChi");
        System.out.println("4: ButMuc");
        System.out.print("Nhap lua chon cua ban: ");
        int LuaChon = sc.nextInt();

        if(LuaChon == 1){
            System.out.println("Nhap ten san pham: ");
            String TenSanPham = sc.next();
            System.out.println("Nhap gia ban: ");
            String GiaBan = sc.next();
            System.out.println("Nhap ten thuong hieu: ");
            String ThuongHieu = sc.next();
            System.out.println("Nhap the loai: ");
            String TheLoai = sc.next();
            System.out.println("Nhap ten tac gia: ");
            String TacGia = sc.next();
            System.out.println("Nhap nam xuat ban: ");
            String NamXuatBan = sc.next();
            System.out.println("Nhap ngon ngu: ");
            String NgonNgu = sc.next();
            VanPhongPham SanPham = new Sach(TenSanPham, GiaBan, ThuongHieu, TheLoai, TacGia, NamXuatBan, NgonNgu);
            Main.DanhSach.addElement(SanPham);
        }
        else if(LuaChon == 2){
            System.out.println("Nhap ten san pham: ");
            String TenSanPham = sc.next();
            System.out.println("Nhap gia ban: ");
            String GiaBan = sc.next();
            System.out.println("Nhap ten thuong hieu: ");
            String ThuongHieu = sc.next();
            System.out.println("Nhap so trang: ");
            String SoTrang = sc.next();
            System.out.println("Nhap loai vo: ");
            String LoaiVo = sc.next();
            System.out.println("Nhap mau sac bia: ");
            String MauSacBia = sc.next();
            System.out.println("Nhap chat lieu giay: ");
            String ChatLieuGiay = sc.next();
            System.out.println("Nhap kich thuoc: ");
            String KichThuoc = sc.next();
            VanPhongPham SanPham = new VoGhi(TenSanPham, GiaBan, ThuongHieu, SoTrang, LoaiVo, MauSacBia, ChatLieuGiay, KichThuoc);
            Main.DanhSach.addElement(SanPham);
        }
        else if(LuaChon == 3){

            System.out.println("Nhap ten san pham: ");
            String TenSanPham = sc.next();
            System.out.println("Nhap gia ban: ");
            String GiaBan = sc.next();
            System.out.println("Nhap ten thuong hieu: ");
            String ThuongHieu = sc.next();
            System.out.println("Nhap mau sac: ");
            String MauSac = sc.next();
            System.out.println("Nhap Chat Lieu: ");
            String ChatLieu = sc.next();
            System.out.println("Nhap Do Cung: ");
            String DoCung = sc.next();
            VanPhongPham SanPham = new ButChi(TenSanPham, GiaBan, ThuongHieu, MauSac, ChatLieu, DoCung);
            Main.DanhSach.addElement(SanPham);
        }
        else if(LuaChon == 4){
            System.out.println("Nhap ten san pham: ");
            String TenSanPham = sc.next();
            System.out.println("Nhap gia ban: ");
            String GiaBan = sc.next();
            System.out.println("Nhap ten thuong hieu: ");
            String ThuongHieu = sc.next();
            System.out.println("Nhap mau sac: ");
            String MauSac = sc.next();
            System.out.println("Nhap Chat Lieu: ");
            String ChatLieu = sc.next();
            System.out.println("Nhap Loai Muc: ");
            String LoaiMuc = sc.next();
            System.out.println("Nhap Do Min: ");
            String DoMin = sc.next();
            VanPhongPham SanPham = new ButMuc(TenSanPham, GiaBan, ThuongHieu, MauSac, ChatLieu, LoaiMuc, DoMin);
            Main.DanhSach.addElement(SanPham);
        }
        else System.out.println("San Pham Khong Ton Tai");
    }
    public void XoaSanPham(){
        System.out.println("Xoa San Pham thu : " );
        int k = sc.nextInt();
        Main.DanhSach.removeElementAt(k);
    }
    public void SuaSanPham(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Sua san pham thu : ");
        int k = sc.nextInt();
        Main.DanhSach.get(k).Xuat(k);
        Main.DanhSach.get(k).SuaSP(k);
    }
    public void Thoat(){
        Main.login = 0;
        System.out.println("Da Dang Xuat!");
    }
    public void ChucNangGuest(){
        Main.login = 1;
        System.out.println("Chuyen Sang TK Khach!");
    }
}
