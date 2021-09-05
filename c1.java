package NguyenKeHung_15_01;
import java.util.Scanner;
public class c1 {

	private String tensx,nuocsx;
	private int namsx;
	Scanner sc=new Scanner(System.in);
	public String getTensx() {
		return tensx;
	}

	public void setTensx(String tensx) {
		this.tensx = tensx;
	}

	public String getNuocsx() {
		return nuocsx;
	}

	public void setNuocsx(String nuocsx) {
		this.nuocsx = nuocsx;
	}

	public int getNamsx() {
		return namsx;
	}

	public void setNamsx(int namsx) {
		this.namsx = namsx;
	}
	
	public c1() {}
	public c1(String tensx, String nuocsx, int namsx) {
		this.tensx = tensx;
		this.nuocsx = nuocsx;
		this.namsx = namsx;
	}
public void nhap() {
	
		System.out.println("Nhập nước sản xuất: ");
		nuocsx=sc.nextLine();
		System.out.println("Nhập tên nhà sản xuất: ");
		tensx=sc.nextLine();	
		System.out.println("Nhập năm sản xuất: ");
		namsx=sc.nextInt();
	}
	public void xuat() {
		System.out.println("Nhập nước sản xuất: "+nuocsx);
		System.out.println("Nhập tên nhà sản xuất: "+tensx);	
		System.out.println("Nhập năm sản xuất: "+namsx);

	}
	

}
