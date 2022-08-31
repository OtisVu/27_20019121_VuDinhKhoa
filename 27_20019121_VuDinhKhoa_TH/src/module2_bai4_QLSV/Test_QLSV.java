package module2_bai4_QLSV;
import java.util.Scanner;
public class Test_QLSV extends QLSV{
	public static void main(String[] args) {
		System.out.println("Chương trình quản lý sv");
		
		 tieuDeCot();
		 QLSV svMem=nhapMem();
		 nhapCung();
	}
	
	
	static void nhapCung() {
		QLSV sv1= new QLSV();
			sv1.setMaSV(20026576);
			sv1.setHoTen("Lâm Văn Dền");
			sv1.setDiemLT(9);
			sv1.setDiemTH(8);
			
		QLSV sv2= new QLSV();
			sv2.setMaSV(20056780);
			sv2.setHoTen("Vũ Trọng Bình");
			sv2.setDiemLT(7);
			sv2.setDiemTH(8);
			
		QLSV sv3 =new QLSV();
			sv3.setMaSV(20056453);
			sv3.setHoTen("Nguyễn Văn A");
			sv3.setDiemLT(7);
			sv3.setDiemTH(7);
			
		System.out.println(String.format("%15s%15s%15s%15s%15s", 
				"MSSV|","Họ Tên|","Điểm lt|","Điểm th|","Điểm tb|"));	
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		}
	static QLSV nhapMem() {
		int masv;
		String hoten;
		float diemlt;
		float diemth;
		
		QLSV sv =new QLSV();
		System.out.println("Nhập mã sv:");
		Scanner scn =new Scanner(System.in);
		masv=scn.nextInt();
		
		System.out.println("Nhập họ tên sv:");
		hoten=scn.next();
		
		System.out.println("Nhập điểm lt: ");
		diemlt=scn.nextFloat();
		
		System.out.println("Nhập điểm th:");
		diemth=scn.nextFloat();
		
		sv.setMaSV(masv);
		sv.setHoTen(hoten);
		sv.setDiemLT(diemlt);
		sv.setDiemTH(diemth);
		System.out.println(sv);
		return sv;
	}
	static void tieuDeCot() {
		String str="";
		str+=str.format("%15s%15s%15s%15s%15s","MSSV|","Họ Tên|","Điểm lt|","Điểm th|","Điểm tb|");
		System.out.println(str);
		for(int i =0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}
}
