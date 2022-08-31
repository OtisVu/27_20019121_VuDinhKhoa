package module2_bai7_hangThucPham;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Hang_thuc_pham {
	private String maHang;
	private String tenHang;
	private int donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public  Hang_thuc_pham(){
		try {
			setMaHang("000");
			setTenHang("xxx");
			setDonGia(0);
			setNgaySanXuat(LocalDate.now());
			setNgayHetHan(LocalDate.now());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	 
	public Hang_thuc_pham(String maHang, String tenHang, int donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		try {
			setMaHang(maHang);
			setTenHang(tenHang);
			setDonGia(donGia);
			setNgaySanXuat(ngaySanXuat);
			setNgayHetHan(ngayHetHan);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		if(!maHang.isEmpty()) this.maHang = maHang;
		else this.maHang = "000";
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if(!tenHang.isEmpty()) this.tenHang = tenHang;
		else this.tenHang="xxx";
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		if(donGia>=0)this.donGia = donGia;
		else this.donGia=0;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) throws Exception {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			throw new Exception("Ngày sản xuất phải trước ngày hiện tại!!!");

	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	
	public void setNgayHetHan(LocalDate ngayHetHan) throws Exception {
		if (ngayHetHan.isAfter(ngaySanXuat)) this.ngayHetHan = ngayHetHan;
		else
			throw new Exception("ngày hết hạn phải sau ngày sản xuất!!!");
	}

	public String kiemTraHetHan() {
		if (this.ngayHetHan.isBefore(LocalDate.now()))
			return String.format("hàng hết hạn");
		else
			return String.format("");
	}

	public String getBang() {
		return String.format("%-8s %-8s %8sVND  %-16s %-15s %-21s", "maHang", 
				"tenHang", "donGia", "NgaySanXuat","NgayHetHan", "KiemTraHetHan");
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String sNgaySanXuat = dtf.format(ngaySanXuat);
		String sNgayHetHan = dtf.format(ngayHetHan);
		return String.format("\"%-8s %-8s %8sVND  %-16s %-15s %-21s", maHang, 
				tenHang, donGia, sNgaySanXuat,sNgayHetHan, kiemTraHetHan());
	}



	public static void main(String[] args) {	
		Hang_thuc_pham h1 = new Hang_thuc_pham("001", "gạo", 100000, LocalDate.of(2018, 07, 10), LocalDate.of(2020, 10, 07));
		Hang_thuc_pham h2 = new Hang_thuc_pham("002", "mì", 5000, LocalDate.of(2021, 01, 01), LocalDate.of(2021, 012, 31));
		Hang_thuc_pham h3 = new Hang_thuc_pham("003", "nước", 10000, LocalDate.of(2021, 01, 01), LocalDate.of(2021, 012, 31));
		System.out.println(h1.getBang());
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());

	}

}
