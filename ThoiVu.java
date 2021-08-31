package Bai_tap_lon_Java;
import java.util.Scanner;

abstract class ThoiVu extends NhanVien {
	private long thoi_gian_lam;
	private long luong_thoa_thuan;
	public long getThoi_gian_lam() {
		return thoi_gian_lam;
	}
	public void setThoi_gian_lam(long thoi_gian_lam) {
		this.thoi_gian_lam = thoi_gian_lam;
	}
	public long getLuong_thoa_thuan() {
		return luong_thoa_thuan;
	}
	public void setLuong_thoa_thuan(long luong_thoa_thuan) {
		this.luong_thoa_thuan = luong_thoa_thuan;
	}
	
	public ThoiVu() {}
	
	public ThoiVu(long thoi_gian_lam, long luong_thoa_thuan) {
		super();
		this.thoi_gian_lam = thoi_gian_lam;
		this.luong_thoa_thuan = luong_thoa_thuan;
	}
	public void NhapDL() {
		Scanner sc = new Scanner(System.in);
		super.NhapDL();
		System.out.print("Nhập thời gian làm(số giờ): ");
		thoi_gian_lam = sc.nextLong();
		System.out.print("Nhập lương thoả thuận: ");
		luong_thoa_thuan = sc.nextLong();
	}
	public void XuatDL() {
		super.XuatDL();
		System.out.println("Thời gian làm(Giờ): "+thoi_gian_lam+"h");
		System.out.println("Lương thoả thuận(USD/Giờ): "+luong_thoa_thuan+ " USD");
		System.out.println("Tiền lương: "+Tien_luong()+" USD");
	}
	public long Tien_luong() {
		long s = 1;
		s = (long)(thoi_gian_lam * luong_thoa_thuan);
		return s;
	}
	public String toString() {
		return "\nThông tin nhân viên\n "
				+ "=> Mã nhân viên: " + getMa_nhan_vien() + "\t Tên nhân viên: " + getTen_nhan_vien()
				+ "\t Tổ làm việc: " + getTo_lam_viec() + "\t Địa chỉ: " + getDia_chi() + "\t Số điện thoại: "
				+ getSo_dien_thoai() + "\t Thời gian làm(Giờ): " +getThoi_gian_lam()+"h \t Lương thoả thuận(USD/Giờ): " 
				+getLuong_thoa_thuan()+"USD \t Tiền lương: "+ Tien_luong()+"USD";
	}
public String getFileLine() {
	
	return toString(); 
		
	}
}
