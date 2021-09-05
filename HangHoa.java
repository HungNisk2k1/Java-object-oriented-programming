package QLHangHoa;
import java.util.Scanner;
public class HangHoa {
private String tenhang;
private int soluong;
private long donggia;
public String getTenhang() {
	return tenhang;
}
public void setTenhang(String tenhang) {
	this.tenhang = tenhang;
}
public int getSoluong() {
	return soluong;
}
public void setSoluong(int soluong) {
	this.soluong = soluong;
}
public long getDonggia() {
	return donggia;
}
public void setDonggia(long donggia) {
	this.donggia = donggia;
}
/**
 * @param tenhang
 * @param soluong
 * @param donggia
 */
public HangHoa(String tenhang, int soluong, long donggia) {
	super();
	this.tenhang = tenhang;
	this.soluong = soluong;
	this.donggia = donggia;
}
public HangHoa() {
	
}
public void NhapDL() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Thông tin hàng hoá: ");
	System.out.println("Nhập tên hang: ");
	tenhang=sc.nextLine();
	System.out.println("Số lượng: ");
	soluong=sc.nextInt();
	System.out.println("Đơn giá: ");
	donggia=sc.nextLong();
}
public void Hienthi() {
	System.out.println("Tên hàng: "+tenhang);
	System.out.println("Số lượng: "+soluong);
	System.out.println("Đơn giá: "+donggia);
	System.out.println("Thành tiền: "+soluong*donggia);
}
}
