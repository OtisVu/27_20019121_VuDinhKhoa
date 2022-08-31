package module2_bai13_congNhan;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class Danh_sach_CN {
	static Scanner sc = new Scanner(System.in);
	static void nhapMenu(Cong_nhan h){
		System.out.println("Nhập vào họ:");
		h.setmHo(sc.next());
		sc.nextLine();
		
		System.out.println("Nhập vào tên:");
		h.setmTen(sc.nextLine());
		
		
		System.out.println("Nhập số sản phẩm:");
		h.setmSoSP(sc.nextInt());
		sc.nextLine();
		
	}
	
	public static void main(String[] args) {
		Cong_nhan cn[]=null;
		int a,n=0;
		boolean flag=true;
		do{
			System.out.println("1.Nhập số CN:\n"+"2.Xuất ds công nhân:\n"+"3.Đếm số lương CN:\n"+"4.Sắp xếp CN theo số SP giảm dần:\n"+"5.Tìm kiếm CN:\n");
			a=sc.nextInt();
			switch (a) {
			
			case 1:
			System.out.println("Nhập số lượng CN:");
			n=sc.nextInt();
			cn = new Cong_nhan[n];
			for( int i=0; i <n ; i++){
				System.out.println("CN thứ "+(i+1)+":");
				cn[i] =new Cong_nhan();
				nhapMenu(cn[i]);
			}
			break;
			
			case 2:
				 System.out.printf("%-10s %-20s %-10s %-20s \n", "Họ", "Tên", "Số SP","Thành lương");
	                for (int i = 0; i < n; i++) {
	                	
	                	 cn[i].hienThiMenu();
	                	 
	                }
	                break;
			case 3:
				System.out.println("Số lượng sản phẩm:"+n);
				break;
			
			case 4:
				Cong_nhan temp =cn[0];
				for(int i=0;i<=n-1;i++){
					for(int j=i+1;j<n;j++){
						if(cn[i].getmSoSP()<cn[j].getmSoSP()){
							temp= cn[j];
							cn[j]=cn[i];
							cn[i]=temp;
							
					}
				}
				}System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                break;
                
			
		}
		}while(flag);

		}

}
