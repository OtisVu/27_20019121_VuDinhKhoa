package monhoc;

import java.util.Date;

public class Monhoc {
	private String maMH;
	private String tenMonhoc;
	private Date ngayMoLop;
	private String hoTenGV;
	
	public Monhoc(String maMH, String tenMonhoc, Date ngayMoLop, String hoTenGV) {
		super();
		this.maMH = maMH;
		this.tenMonhoc = tenMonhoc;
		this.ngayMoLop = ngayMoLop;
		this.hoTenGV = hoTenGV;
	}

	public Monhoc() {
		// TODO Auto-generated constructor stub
	}

	public String getMaMH() {
		return maMH;
	}

	public void setMaMH(String maMH) {
		this.maMH = maMH;
	}

	public String getTenMonhoc() {
		return tenMonhoc;
	}

	public void setTenMonhoc(String tenMonhoc) {
		this.tenMonhoc = tenMonhoc;
	}

	public Date getNgayMoLop() {
		return ngayMoLop;
	}

	public void setNgayMoLop(Date ngayMoLop) {
		
		this.ngayMoLop = ngayMoLop;
	}

	public String getHoTenGV() {
		return hoTenGV;
	}

	public void setHoTenGV(String hoTenGV) {
		this.hoTenGV = hoTenGV;
	}

	public String nhapHoc(){
		return"Vào trường thành công!";
	}

	@Override
	public String toString() {
		return "Monhoc [maMH=" + maMH + ", tenMonhoc=" + tenMonhoc
				+ ", ngayMoLop=" + ngayMoLop + ", hoTenGV=" + hoTenGV + "]";
	}

}
