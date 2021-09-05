package Chuong2;
import java.util.Scanner;
public class Switch_case {
	    public static void main(String[] args) {
	        int number ;
	        do {
	        Scanner sc = new Scanner(System.in);
			System.out.print("Nunber = ");
	        number = sc.nextInt();
	        if(number >=8||number<=0){
	            System.out.println("\nNhap lai! ");
	           }
	        }while(number>=8||number<=0);
	    	  
	      
	      
	        switch (number) {
	            case 1:
	                System.out.println(" Chủ Nhật");
	                break;
	            case 2:
	                System.out.println(" Thứ 2");
	                break;
	            case 3:
	                System.out.println(" Thứ 3");
	                break;
	            case 4:
	                System.out.println(" Thứ 4");
	                break;
	            case 5:
	                System.out.println(" Thứ 5");
	                break;
	            case 6:
	                System.out.println(" Thứ 6");
	                break;
	            case 7:
	                System.out.println(" Thứ 7");
	                break;
	            default:
	                System.out.println("Không tôn tại!Chỉ nhập từ 1 đến 7");
	                break;
	        }
	    }
	}

