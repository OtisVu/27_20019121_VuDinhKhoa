package vudinhkhoa_20019121_nhadat_tuan2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import vudinhkhoa_20019121_nhadat_tuan2.Giao_dich;

public class Giao_dich_dat extends Giao_dich {
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) throws Exception {
		if (loaiDat=="A"||loaiDat=="B"||loaiDat=="C")
			this.loaiDat = loaiDat;
		else 
			throw new Exception("Loại đất bắt buộc là A,B,C không được EMPTY");
	}

	public Giao_dich_dat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		try {
			setLoaiDat(loaiDat);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Giao_dich_dat() {
		super();
		loaiDat="A";
	}

	@Override
	public double tinhThanhtien() {
		if(getLoaiDat()=="B"||getLoaiDat()=="C")
			return super.tinhThanhtien()+getDienTich()*getDonGia();
		else 
			return super.tinhThanhtien()+getDienTich()*getDonGia()*1.5;
	}
	
	@Override
	public String toString() {
		return String.format(" %s | %10s | %,15.1f |", super.toString(),loaiDat,tinhThanhtien());
	}
	
	
}
