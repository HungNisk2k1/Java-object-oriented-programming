package Practise;

import java.util.Scanner;

abstract class THONG_TIN {

	private String ht;
	private int tuoi;
	private String diachi;
	
	protected abstract int Salary();
	
	public THONG_TIN() {}
	public THONG_TIN(String ht, int tuoi, String diachi) {
		super();
		this.ht = ht;
		this.tuoi = tuoi;
		this.diachi = diachi;
	}

	public String getHt() {
		return ht;
	}
	public void setHt(String ht) {
		this.ht = ht;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	
	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public void Nhapthongtin() {
		Scanner c=new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		ht=c.nextLine();
		System.out.print("Nhập địa chỉ: ");
		diachi=c.nextLine();
		System.out.print("Nhập tuổi: ");
		tuoi=c.nextInt();
	}	
	
	public void Hienthithongtin() {
		System.out.println("\t\tHọ tên: "+ht);
		System.out.println("\t\tĐịa chỉ: "+diachi);
		System.out.println("\t\tTuổi: "+tuoi);
	}
	}
