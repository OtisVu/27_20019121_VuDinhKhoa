package module2_bai9_toado;
import java.util.Scanner;
public class Toado {
	private String ten;
	private float x;
	private float y;
	
	public Toado(String ten, float x, float y) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
	}

	public Toado() {
		super();
		
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String toString() {
		return String.format("%s(%.0f,%.0f)", ten,x,y);
	}
	

	public static void main(String[] args) {
		Toado h=new Toado("Ten_toa_do",5,5);
		System.out.println("Thông tin tọa dộ x và y:"+h.toString());
		
	}

}
