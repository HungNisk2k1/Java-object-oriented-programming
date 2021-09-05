package QLVANDONGVIEN;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
			
				int n;
				
					Scanner sc= new Scanner(System.in);
					System.out.println("Nhập số vận động viên: ");
					n=sc.nextInt();
					VDONGVIEN v[]=new VDONGVIEN[n];
				for(int i=0;i<n;i++) {
					v[i]=new VDONGVIEN();
					System.out.println("\t\tThông tin Vận Động Viên "+(i+1)+":");
					v[i].Nhap();
					System.out.println("\n\n");
				}
				
					System.out.println("\t\tXuất thông tin :");
				for(int i=0;i<n;i++) {
					v[i].Xuat();
					System.out.println("\n\n");
				}
			
					//Sắp xếp
			VDONGVIEN temp, max;
		        for (int i = 0 ; i < n - 1; i++) {
		        	max=v[i];
		            for (int j = i + 1; j < n; j++) {
		                if(v[j].luong() > v[i].luong()) {
		                    temp=v[j];
		                    v[j]=max;
		                    v[i]=temp;
		                }    
		            }
		        }
				
		        
		        System.out.println("Lương nhân viên sắp xếp giảm dần: ");
		        for (int i = 0; i < n; i++) {
		            v[i].Xuat();
		            System.out.println("\n");
		        }
		        
		        //Tìm kiếm vận động viên có luong thấp nhấp
		        System.out.println("\t\tVận động viên có lương thấp nhất: ");
		        float min = 0.0f;
		        for(int i=0;i<n;i++) {
		        	min=v[0].luong();
		        	if(min>v[i].luong()) {
		        		min = v[i].luong(); 
		        		v[i].Xuat();
		        		}
		       
		        }  
			}
	}

