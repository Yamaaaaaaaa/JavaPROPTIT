
public class Sach extends VanPhongPham{

    String TheLoai,TacGia,NamXuatBan,NgonNgu;
    public Sach(){
    }
    //TenSP,ThuongHieu,GiaBan

    public Sach(String TenSanPham,String GiaBan,String ThuongHieu,String TheLoai,String TacGia,String NamXuatBan,String NgonNgu)
    {
        super.LoaiSanPham = "Sach";
        super.TenSanPham = TenSanPham;
        super.GiaBan = GiaBan;
        super.ThuongHieu = ThuongHieu;
        this.TheLoai = TheLoai;
        this.TacGia = TacGia;
        this.NamXuatBan = NamXuatBan;
        this.NgonNgu = NgonNgu;
    }
    public void InBangSach(){
        System.out.println(String.format("| %-20s | %-22s | %-22s | %-60s |",super.TenSanPham,super.GiaBan,super.ThuongHieu,("1.The Loai:"+ TheLoai)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("2.Tac Gia:"+ TacGia)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("3.Nam Xuat Ban:"+ NamXuatBan)));
        System.out.println(String.format("|                      |                        |                        | %-60s |",("4.Ngon Ngu:"+ NgonNgu)));
    }
}
//| Ten San Pham | Gia Ban |