package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10.1
		 */
//		Scanner sc = new Scanner (System.in);
//
//		System.out.print("Nhap mot so nguyen: ");
//		int n = sc.nextInt();

//		switch (kiemTraSoNguyen(n)) {
//		case 1:
//			System.out.println(n + " la so nguyen duong");
//			break;
//		case -1:
//			System.out.println(n + " la so nguyen am");
//			break;
//		default:
//			System.out.println(n + " khong phai la so nguyen duong hay am");
//			break;
//		}
//		sc.close();
//	    }

//		static int kiemTraSoNguyen(int n) {
//			if (n > 0) {
//				return 1;
//			} else if (n < 0) {
//				return -1;
//			} else {
//				return 0;
//			}
		/*
		 * 10.2
		 */
//		Scanner sc = new Scanner (System.in);
//
//		System.out.print("Nhap mot so nguyen: ");
//		int n = sc.nextInt();

//		int layDu = n % 3;
//        switch (layDu) {
//            case 0:
//                System.out.println(n + " chia het cho 3");
//                break;
//            default:
//                layDu = n % 5;
//                switch (layDu) {
//                    case 0:
//                        System.out.println(n + " chia het cho 5");
//                        break;
//                    default:
//                        System.out.println(n +  " khong chia het cho 3 va 5");
//                        break;
//                }
//                break;
//        }

//        sc.close();
		/*
		 * 10.3
		 */
//		Scanner sc = new Scanner (System.in);

//		System.out.print("Nhap so thang: ");
//		int month = sc.nextInt();

//	        switch (month) {
//	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//	                System.out.println("Thang " + month + " co 31 ngay");
//	                break;
//	            case 4: case 6: case 9: case 11:
//	            	System.out.println("Thang " + month + " co 30 ngay");
//	                break;
//	            case 2:
//	            	System.out.println("Thang " + month + " co 28 ngay");
//	                break;
//	            default:
//	            	System.out.println("Thang khong hop le");
//	            	break;
//	        }
		/*
		 * 10.4
		 */
//		Scanner sc = new Scanner(System.in);

//		 System.out.println("Nhap cac he so cua phuong trinh bac 2");
//	        System.out.print("Nhap a: ");
//	        double a = sc.nextDouble();
//	        System.out.print("Nhap b: ");
//	        double b = sc.nextDouble();
//	        System.out.print("Nhap c: ");
//	        double c = sc.nextDouble();

//	        double delta = b * b - 4 * a * c;
//	        switch (kiemTraDelta(delta)) {
//	            case 1:
//	                System.out.println("Phuong trinh co 2 nghiem phan biet");
//	                break;
//	            case 0:
//	                System.out.println("Phuong trinh co nghiem kep");
//	                break;
//	            default:
//	                System.out.println("Phuong trinh vo nghiem");
//	                break;
//	        }

//	        sc.close();
//	    }

//	   	static int kiemTraDelta(double delta) {
//	        if (delta > 0) {
//	            return 1;
//	        } else if (delta == 0) {
//	            return 0;
//	        } else {
//	            return -1;
//	        }
		

	}

}
