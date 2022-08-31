package module2_bai4_QLSV;

public class QLSV {
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	public QLSV(int maSV, String hoTen, float diemLT, float diemTH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	
	
	public QLSV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getMaSV() {
		return maSV;
	}
	
	
	public void setMaSV(int maSV) {
		if(maSV<=0)
			this.maSV=000;
		else
			this.maSV = maSV;
	}
	
	
	public String getHoTen() {
		return hoTen;
	}
	
	
	public void setHoTen(String hoTen) {
		if(!hoTen.isEmpty())
			this.hoTen = hoTen;
		else
			this.hoTen="Tên không được rỗng";
	}
	
	
	public float getDiemLT() {
		return diemLT;
	}
	
	
	public void setDiemLT(float diemLT) {
		if (diemLT >= 0 && diemLT <= 10)
			this.diemLT = diemLT;
		else
				this.diemLT = 0;
	}
	
	
	public float getDiemTH() {
		return diemTH;
	}
	
	
	public void setDiemTH(float diemTH) {
		if (diemTH >= 0 && diemTH <= 10)
			this.diemTH = diemTH;
		else
			this.diemTH = 0;
	}
	
	
	public float getDiemTB()
	{
	return (diemLT + diemTH)/2;
	}
	
	
	@Override
	public String toString() 
	{
	String str="";
		str+=str.format("%15s%15s%15s%15s%15s",getMaSV(),getHoTen(),getDiemLT(),getDiemTH(),getDiemTB());

		return str;
	}
	
	 
}
