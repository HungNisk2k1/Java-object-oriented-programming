package NguyenKeHung_15_01;

import java.util.Scanner;

public class c2  extends c1{
	private String tensp;
	private int masp,dongia;
	Scanner sc=new Scanner(System.in);
	
	public String getTensp() {
		return tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public int getMasp() {
		return masp;
	}

	public void setMasp(int masp) {
		this.masp = masp;
	}

	public int getDongia() {
		return dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

	
	public c2() {}
	public c2(String tensx, String nuocsx, int namsx,String tensp, int masp, int dongia) {
		super(tensx, nuocsx, namsx);
		this.tensp = tensp;
		this.masp = masp;
		this.dongia = dongia;
		
	}
	
	
	

	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		tensp = sc.nextLine();
		System.out.print("Nhập mã sản phẩm: ");
		masp = sc.nextInt();
		System.out.print("Nhập giá: ");
		dongia = sc.nextInt();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Tên sản phẩm: "+tensp);
		System.out.println("Mã sản phẩm: "+masp);
		System.out.println("Đơn giá: "+dongia);
	}
	

	}


