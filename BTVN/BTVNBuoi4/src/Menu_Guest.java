import java.util.Vector;
import java.util.Scanner;
public class Menu_Guest
{
    public void XemDanhSach(){
        String s1 = "Ten San Pham", s2 = "Gia Ban", s3 = "Thuong Hieu";
        String s4 = "Thong Tin Khac";
        System.out.println(String.format("| %-20s" + " | " + " %-21s" + " | " + " %-21s" + " | " + " %-59s |",s1,s2,s3,s4));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        for(int  i = 0 ; i < Main.DanhSach.size(); i ++){
            Main.DanhSach.get(i).Xuat(i);
        }
    }
    public void TimKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu khoa: ");
        String TuKhoa = sc.next();
        System.out.println("Cac Thong Tin Duoc Tim Thay: ");
        String s1 = "Ten San Pham", s2 = "Gia Ban", s3 = "Thuong Hieu";
        String s4 = "Thong Tin Khac";
        System.out.println(String.format("| %-20s" + " | " + " %-20s" + " | " + " %-20s" + " | " + " %-50s |",s1,s2,s3,s4));
        System.out.println("--------------------------------------------------------------------------------------------------");
        for(int  i = 0 ; i < Main.DanhSach.size(); i ++){
            if(Main.DanhSach.get(i).LoaiSanPham.equals("Sach"))
            {
                if(    Main.DanhSach.get(i).TenSanPham.contains(TuKhoa)
                    || Main.DanhSach.get(i).GiaBan.contains(TuKhoa)
                    || Main.DanhSach.get(i).ThuongHieu.contains(TuKhoa)
                    || ((Sach) Main.DanhSach.get(i)).TheLoai.contains(TuKhoa)
                    || ((Sach) Main.DanhSach.get(i)).TacGia.contains(TuKhoa)
                    || ((Sach) Main.DanhSach.get(i)).NamXuatBan.contains(TuKhoa)
                    || ((Sach) Main.DanhSach.get(i)).NgonNgu.contains(TuKhoa) )
                    {
                        Main.DanhSach.get(i).Xuat(i);
                    }
            }
            else if (Main.DanhSach.get(i).LoaiSanPham.equals("VoGhi"))
            {
                if(Main.DanhSach.get(i).TenSanPham.contains(TuKhoa)
                        || Main.DanhSach.get(i).GiaBan.contains(TuKhoa)
                        || Main.DanhSach.get(i).ThuongHieu.contains(TuKhoa)
                        || ((VoGhi) Main.DanhSach.get(i)).SoTrang.contains(TuKhoa)
                        || ((VoGhi) Main.DanhSach.get(i)).LoaiVo.contains(TuKhoa)
                        || ((VoGhi) Main.DanhSach.get(i)).MauSacBia.contains(TuKhoa)
                        || ((VoGhi) Main.DanhSach.get(i)).KichThuoc.contains(TuKhoa) )
                {
                    Main.DanhSach.get(i).Xuat(i);
                }
            }
            else if (Main.DanhSach.get(i).LoaiSanPham.equals("ButChi"))
            {
                if(Main.DanhSach.get(i).TenSanPham.contains(TuKhoa)
                        || Main.DanhSach.get(i).GiaBan.contains(TuKhoa)
                        || Main.DanhSach.get(i).ThuongHieu.contains(TuKhoa)
                        || ((ButChi) Main.DanhSach.get(i)).MauSac.contains(TuKhoa)
                        || ((ButChi) Main.DanhSach.get(i)).ChatLieu.contains(TuKhoa)
                        || ((ButChi) Main.DanhSach.get(i)).DoCung.contains(TuKhoa))
                {
                    Main.DanhSach.get(i).Xuat(i);
                }
            }
            else if (Main.DanhSach.get(i).LoaiSanPham.equals("ButMuc"))
            {
                if(Main.DanhSach.get(i).TenSanPham.contains(TuKhoa)
                        || Main.DanhSach.get(i).GiaBan.contains(TuKhoa)
                        || Main.DanhSach.get(i).ThuongHieu.contains(TuKhoa)
                        || ((ButMuc) Main.DanhSach.get(i)).MauSac.contains(TuKhoa)
                        || ((ButMuc) Main.DanhSach.get(i)).ChatLieu.contains(TuKhoa)
                        || ((ButMuc) Main.DanhSach.get(i)).LoaiMuc.contains(TuKhoa)
                        || ((ButMuc) Main.DanhSach.get(i)).DoMin.contains(TuKhoa))
                {
                    Main.DanhSach.get(i).Xuat(i);
                }
            }
        }
    }
    public void Thoat(){
        Main.login = 0;
        System.out.println("Da Dang Xuat!");
    }
}
