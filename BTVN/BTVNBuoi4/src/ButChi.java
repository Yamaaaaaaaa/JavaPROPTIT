public class ButChi extends VanPhongPham{

    String DoCung;
    public ButChi(){
    }
    //TenSP,ThuongHieu,MauSac,ChatLieu,GiaBan
    public ButChi(String TenSanPham,String GiaBan,String ThuongHieu,String MauSac,String ChatLieu,String DoCung){
        super.LoaiSanPham = "ButChi";
        super.TenSanPham = TenSanPham;
        super.GiaBan = GiaBan;
        super.ThuongHieu = ThuongHieu;
        super.MauSac = MauSac;
        super.ChatLieu = ChatLieu;
        this.DoCung = DoCung;
    }
    public void InBangButChi(){
        System.out.println(String.format("| %-20s | %-22s | %-22s | %-60s |",super.TenSanPham,super.GiaBan,super.ThuongHieu,("1.Mau Sac:"+ MauSac)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("2.Chat Lieu:"+ ChatLieu)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("3.Do Cung:"+ DoCung)));
    }
}
