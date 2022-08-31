package module2_bai6_thongTinDangKyXe;
import java.util.Scanner;
public class Thong_tin_dang_ky_xe {
	private String chuXe,loaiXe;
	private int dungTichXylanh;
	private double triGia;
	final double THUEDUNGTICHXE=0.01;
	static final double THUEDUNGTICHTB=0.03;
	static final double THUEDUNGTICHLON=0.05;

	

	public Thong_tin_dang_ky_xe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Thong_tin_dang_ky_xe(String chuXe, String loaiXe, int dungTichXylanh, double triGia) {
		super();
		
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.dungTichXylanh = dungTichXylanh;
		this.triGia = triGia;
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		if(triGia >=0)
			this.triGia= triGia;
		else
			this.triGia=0;
	}

	public int getDungTichXylanh() {
		return dungTichXylanh;
	}

	public void setDungTichXylanh(int dungTichXylanh) {
		if(dungTichXylanh>=0)
			this.dungTichXylanh =dungTichXylanh;
		else
			this.dungTichXylanh=0;
	}

	public double getTHUEDUNGTICHXE() {
			if(dungTichXylanh<100)
				return (double) (triGia*THUEDUNGTICHXE);
			else if(dungTichXylanh<200)
				return (double) (triGia*THUEDUNGTICHTB);
			return (double) (triGia*THUEDUNGTICHLON);		
	}

	public static double getThuedungtichtb() {
		return THUEDUNGTICHTB;
	}

	public static double getThuedungtichlon() {
		return THUEDUNGTICHLON;
	}

	
	@Override
	public String toString() 
	{
		String str="";
		str+=str.format("%15s%15s%15s%15s%15s",getChuXe(),getLoaiXe(),getDungTichXylanh(),getTriGia(),getTHUEDUNGTICHXE());

		return str;
	}
	
	

	public static void main(String[] args) {
		System.out.println("Thông tin đăng ký xe");
		
		tieuDeCot();
		Thong_tin_dang_ky_xe xeMem=nhapMem();
		 nhapCung();
		 
		 
	}

	static void nhapCung(){
		Thong_tin_dang_ky_xe xe1=new Thong_tin_dang_ky_xe();
		xe1.setChuXe("Vũ Đình Khoa");
		xe1.setLoaiXe("wave alpha");
		xe1.setDungTichXylanh(100);
		xe1.setTriGia(200000);
		//xe1.thueNop();
		
		Thong_tin_dang_ky_xe xe2=new Thong_tin_dang_ky_xe();
		xe2.setChuXe("Vũ Trọng Bình");
		xe2.setLoaiXe("Vario");
		xe2.setDungTichXylanh(150);
		xe2.setTriGia(350000);
		//xe2.thueNop();
	
		System.out.println(xe1);
		System.out.println(xe2);
		
	}
	static Thong_tin_dang_ky_xe nhapMem() {
		String chuxe,loaixe;
		int dungtichxylanh;
		double trigia;
		
		Thong_tin_dang_ky_xe xe =new Thong_tin_dang_ky_xe();
		System.out.println("Nhập tên chủ xe:");
		Scanner scn =new Scanner(System.in);
		chuxe=scn.next();
		
		System.out.println("Nhập tên loại xe:");
		loaixe=scn.next();
		
		System.out.println("Dung tích xylanh:");
		dungtichxylanh=scn.nextInt();
		
		System.out.println("Trị giá xe:");
		trigia=scn.nextDouble();
		
		xe.setChuXe(chuxe);
		xe.setLoaiXe(loaixe);
		xe.setDungTichXylanh(dungtichxylanh);
		xe.setTriGia(trigia);
		System.out.println(xe);
		
		return xe;
	}
	static void tieuDeCot() {
		String str="";
		str+=str.format("%15s%15s%15s%15s%15s","Tên chủ xe|","Loại xe|","Dung tích|","Trị giá|","Thuế nộp|");
		System.out.println(str);
		for(int i =0;i<80;i++)
		{
			System.out.print("=");
		}
		System.out.println("");
	}

}

