package QLVANDONGVIEN;

import java.util.Scanner;

	public class VDONGVIEN extends NGUOI {
		
		private String montđ;
		private int mvđv;
		private long hsl, pc, thuong;
		private final int LCB = 1000000;
		
		
		public VDONGVIEN() {
			
		}
		
		
		public VDONGVIEN(String montđ, int mvđv, long hsl, long pc, long thuong) {
			super();
			this.montđ = montđ;
			this.mvđv = mvđv;
			this.hsl = hsl;
			this.pc = pc;
			this.thuong = thuong;
		}

		
		
		public String getMontđ() {
			return montđ;
		}

		public void setMontđ(String montđ) {
			this.montđ = montđ;
		}

		public int getMvđv() {
			return mvđv;
		}

		public void setMvđv(int mvđv) {
			this.mvđv = mvđv;
		}

		public float getHsl() {
			return hsl;
		}

		public void setHsl(long hsl) {
			this.hsl = hsl;
		}

		public float getPc() {
			return pc;
		}

		public void setPc(long pc) {
			this.pc = pc;
		}

		public float getThuong() {
			return thuong;
		}

		public void setThuong(long thuong) {
			this.thuong = thuong;
		}
		
		
		

		public void Nhap() {
			Scanner sc=new Scanner(System.in);
			super.Nhapthongtin();
			System.out.print("Nhập môn thi đấu: ");
			montđ=sc.nextLine();
			System.out.print("Nhập mã vận động viên: ");
			mvđv=sc.nextInt();
			System.out.print("Nhập hệ số lương: ");
			hsl=sc.nextLong();
			System.out.print("Nhập phụ cấp: ");
			pc=sc.nextLong();
			System.out.print("Nhập thưởng: ");
			thuong=sc.nextLong();	
			
		}
		
		public void Xuat() {
			super.Hienthithongtin();
			System.out.println("\t\tMôn thi đấu: "+montđ);
			System.out.println("\t\tMã vận động viên: "+mvđv);
			System.out.println("\t\tHệ số lương: "+hsl);
			System.out.println("\t\tPhụ cấp: "+pc);
			System.out.println("\t\tThưởng: "+thuong);
			System.out.println("\t\tLuong: "+luong());
			
		}
		
		public long luong() {
			long s = 0;
			s =  (LCB * hsl + pc + thuong);
			return s;
		}
		
	}

	


