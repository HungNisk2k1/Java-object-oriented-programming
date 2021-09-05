package NguyenKeHung_15_01;

import java.util.Scanner;


public class c4 {
	
	public static void main(String[] args) {
		 int n;
		Scanner sc = new Scanner(System.in);
		c2 a=new c2();
		System.out.print("-Nhập số lượng di động: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
		a.nhap();
		}
		System.out.println("-Danh sach thông tin di động: ");
		for(int i=0;i<n;i++) {
			a.xuat();
		}
		c2 c=new c2("Sam Sung","Việt Nam",2021,"Sam Sung A50s",111,1000);
		c.xuat();
		c2 d=new c2();
		if(d.getDongia()>5000000) {
			d.xuat();
		
	}

}
}