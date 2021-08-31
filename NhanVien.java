package Bai_tap_lon_Java;

import java.util.Scanner;
abstract class NhanVien {
// khai báo
	private String ma_nhan_vien,ten_nhan_vien,to_lam_viec,dia_chi,so_dien_thoai;
	
	// Constructor
	public NhanVien() {}
	public NhanVien(String ma_nhan_vien, String ten_nhan_vien, String to_lam_viec, String dia_chi,
			String so_dien_thoai) {
		super();
		this.ma_nhan_vien = ma_nhan_vien;
		this.ten_nhan_vien = ten_nhan_vien;
		this.to_lam_viec = to_lam_viec;
		this.dia_chi = dia_chi;
		this.so_dien_thoai = so_dien_thoai;
	}
	public String getMa_nhan_vien() {
		return ma_nhan_vien;
	}
	public void setMa_nhan_vien(String ma_nhan_vien) {
		this.ma_nhan_vien = ma_nhan_vien;
	}
	public String getTen_nhan_vien() {
		return ten_nhan_vien;
	}
	public void setTen_nhan_vien(String ten_nhan_vien) {
		this.ten_nhan_vien = ten_nhan_vien;
	}
	
	public String getTo_lam_viec() {
		return to_lam_viec;
	}
	public void setTo_lam_viec(String to_lam_viec) {
		this.to_lam_viec = to_lam_viec;
	}
	public String getDia_chi() {
		return dia_chi;
	}
	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}
	public String getSo_dien_thoai() {
		return so_dien_thoai;
	}
	public void setSo_dien_thoai(String so_dien_thoai) {
		this.so_dien_thoai = so_dien_thoai;
	}
	public void NhapDL() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập mã nhân viên: ");
		ma_nhan_vien = sc.nextLine();
		System.out.print("Nhập tên nhân viên: ");
		ten_nhan_vien = sc.nextLine();
		System.out.print("Nhập tổ làm việc: ");
		to_lam_viec = sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		dia_chi = sc.nextLine();
		System.out.print("Nhập số điện thoại: ");
		so_dien_thoai = sc.nextLine();
		
		
	}
	public void XuatDL() {
		System.out.println("Mã nhân viên: "+ma_nhan_vien);
		System.out.println("Tên nhân viên: "+ten_nhan_vien);
		System.out.println("Tổ làm việc: "+to_lam_viec);
		System.out.println("Địa chỉ: "+dia_chi);
		System.out.println("Số điện thoại: "+so_dien_thoai);
		
	}
	protected abstract long Tienluong() ; 

}
	