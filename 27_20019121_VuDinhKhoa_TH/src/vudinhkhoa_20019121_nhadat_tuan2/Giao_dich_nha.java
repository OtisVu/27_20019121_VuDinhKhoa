package vudinhkhoa_20019121_nhadat_tuan2;

import java.time.LocalDate;

public class Giao_dich_nha extends Giao_dich{
	private boolean loaiNha;
	private String diaChi;
	public boolean getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(boolean loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) throws Exception {
		if (!diaChi.isEmpty())
			this.diaChi = diaChi;
		else 
			throw new Exception("Không được để trống địa chỉ!!!");
	}
	public Giao_dich_nha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, boolean loaiNha,
			String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		try {
			setDiaChi(diaChi);
			setLoaiNha(loaiNha);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public Giao_dich_nha() {
		super();
		loaiNha=true;
		diaChi="Chưa biết";
	}
	
	@Override
	public double tinhThanhtien() {
		if (loaiNha) 
			return super.tinhThanhtien()+getDienTich()*getDonGia();
		else 
			return super.tinhThanhtien()+getDienTich()*getDonGia()*0.9;
	}
	
	@Override
	public String toString() {
		String loaiNha ="";
		if(getLoaiNha())
			loaiNha ="Cao cấp";
		else
			loaiNha="Thường";
		return String.format(" %s | %10s | %,15.1f |",super.toString(), loaiNha,tinhThanhtien());
	}
	
}
