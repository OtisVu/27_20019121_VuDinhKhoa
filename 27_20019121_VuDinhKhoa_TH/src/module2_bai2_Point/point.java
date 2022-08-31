package module2_bai2_Point;
import java.util.*;
public class point {
	private static final double[][][] DISTANCES_3D = null;
	private String ten;
	private int x ;
	private int y ;
	private int z;
	
	

	public point() {
		super();
		// TODO Auto-generated constructor stub
	}



	public point(String ten, int x, int y, int z) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
		this.z = z;
	}



	public String getTen() {
		return ten;
	}



	public void setTen(String ten) {
		this.ten = ten;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public int getZ() {
		return z;
	}



	public void setZ(int z) {
		this.z = z;
	}



	public point negate(){
		point p = new point("~"+ten,-x,-y,-z);
		return p;
		
	}
	public double getDistance(){
		 	x = Math .abs (x);
	        y = Math .abs (y);                              
	        z = Math .abs (z);
	        if ((x <= 50) && (y <= 50) && (z <= 50)) {
	             return DISTANCES_3D [x] [y] [z];
	        } else {
	             return ( float ) Math .sqrt (x * x + y * y + z * z);
	        }
	    }



	@Override
	public String toString() {
		return String.format("%s(%d,%d,%d )",ten,x,y,z);
	}
	
}
