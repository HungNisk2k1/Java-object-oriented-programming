package Chuong2;
/*Bài 2: Viết chương trình cho phép:
– Nhập vào mảng 2 chiều.
– Xuất mảng 2 chiều ra ngoài màn hình.
– Tính tổng các phần tử trong mảng
– Tìm phần tử nhỏ nhất trong mảng*/
import java.util.Scanner;

public class mang2chieu {
	public static void main(String[] args) {
		int n,x,tong =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("-Nhập giá trị n = ");n=sc.nextInt();
		int[][]a=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
			System.out.print("a[ "+i+" ][ "+j+" ] = ");
			a[i][j]=sc.nextInt();
		}
		}
		System.out.println("-In ra các phần tử trong mảng");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
		
			System.out.print(a[i][j]+" ");
		}
	}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
		
			tong+=a[i][j];
		}
		}
		System.out.println("\n-Tổng các phần tử trong mảng: "+tong);
	int min=a[0][0];
	for(int i=1;i<n;i++) {
		for(int j=0;j<n;j++) {
		if(a[i][j] < min ) {
			min =a[i][j];
		}
		
	}
	}
	System.out.println("-Giá trị nhỏ nhất trong mảng: "+min);
}
}
