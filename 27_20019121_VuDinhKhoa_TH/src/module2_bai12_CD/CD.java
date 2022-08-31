package module2_bai12_CD;
public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		if(giaThanh>0)
			this.giaThanh=giaThanh;
	}

	public CD() {
		super();
		// điền thêm măc định của các thành phần ko dc để rỗng
	}

	public CD(int maCD, String tuaCD, int soBaiHat, float giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if(maCD >0)
			this.maCD=maCD;
		else
			this.maCD=999999;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		if (tuaCD.isEmpty()== false)
			this.tuaCD = tuaCD;
		else
			this.tuaCD="Chưa xác định";
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat >0)
			this.soBaiHat=soBaiHat;
		else
			this.soBaiHat=000000;
	}

	

	@Override
	public String toString() {
		String str="";
		str+=str.format("%-10s %-20s %-10s %-20s", maCD,tuaCD,soBaiHat,giaThanh);
		return str;
	}

	public void hienThiMenu(){
		System.out.printf("%-10d %-20s %-10d %-20.1f \n",maCD,tuaCD,soBaiHat,giaThanh);
	}
	

}
