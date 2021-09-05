package QLVANDONGVIEN;

import java.util.Scanner;

	public class NGUOI {

		private String ht;
		private int tuoi;
		private String quequan;
		
		public NGUOI() {}
		public NGUOI(String ht, int tuoi, String quequan) {
			this.ht=ht;
			this.tuoi=tuoi;
			this.quequan=quequan;
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
		public String getQuequan() {
			return quequan;
		}
		public void setQuequan(String quequan) {
			this.quequan = quequan;
		}
		
		public void Nhapthongtin() {
			Scanner c=new Scanner(System.in);
			System.out.print("Nhập họ tên: ");
			ht=c.nextLine();
			System.out.print("Nhập quê quán: ");
			quequan=c.nextLine();
			System.out.print("Nhập tuổi: ");
			tuoi=c.nextInt();
		}	
		
		public void Hienthithongtin() {
			System.out.println("\t\tHọ tên: "+ht);
			System.out.println("\t\tQuê quán: "+quequan);
			System.out.println("\t\tTuổi: "+tuoi);
		}
		}


