package Chuong2;
/*Bài 1: Viết chương trình cho phép:
– Nhập vào mảng 1 chiều.
– Xuất mảng ra ngoài màn hình.
– Tính tổng các phần tử trong mảng
– Tìm phần tử lớn nhất trong mảng
– Sắp xếp mảng tăng dần.
– Tìm xem trong mảng có phần tử nào có giá trị bằng 5 không? Nếu có
in ra vị trí của nó.*/
import java.util.Scanner;

public class testmang {

	public static void main(String[] args) {
		int n,x,tong =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("-Nhập giá trị n = ");n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("a[ "+i+" ] = ");
			a[i]=sc.nextInt();
		}
		System.out.println("-In ra các phần tử trong mảng");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ; ");
		}
		for(int i=0;i<n;i++) {
			tong+=a[i];
		}
		System.out.println("\n-Tổng các phần tử trong mảng: "+tong);
	int max=a[0];
	for(int i=1;i<n;i++) {
		if(a[i] > max ) {
			max =a[i];
		}
		
	}
	System.out.println("-Giá trị lớn nhất trong mảng: "+max);
	int min=a[0];
	for(int i=1;i<n;i++) {
		if(a[i] < min ) {
			min =a[i];
		}
		
	}
	System.out.println("-Giá trị nhỏ nhất trong mảng: "+min);
	int temp;
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(a[i]>a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	System.out.print("-Mảng sau khi sắp xếp tăng dần: ");
	for(int i =0;i<n;i++) {
		System.out.print(a[i]+" ; ");
			}
	int gm;
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(a[i]<a[j]) {
				gm = a[i];
				a[i] = a[j];
				a[j] = gm;
			}
		}
	}
	System.out.print("\n-Mảng sau khi sắp xếp giảm dần: ");
	for(int i =0;i<n;i++) {
		System.out.print(a[i]+" ; ");
			}
	int d=0;
	int i;
	System.out.print("\n-Nhập số nguyên cần tìm: ");
    x = sc.nextInt();
    for( i = 0;i<n;i++) {
        if (a[i]==x) {
        	d++;
    
    	if(d == 0) {
           System.out.println("Tìm thấy x ="+x+ "tại vị trí ");
    	}else { 
        	System.out.println("Không tìm thấy x = "+x);
    }
	}
    
                 
    
    } 
	}
}

	




	


	
	

