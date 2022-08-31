package module2_bai13_congNhan;
import java.util.Scanner;
public class Cong_nhan {
	private String mHo;
	private String mTen;
	private int mSoSP;
	private double tinhLuong;
	private final double mot_den199=0.5;
	private final double haitram_den399=0.55;
	private final double bontram_den599=0.6;
	private final double sautram_trolen=0.65;
	
	
	public Cong_nhan() {
		this("chưa xác định","Chưa xác định",-999999);
		
	}
	public Cong_nhan(String mHo, String mTen, int mSoSP) {
		super();
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
		
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		if(mSoSP >=0)
			this.mSoSP = mSoSP;
		else
			this.mSoSP=-999999;
	}

	
	public double setTinhLuong() {
		if(mSoSP <=199)
			return (double)  (mot_den199*mSoSP);
		else if(mSoSP >=200||mSoSP <=399)
			return (double) (mSoSP*haitram_den399);
		else if(mSoSP >=400||mSoSP <=599)
			return (double) (mSoSP*bontram_den599);
			else
				return (double) (mSoSP*sautram_trolen);
			
		
	}
	@Override
	public String toString() {
		String str="";
		str+=str.format("%-10s %-20s %-10s %-10s \n",mHo,mTen,mSoSP,setTinhLuong());
		
		return str;
	}
	
	public void hienThiMenu(){
		System.out.printf("%-10s %-20s %-10d %-20.2f \n",mHo,mTen,mSoSP,setTinhLuong());
	}
	public static void main (String []args){
		Cong_nhan cn=new Cong_nhan("Vũ", "Khoa", 487);
		System.out.println(cn.toString());
	}
	
	
}
