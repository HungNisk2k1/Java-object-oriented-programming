package Bai_tap_lon_Java;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//Tạo lớp SinhVien gồm mã SV, họ tên, lớp, điểm
//Yêu cầu: Thêm, sửa, xóa, sắp xếp theo điểm, sx theo tên, lưu file txt, hiển thị
public class Test_Main_Nhan_viên {
	// khai báo mảng SV
	static ArrayList<ThoiVu> danhsachnv=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
		
	public static void main(String[] args) {
		int chon;
		
		do {
			menu();
			chon=Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
						Them_nhan_vien();
						break;
			case 2:
						Sua_nhan_vien();
						break;
			case 3:
						Xoa_nhan_vien();
						break;
			case 4:
			{
					int chon1;
				
					do {
						menu1();
						chon1=Integer.parseInt(sc.nextLine());
							switch (chon1) {
								case 1:
									System.out.println("\nSắp xếp nhân viên theo lương:");
									Sap_Xep_By_Luong();
									Hienthi();
									break;
								case 2:
									System.out.println("\nSắp xếp nhân viên theo tên:");
									Sap_Xep_By_Ten();
									Hienthi();
									break;
								case 3:
									System.out.println("\nSắp xếp nhân viên theo lương thoả thuận:");
									Sap_Xep_By_Luong_Thoa_Thuan();;
									Hienthi();
									break;
								case 4:
									System.out.println("\nSắp xếp nhân viên theo thời gian:");
									Sap_Xep_By_Time();
									Hienthi();
									break;
								case 5:
									System.out.println("\nSắp xếp nhân viên theo tổ làm việc:");
									Sap_Xep_By_To();
									Hienthi();
									break;
								case 6:
									System.out.println("Thoát chương trình sắp xếp");		
						}
						
					}while(chon1!=0&&chon1<6);
					break;
			}
			case 5:
			{
				int chon2;
			
				do {
					menu2();
					chon2=Integer.parseInt(sc.nextLine());
						switch (chon2) {
							case 1:
								System.out.println("\nTìm kiếm nhân viên theo mã:");
								Tim_Ma_Nhan_Vien();
								break;
							case 2:
								System.out.println("\nTìm kiếm nhân viên theo tên:");
								Tim_Ten();
								break;
							case 3:
								System.out.println("\nTìm kiếm nhân viên theo địa chỉ:");
								Tim_Dia_Chi();
								break;
							case 4:
								System.out.println("\nTìm kiếm nhân viên theo tổ làm việc:");
								Tim_To();
								break;
							case 5:
								System.out.println("Thoát chương trình tìm kiếm");		
					}
					
				}while(chon2!=0&&chon2<5);
				break;
		}
						
			case 6:
						Luu_File_nhan_vien();
						break;
			case 7:
						System.out.println("Thoát chương trình");
						break;	
			}
			
		}while(chon!=0&&chon<7);

		
	}
	

	private static void Luu_File_nhan_vien() {
		/* lưu file */
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("nhanvien.txt", true);
			/* lưu dữ liệu */
			for(ThoiVu nv: danhsachnv) {
				String line=nv.getFileLine();
				// chuyển sang byte
				try {
					byte[] b=line.getBytes("utf8");
					try {
						fos.write(b);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("Lưu thông tin thành công!");
		
	}
	private static void Them_nhan_vien() {
		System.out.println("\t\t<==Nhân viên==>");
		System.out.println("Nhập số lượng nhân viên cần thêm: ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
		System.out.println("\nNhập thông tin nhân viên "+(i+1)+" :");
		ThoiVu nv = new ThoiVu(){
			protected long Tienluong() {
				
				return 0;
			}};
		nv.NhapDL();
		danhsachnv.add(nv);
		System.out.println("\n");
	}
		System.out.println("\nDanh sách nhân viên sau khi thêm:");
		Hienthi();
	}
	private static void Hienthi() {
		System.out.println("\nThông tin nhân viên: ");
		for(ThoiVu nv:danhsachnv) {
			nv.XuatDL();
			System.out.println("\n");
		}
	}

	private static void Sap_Xep_By_Ten() {
		Collections.sort(danhsachnv, new Comparator<ThoiVu>() {
			public int compare(ThoiVu obj1, ThoiVu obj2) {
				// SX từ A-Z
				return obj1.getTen_nhan_vien().compareToIgnoreCase(obj2.getTen_nhan_vien());
			}
			
		});
		
	}
	
	private static void Sap_Xep_By_To() {
		Collections.sort(danhsachnv, new Comparator<ThoiVu>() {
			public int compare(ThoiVu obj1, ThoiVu obj2) {
				// SX từ A-Z
				return obj1.getTo_lam_viec().compareToIgnoreCase(obj2.getTo_lam_viec());
			}
			
		});
		
	}
	private static void Sap_Xep_By_Luong() {
		Collections.sort(danhsachnv, new Comparator<ThoiVu>() {
			// SX theo từ nhỏ đến lớn
			public int compare(ThoiVu obj1, ThoiVu obj2) {
				if(obj1.Tien_luong()<obj2.Tien_luong()) {
					return -1;
				}
				return 1;
			}
		});
		
	}
	private static void Sap_Xep_By_Time() {
		Collections.sort(danhsachnv, new Comparator<ThoiVu>() {
			// SX theo từ nhỏ đến lớn
			public int compare(ThoiVu obj1, ThoiVu obj2) {
				if(obj1.getThoi_gian_lam()<obj2.getThoi_gian_lam()) {
					return -1;
				}
				return 1;
			}
		});
		
	}
	private static void Sap_Xep_By_Luong_Thoa_Thuan() {
		Collections.sort(danhsachnv, new Comparator<ThoiVu>() {
			// SX theo từ nhỏ đến lớn
			public int compare(ThoiVu obj1, ThoiVu obj2) {
				if(obj1.getLuong_thoa_thuan()<obj2.getLuong_thoa_thuan()) {
					return -1;
				}
				return 1;
			}
		});
		
	}
	private static void Tim_Ma_Nhan_Vien() {
		System.out.println(" Nhập mã sinh viên cần tìm:");
		String id = sc.nextLine();
		for(ThoiVu nv:danhsachnv) { 
			if(nv.getMa_nhan_vien().equals(id)) {
				nv.XuatDL();
				break;
			}
		}	
	}
	private static void Tim_Ten() {
		System.out.println(" Nhập tên nhân viên cần tìm:");
		String id = sc.nextLine();
		for(ThoiVu nv:danhsachnv) { 
			if(nv.getTen_nhan_vien().equals(id)) {
				nv.XuatDL();
				break;
					}
		}	
	}
	private static void Tim_Dia_Chi() {
		System.out.println(" Nhập địa chỉ nhân viên cần tìm:");
		String id = sc.nextLine();
		for(ThoiVu nv:danhsachnv) { 
			if(nv.getDia_chi().equals(id)) {
				nv.XuatDL();
				break;
			}
		}	
	}
	private static void Tim_To() {
		System.out.println(" Nhập tổ làm việc nhân viên cần tìm:");
		String id = sc.nextLine();
		for(ThoiVu nv:danhsachnv) { 
			if(nv.getTo_lam_viec().equals(id)) {
				nv.XuatDL();
				break;
			}
		}	
	}
	
	private static void Xoa_nhan_vien() {
		System.out.println(" Nhập mã nhân viên cần xóa:");
		String id = sc.nextLine();
		for(ThoiVu nv:danhsachnv) { 
			if(nv.getMa_nhan_vien().equals(id)) {
				danhsachnv.remove(nv);
				break;
			}
		}
	
		System.out.println("\nDanh sách nhân viên sau khi xoá:");
		Hienthi();
	}
	
	private static void Sua_nhan_vien() {
		System.out.println("Nhập mã nhân viên cần sửa thông tin: ");
		String id = sc.nextLine();
		for(ThoiVu nv: danhsachnv) {
			if(nv.getMa_nhan_vien().equals(id)) {
				nv.NhapDL();
				break;
			}
		}
		System.out.println("\nDanh sách nhân viên sau khi sửa:");
		Hienthi();
		
	}

	static void menu() {
		System.out.println("****************************************"); 
		System.out.println("**    1. Thêm nhân viên               **");
		System.out.println("**    2. Sửa nhân viên theo mã        **");
		System.out.println("**    3. Xóa nhân viên theo mã        **");
		System.out.println("**    4. Sắp xếp                      **");
		System.out.println("**    5. Tìm kiếm                     **");
		System.out.println("**    6. Lưu vào file nhanvien.txt    **");
		System.out.println("**    7. Thoát khỏi chương trình      **");
		System.out.println("**             #Mời Chọn#             **");
		System.out.println("****************************************"); 
	}
	static void menu1() {
		System.out.println("***************************************************"); 
		System.out.println("**    1. Sắp xếp nhân viên theo lương            **");
		System.out.println("**    2. Sắp xếp nhân viên theo tên              **");
		System.out.println("**    3. Sắp xếp nhân viên theo lương thoả thuận **");
		System.out.println("**    4. Sắp xếp nhân viên theo thời gian   	 **");
		System.out.println("**    5. Sắp xếp nhân viên theo tổ làm việc      **");
		System.out.println("**    6. Thoát khỏi chương trình                 **");
		System.out.println("**             #Mời Chọn#                        **");
		System.out.println("***************************************************"); 
	}
	static void menu2() {
		System.out.println("****************************************************"); 
		System.out.println("**    1. Tìm kiếm nhân viên theo mã               **");
		System.out.println("**    2. Tìm kiếm nhân viên theo tên              **");
		System.out.println("**    3. Tìm kiếm nhân viên theo địa chỉ          **");
		System.out.println("**    4. Tìm kiếm nhân viên theo tổ làm việc      **");
		System.out.println("**    5. Thoát khỏi chương trình                  **");
		System.out.println("**             #Mời Chọn#                         **");
		System.out.println("***************************************************"); 
	}
	

	
}
