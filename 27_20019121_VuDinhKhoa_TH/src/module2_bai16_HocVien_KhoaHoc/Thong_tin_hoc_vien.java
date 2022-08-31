package module2_bai16_HocVien_KhoaHoc;
import java.util.Scanner;
public class Thong_tin_hoc_vien {
	private String hoTen;
	private String diaChi;
	private int soDienThoai;
	public Thong_tin_hoc_vien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Thong_tin_hoc_vien(String hoTen, String diaChi,
			int soDienThoai) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	@Override
	public String toString() {
		return "Bai_14_Thong_tin_hoc_vien [hoTen=" + hoTen + ", diaChi="
				+ diaChi + ", soDienThoai=" + soDienThoai + "]";
	}
	
	public static void main(String[] args) {
		Thong_tin_hoc_vien h =new Thong_tin_hoc_vien();
		h.setDiaChi("To10kp5a_TD_BH_DN");
		h.setHoTen("VUDINHKHOA");
		h.setSoDienThoai(0123456754);
		System.out.println(h.toString());
	}
	
}
