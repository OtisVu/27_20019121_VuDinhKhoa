package vudinhkhoa_20019121_nhadat_tuan2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Giao_dich extends Object{
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	protected double donGia;
	protected double dienTich;
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public Giao_dich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia,
			double dienTich) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public Giao_dich() {
		this("xxx",LocalDate.now(),1,1);
	}
	public String getBang() {
		return String.format("| %10s | %10s | %10s | %10s | ", "Mã giao dịch", 
				"Ngày giao dịch", "Đơn giá", "Diện tích");
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String sNgayGiaoDich = dtf.format(ngayGiaoDich);
		return String.format("| %12s | %14s | %10f | %10.1f |",maGiaoDich,sNgayGiaoDich,donGia,dienTich);
	}
	public static void main(String[] args) {
		Giao_dich gd= new Giao_dich("A22", LocalDate.of(2020, 10, 18), 340.000, 240);
		System.out.println(gd.getBang());
		System.out.println(gd.toString());
	}
	public double tinhThanhtien() {
		
		return 0;
	}
	
}
