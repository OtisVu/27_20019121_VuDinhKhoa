package module2_bai12_CD;
import java.util.Scanner;

import module2_bai12_CD.CD;
public class CDLIST {
	static Scanner sc = new Scanner(System.in);
    static void nhapMenu(CD h) {
        System.out.print("Nhập mã CD: ");
        h.setMaCD(sc.nextInt());
        sc.nextLine();
        
        System.out.print("Nhập tựa CD : ");
        h.setTuaCD(sc.nextLine());
        
        System.out.print("Nhập số bài hát : ");
        h.setSoBaiHat(sc.nextInt());
        sc.nextLine();
        
        System.out.print("Nhập giá thành : ");
        h.setGiaThanh(sc.nextFloat());
    }
	public static void main(String[] args) {
		CD b10[]= null;
		int a ,n=0;
		boolean flag = true;
		
		
		do{
			System.out.println("0.Nhập CD:\n"+"1.Xuất ds CD :\n"+"2.Tính số lượng CD: \n" +"4.Tính tổng giá thành CD:\n"+"6.Sắp xếp ds giảm dần theo giá thành:\n"+"7.Sắp xếp ds tăng dần theo tựa CD:\n"+"Nhập số khác để thoát:");
			a=sc.nextInt();
			switch (a) {
            case 0:
                System.out.println("Nhập số lượng CD : ");
                n = sc.nextInt();
                b10 = new CD[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("CD thứ " + (i + 1)+": ");
                    b10[i] = new CD();
                    nhapMenu(b10[i]);
                }
                break;
            case 1:
                System.out.printf("%-10s %-20s %-10s %-20s \n", "Mã CD", "Tựa CD", "Số bài hát", "Giá thành");
                for (int i = 0; i < n; i++) {
                    b10[i].hienThiMenu();
                }
                break;
            case 2:
            	System.out.println("Tổng số lượng CD là : " + n);
                break;
          
            case 4:
            	int tong = 0;
                for (int i = 0; i < n; i++) {
                    tong += b10[i].getGiaThanh();
                }
                System.out.println("" +
                        "Tổng giá thành là : " + tong);
                break;
                
        
            case 6:
            	 CD temp = b10[0];
                 for (int i = 0; i < n - 1; i++) {
                     for (int j = i + 1; j < n; j++) {
                         if (b10[i].getGiaThanh() < b10[j].getGiaThanh()) {
                             temp = b10[j];
                             b10[j] = b10[i];
                             b10[i] = temp;
                         }
                     }
                 }
                 System.out.println("Sắp xếp thành công, Nhập số 1 để kiểm tra!");
                 break;
            case 7:
            	   temp = b10[0];
                   for (int i = 0; i < n - 1; i++) {
                       for (int j = i + 1; j < n; j++) {
                           if (b10[i].getTuaCD().compareTo(b10[j].getTuaCD())>0) {
                               temp = b10[j];
                               b10[j] = b10[i];
                               b10[i] = temp;
                           }
                       }
                   }
                   System.out.println("Sắp xếp thành công, Nhập số 1 để kiểm tra!");
                   break;
               default:
                   System.out.println("Goodbye");
                   flag = false;
                   break;
        }
    }while (flag) ;
}
}
	