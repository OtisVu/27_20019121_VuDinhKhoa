package module2_bai1_toado;

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
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return String.format("%s(%.0f,%.0f)", ten,x,y);
	}
	
	
}
