public class VoGhi extends VanPhongPham{
    String SoTrang;
    String LoaiVo,MauSacBia,ChatLieuGiay,KichThuoc;
    public VoGhi(){
    }
   //TenSP,ThuongHieu,GiaBan
   public VoGhi(String TenSanPham,String GiaBan,String ThuongHieu,String SoTrang, String LoaiVo,String MauSacBia,String ChatLieuGiay,String KichThuoc)
   {
       super.LoaiSanPham = "VoGhi";
       super.TenSanPham = TenSanPham;
       super.GiaBan = GiaBan;
       super.ThuongHieu = ThuongHieu;
       this.SoTrang = SoTrang;
       this.LoaiVo = LoaiVo;
       this.MauSacBia = MauSacBia;
       this.ChatLieuGiay = ChatLieuGiay;
       this.KichThuoc = KichThuoc;
   }
    public void InBangVoGhi(){
        System.out.println(String.format("| %-20s | %-22s | %-22s | %-60s |",super.TenSanPham,super.GiaBan,super.ThuongHieu,("1.So Trang:"+ SoTrang)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("2.Loai Vo:"+ LoaiVo)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("3.Mau Sac Bia:"+ MauSacBia)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("4.Chat Lieu Giay:"+ ChatLieuGiay)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("5.Kich Thuoc:"+ KichThuoc)));
    }
}
