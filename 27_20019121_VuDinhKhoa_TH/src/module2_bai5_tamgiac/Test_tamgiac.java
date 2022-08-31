package module2_bai5_tamgiac;

import java.util.Scanner;

public class Test_tamgiac {

	public static void main(String[] args) {
		System.out.println("Chương trình chạy thử lớp tam giác");
		
		 tieuDeCot();
//		 Tam_giac hmem =nhapMem();
		 nhapCung();

	}
	
	static void tieuDeCot() {
		String str="";
		str+=str.format("%15s%15s%15s%15s%15s%15s","Cạnh ma|","Cạnh mb|","Cạnh mc|","Chu vi|","Diện tích|","Thông tin|");
		System.out.println(str);
		for(int i =0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}
	
//	static Tam_giac nhapMem(){
//		int ma,mb,mc;
//		
//		Tam_giac h = new Tam_giac();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập cạnh ma: ");
//		ma=sc.nextInt();
//		
//		System.out.println("Nhập cạnh mb: ");
//		mb=sc.nextInt();
//		
//		System.out.println("Nhập canh mc: ");
//		mc=sc.nextInt();
//		
//		h.setMa(ma);
//		h.setMb(mb);
//		h.setMc(mc);
//		System.out.println(h);
//		return h;
//	}
	
	static void nhapCung(){
		
		/** 2 hình lỗi **/
		Tam_giac h1 = new Tam_giac();
		 h1.setMa(-3);
		 h1.setMb(-4);
		 h1.setMc(-5);
		 
		 Tam_giac h2 = new Tam_giac();
		 h2.setMa(-6);
		 h2.setMb(-7);
		 h2.setMc(-8);
		 
		 /** 3 hình cân , đều , thường **/
		 Tam_giac h3 = new Tam_giac();
		 h3.setMa(7);
		 h3.setMb(7);
		 h3.setMc(6);
		 
		 Tam_giac h4 = new Tam_giac();
		 h4.setMa(8);
		 h4.setMb(8);
		 h4.setMc(8);
		 
		 Tam_giac h5 = new Tam_giac();
		 h5.setMa(3);
		 h5.setMb(5);
		 h5.setMc(1);
		 
		 
		 System.out.println(String.format("%15s%15s%15s%15s%15s%15s","Cạnh ma|","Cạnh mb|",
				 "Cạnh mc|","Chu vi|","Diện tích|","Thông tin|"));
		 System.out.println(h1);
		 System.out.println(h2);
		 System.out.println(h3);
		 System.out.println(h4);
		 System.out.println(h5);
	}
	

}
