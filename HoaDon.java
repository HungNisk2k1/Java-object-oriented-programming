package QLHangHoa;
import java.util.Scanner;
public class HoaDon {
private String So,Ngay;
KhachHang KH;
HangHoa Hang[];
int MaxN=0,n=0;
	
	
	
	public String getSo() {
	return So;
}



public void setSo(String so) {
	So = so;
}



public String getNgay() {
	return Ngay;
}



public void setNgay(String ngay) {
	Ngay = ngay;
}



public int getN() {
	return n;
}



public void setN(int n) {
	this.n = n;
}

public HoaDon() {
	
}
public HoaDon(String so, String ngay) {
	super();
	So = so;
	Ngay = ngay;
}


public void HoaDon(String so, String ngay, KhachHang kH, int maxN) {
	
	So = so;
	Ngay = ngay;
	KH = kH;
	MaxN = maxN;
	Hang=new HangHoa[MaxN];
	for (int i=0;i<n;i++) {
		Hang[i]=new HangHoa();
		
	}
}
public void Add(HangHoa h) {
	if(n==MaxN)
		System.out.println("Mảng hàng hoá đã đầy!!");
	else {
		Hang[n++]=h;
	}
}
public long TongHD() {
	long tong=0;
	for(int i=0;i<n;i++)
		tong=tong+Hang[i].getSoluong()*Hang[i].getDonggia();
	return tong;
}
public void XuatHoaDon() {
	System.out.println("Thông tin hoá đơn");
	System.out.println("Số hoá đơn: "+So+" , ngày: "+Ngay);
	System.out.println("Khách hàng: ");
	KH.Hienthi();
	System.out.println("Chi tiết hoá đơn: ");
	for(int i=0;i<n;i++) {
		Hang[i].Hienthi();
	}
	System.out.println("Tổng hoá đơn: "+TongHD());
}


	public static void main(String[] args) {
		HoaDon hd=new HoaDon();
		KhachHang kh=new KhachHang();
		HangHoa hangHoa=new HangHoa();
		kh.NhapDL();
		hd.HoaDon("HD01","26/07/2021",kh,5);
		hangHoa.NhapDL();
		hd.Add(hangHoa);
		hangHoa=new HangHoa();
		hangHoa.NhapDL();
		hd.Add(hangHoa);
		hd.XuatHoaDon();
	}

}
