package QLHangHoa;
import java.util.Scanner;
public class KhachHang {
	private String hoten,diachi,sdt;
	public KhachHang() {
		
	}
	
	/**
	 * @param hoten
	 * @param diachi
	 * @param sdt
	 */
	public KhachHang(String hoten, String diachi, String sdt) {
		super();
		this.hoten = hoten;
		this.diachi = diachi;
		this.sdt = sdt;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public void NhapDL() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập thông tin khách hàng");
		System.out.println("Họ tên KH: ");
		hoten=sc.nextLine();
		System.out.println("Địa chỉ: ");
		diachi=sc.nextLine();
		System.out.println("Số ĐT: ");
		sdt=sc.nextLine();
	}
	public void Hienthi() {
		System.out.println("Tên khách hàng: "+hoten);
		System.out.println("Địa chỉ: "+diachi);
		System.out.println("Số điện thoại: "+sdt);
	}

}
