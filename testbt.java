package Chuong2;

public class testbt {

}
package chuong2;

import java.util.Scanner;

public class Sinhvien {

	private static final String Diemtb = null;
	public Sinhvien() {}
	
	private int masv;
	private String hoten;
	private float dlt;
	private float dth;
	Scanner sc=new Scanner(System.in);
	public Sinhvien(int msv, String ht, float diemlythuyet, float diemthuchanh) {
		this.masv = msv;
		this.hoten=ht;
		this.dlt=diemlythuyet;
		this.dth=diemthuchanh;
	}
	public Sinhvien(int masinhvien, String hten) {
		this.masv=masinhvien;
		this.hoten=hten;
	}
	public void nhap() {
		System.out.println("Nhập họ tên: ");
		hoten=sc.nextLine();
		System.out.println("Nhập masv: ");
		masv=sc.nextInt();
		
		System.out.println("Điểm lý thuyết: ");
		dlt=sc.nextFloat();
		System.out.println("Điểm thực hành: ");
		dth=sc.nextFloat();
	}
	
	public void xuat() {
		System.out.println("Mã Sinh viên: "+masv);
		System.out.println("Tên sinh viên: "+hoten);
		System.out.println("Điểm lý thuyết: "+dlt);
		System.out.println("Điểm thực hành: "+dth);
		System.out.println("Điểm trung bình: "+Diemtb());
	}
	
	public float Diemtb() {
		float diemtb=0;
			diemtb =(dlt+dth)/2;
		return diemtb;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Sinh viên 1:");
		Sinhvien SV1=new Sinhvien();
		SV1.nhap();
		SV1.xuat();
		System.out.println("Sinh viên 2:");
		Sinhvien SV2=new Sinhvien(1900142, "Nguyễn văn A", 8, 9);
		SV2.xuat();
		
		System.out.println("Sinh vien 3: ");
		Sinhvien SV3=new Sinhvien(1900152, "Nguyễn văn B");
		SV3.xuat();
		
	}

}