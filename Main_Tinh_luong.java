package Practise;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main_Tinh_luong {

	private static final String NHANVIEN = null;
	static ArrayList<NHANVIEN> nvList=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon;
		do {
			Menu();
			chon=Integer.parseInt(sc.nextLine());//chuyển về dạng chuỗi
			switch (chon) {
			case 0:{
				break;
			}
			case 1: {
				Themnv();
				break;
			}
			
			case 2:{
				Suanv();
				break;
			}
			
			case 3:{
				Xoa();
				break;
			}
	
			case 4:{
				SapxepByTen();
				break;
			}
			case 5:{
				Hienthi();
				break;
			}
			case 6:{
				Luufile();
				break;
			}
			case 7:{
				SapxepByLuong();
				Hienthi();
				break;
			}
			default:
				System.out.println("Nhập lại");
			}
		}while(chon!=0);
	}
	
	private static void Luufile() {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;//tạo mới đói tượng
		try {
			fos=new FileOutputStream("nhanvien.txt");//tạo file sinh viên.txt
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(NHANVIEN nv: nvList) {//duyệt tất cả phần tử mảng
			String line = nv.getFileLine();//lấy từng dòng trong mang
			byte[] b;
			try {
			b = line.getBytes("utf8");//kiểu dịch ra tiếng việt
				fos.write(b);//Viết vào file
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		}
	}

	private static void Hienthi() {
		// TODO Auto-generated method stub
		for(NHANVIEN nv: nvList) {//duyệt qua tât cả đối tượng trong list
			nv.Xuat();
		}
	}

	private static void SapxepByTen() {
		// TODO Auto-generated method stub
		Collections.sort(nvList,new Comparator<NHANVIEN>() {//tạo đối tượng so sánh mảng
			@Override
			public int compare(NHANVIEN obj1, NHANVIEN obj2) {//so snah hai đối tượng 
				// TODO Auto-generated method stub
				//sắp xếp từ A-Z
				return obj1.getHt().compareToIgnoreCase(obj2.getHt());//so sánh hai họ tên sinh viên
			}
		});
	}

	private static void SapxepByLuong() {
		// TODO Auto-generated method stub
		Collections.sort(nvList,new Comparator<NHANVIEN>() 
		{

			@Override
			public int compare(NHANVIEN o1, NHANVIEN o2) 
			{
				// TODO Auto-generated method stub
				if(o1.Salary()<o2.Salary())
				{
					return -1;
				}
				return 1;
			}
			
		});
		
	}

	private static void Xoa() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã nhân viên cần xóa: ");
		String id=sc.nextLine();
		for(NHANVIEN nv: nvList) 
		{
			if(nv.getMnv().equals(id))
			{
				nvList.remove(nv);
				break;
			}
		}	
	}

	private static void Suanv() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã nhân viên cần sửa");
		String id=sc.nextLine();
		for(NHANVIEN nv: nvList) 
		{
			if(nv.getMnv().equals(id)) 
			{//Nhập chuỗi
			nv.Nhap();
			System.out.println("\n");
			break;
			}
		}
	}

	private static void Themnv() {
		// TODO Auto-generated method stub
		System.out.println("Nhập số nhân viên thêm: ");
		int n=Integer.parseInt(sc.nextLine());//Nhập chuỗi
		for(int i=0;i<n;i++) 
		{
			NHANVIEN nv=new NHANVIEN() {};
			nv.Nhap();
			nvList.add(nv);
			System.out.println("\n");
		}
	}

	public static void Menu() {
		System.out.println("\n1.Them nhân viên\n2.Sửa nhân viên theo mã\n3.Xóa nhân viên\n4.Sắp xếp nhân viên theo tên\n5.Hiển thị danh sách nhân viên\n6.Lưu file sinh viên.txt\n7 Sắp xếp nhân viên theo Lương\n0.Thoát\nChọn: ");
		
	}
}
	


