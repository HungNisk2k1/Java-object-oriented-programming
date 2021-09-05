package Chuong2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Phuong_trinh_bac1 {
	    public static void main(String[] args) {
	        int a, b;
	        double nghiem;
	        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.print("Nhập vào số a: ");
	        a = sc.nextInt();
	        System.out.print("Nhập vào số b: ");
	        b = sc.nextInt();
	        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình này có vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            nghiem = (double) -b / a;   
	            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
	        }
	        
	    }
	}





