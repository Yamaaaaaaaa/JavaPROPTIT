import java.util.Scanner;
public class VanPhongPham {
    Scanner sc = new Scanner(System.in);
    public String TenSanPham,ThuongHieu,MauSac,ChatLieu,LoaiSanPham;
    public String GiaBan;
    public void Xuat(int k){
        if(LoaiSanPham.equals("Sach")) {
            Sach sach = new Sach();
            sach = (Sach)Main.DanhSach.get(k); // Làm sao để xuất luôn mà không cần phải get(k) nhỉ ?
            sach.InBangSach();
        }
        else if(LoaiSanPham.equals("VoGhi")){
            VoGhi voghi = new VoGhi();
            voghi = (VoGhi)Main.DanhSach.get(k);
            voghi.InBangVoGhi();
        }
        else if(LoaiSanPham.equals("ButChi")){
            ButChi butchi = new ButChi();
            butchi = (ButChi)Main.DanhSach.get(k);
            butchi.InBangButChi();
        }
        else if(LoaiSanPham.equals("But Muc")){
            ButMuc butmuc = new ButMuc();
            butmuc = (ButMuc)Main.DanhSach.get(k);
            butmuc.InBangButMuc();
        }
    }
    public void SuaSP(int k)
    {
        if(LoaiSanPham.equals("Sach"))
        {
            System.out.println("Can sua tai muc: ");
            int muc = sc.nextInt();

            switch (muc){
                case 1: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .TenSanPham = sc.next();
                }
                case 2: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .GiaBan = sc.next();
                }
                case 3: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .ThuongHieu = sc.next();
                }
                case 4: {
                    System.out.println("Noi dung can sua: ");
                    ((Sach) Main.DanhSach.get(k) ).TheLoai = sc.next();
                }
                case 5: {
                    System.out.println("Noi dung can sua: ");
                    ((Sach) Main.DanhSach.get(k) ).TacGia = sc.next();
                }
                case 6: {
                    System.out.println("Noi dung can sua: ");
                    ((Sach) Main.DanhSach.get(k) ).NamXuatBan = sc.next();
                }
                case 7: {
                    System.out.println("Noi dung can sua: ");
                    ((Sach) Main.DanhSach.get(k) ).NgonNgu = sc.next();
                }
                default: System.out.println("Muc khong ton tai");
            }
        }
        else if(LoaiSanPham.equals("VoGhi"))
        {
            System.out.println("Can sua tai muc: ");

            int muc = sc.nextInt();
            switch (muc){
                case 1: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .TenSanPham = sc.next();
                }
                case 2: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .GiaBan = sc.next();
                }
                case 3: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .ThuongHieu = sc.next();
                }
                case 4: {
                    System.out.println("Noi dung can sua: ");
                    ((VoGhi) Main.DanhSach.get(k) ).SoTrang = sc.next();
                }
                case 5: {
                    System.out.println("Noi dung can sua: ");
                    ((VoGhi) Main.DanhSach.get(k) ).LoaiVo = sc.next();
                }
                case 6: {
                    System.out.println("Noi dung can sua: ");
                    ((VoGhi) Main.DanhSach.get(k) ).MauSacBia = sc.next();
                }
                case 7: {
                    System.out.println("Noi dung can sua: ");
                    ((VoGhi) Main.DanhSach.get(k) ).ChatLieuGiay = sc.next();
                }
                case 8: {
                    System.out.println("Noi dung can sua: ");
                    ((VoGhi) Main.DanhSach.get(k) ).KichThuoc = sc.next();
                }
                default: System.out.println("Muc khong ton tai");
            }
        }
        else if(LoaiSanPham.equals("ButChi")){
            System.out.println("Can sua tai muc: ");

            int muc = sc.nextInt();
            switch (muc){
                case 1: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .TenSanPham = sc.next();
                }
                case 2: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .GiaBan = sc.next();
                }
                case 3: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .ThuongHieu = sc.next();
                }
                case 4: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k).MauSac = sc.next();
                }
                case 5: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k).ChatLieu = sc.next();
                }
                case 6: {
                    System.out.println("Noi dung can sua: ");
                    ((ButChi) Main.DanhSach.get(k) ).DoCung = sc.next();
                }
                default: System.out.println("Muc khong ton tai");
            }
        }
        else if(LoaiSanPham.equals("But Muc")){
            System.out.println("Can sua tai muc: ");

            int muc = sc.nextInt();
            switch (muc){
                case 1: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .TenSanPham = sc.next();
                }
                case 2: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .GiaBan = sc.next();
                }
                case 3: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k) .ThuongHieu = sc.next();
                }
                case 4: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k).MauSac = sc.next();
                }
                case 5: {
                    System.out.println("Noi dung can sua: ");
                    Main.DanhSach.get(k).ChatLieu = sc.next();
                }
                case 6: {
                    System.out.println("Noi dung can sua: ");
                    ((ButMuc) Main.DanhSach.get(k) ).LoaiMuc= sc.next();
                }
                case 7: {
                    System.out.println("Noi dung can sua: ");
                    ((ButMuc) Main.DanhSach.get(k) ).DoMin = sc.next();
                }
                default: System.out.println("Muc khong ton tai");
            }
        }
    }

}
