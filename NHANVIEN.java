package Practise;

import java.util.Scanner;

abstract class NHANVIEN extends THONG_TIN {
	private final float LCB = 10000;
	private String mnv;
	private String mapb;
	private double hsl;
	private double hscv;
	
	public NHANVIEN() {}

	public NHANVIEN(String mnv, String mapb, double hsl, double hscv) {
		super();
		this.mnv = mnv;
		this.mapb = mapb;
		this.hsl = hsl;
		this.hscv = hscv;
	}


	public String getMnv() {
		return mnv;
	}

	public void setMnv(String mnv) {
		this.mnv = mnv;
	}

	public String getMapb() {
		return mapb;
	}

	public void setMapb(String mapb) {
		this.mapb = mapb;
	}

	public double getHsl() {
		return hsl;
	}

	public void setHsl(double hsl) {
		this.hsl = hsl;
	}

	public double getHscv() {
		return hscv;
	}

	public void setHscv(double hscv) {
		this.hscv = hscv;
	}

	public float getLCB() {
		return LCB;
	}

	public void Nhap() {
		Scanner sc=new Scanner(System.in);
		super.Nhapthongtin();
		System.out.println("Nhập mã phòng ban");
		mapb=sc.nextLine();
		System.out.println("Nhập mã nhân viên: ");
		mnv=sc.nextLine();
		System.out.println("Nhập hệ số lương: ");
		hsl=sc.nextDouble();
		System.out.println("Nhập hệ số chức vụ: ");
		hscv=sc.nextDouble();
	}
	
	public void Xuat() {
		super.Hienthithongtin();
		System.out.println("\t\t Mã nhân viên: "+mnv);
		System.out.println("\t\t Mã phòng ban: "+mapb);
		System.out.println("\t\t Hệ số lương: "+hsl);
		System.out.println("\t\t Hệ số chức vụ: "+hscv);	
		System.out.println("\t\t Lương: "+Salary());
	}
	
	public int Salary() {
		int s = 1;
		s = (int) (LCB * hsl * (1 + hscv));
		return s;
	}

	public String getFileLine() {
		// TODO Auto-generated method stub
		return getHt()+"\n"+getTuoi()+"\n"+getDiachi()+"\n"+mnv+"\n"+mapb+"\n"+hsl+"\n";
	}
}
