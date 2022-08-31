package module2_bai9_toado;
import java.util.Scanner;

import module2_bai9_toado.Toado;
public class HinhTron {
	 public Toado tam;
	 private double banKinh;
	 
	 public HinhTron(Toado tam, double banKinh) {
		super();
		this.tam = tam;
		this.banKinh = banKinh;
	}

	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Toado getTam() {
		return tam;
	}

	public void setTam(Toado tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public double tinhChuVi(){
		return 2*3.14*banKinh;
	}
	
	public double tinhDienTich(){
		return banKinh*banKinh*3.14;
	}

	@Override
	public String toString() {
		return "Bai7_HinhTron [tam=" + tam + ", banKinh=" + banKinh + "]";
	}

	public static void main(String[] args) {
		Toado a=new Toado("P",5,5);
		System.out.println("Thông tin tạo độ:"+a);
		HinhTron h =new HinhTron();
		h.setBanKinh(10.5);
		System.out.println("Diện tich hình tròn:"+h.tinhDienTich());
		System.out.println("Chu vi hình tròn:"+h.tinhChuVi());
		System.out.println(h.toString());
		
	}

}
