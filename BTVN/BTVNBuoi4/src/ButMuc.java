public class ButMuc extends VanPhongPham {

    String LoaiMuc,DoMin;
    public ButMuc(){
    }
    //TenSP,ThuongHieu,MauSac,ChatLieu,GiaBan;
    public ButMuc(String TenSanPham,String GiaBan,String ThuongHieu,String MauSac,String ChatLieu,String LoaiMuc,String DoMin) {
        super.LoaiSanPham = "ButMuc";
        super.TenSanPham = TenSanPham;
        super.GiaBan = GiaBan;
        super.ThuongHieu = ThuongHieu;
        super.MauSac = MauSac;
        super.ChatLieu = ChatLieu;
        this.LoaiMuc = LoaiMuc;
        this.DoMin = DoMin;
    }
    public void InBangButMuc(){
        System.out.println(String.format("| %-20s | %-22s | %-22s | %-60s |",super.TenSanPham,super.GiaBan,super.ThuongHieu,("1.Mau Sac:"+ MauSac)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("2.Chat Lieu:"+ ChatLieu)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("3.Loai Muc:"+ LoaiMuc)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("4.Do Min:"+ DoMin)));
    }
}
