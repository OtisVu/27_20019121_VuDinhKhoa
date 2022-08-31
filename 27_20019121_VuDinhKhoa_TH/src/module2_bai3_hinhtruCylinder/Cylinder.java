package module2_bai3_hinhtruCylinder;

public class Cylinder {
	private float r;
	private float h;
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	
	public Cylinder(float r, float h) {
		super();
		this.r = r;
		this.h = h;
	}

	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	
	 public double getDientichxunhquanh (){
		 return 2*3.14*r*h;
	 }
	 
	 public double getDientichtoanphan (){
		 return (2*3.14*r*r)+(2*3.14*r*h);
	 }
	 
	 public double getThetichhinhtru(){
		 return 3.14*r*r*h;
	 }

	@Override
	public String toString() {
		return "Cylinder [r=" + r + ", h=" + h + "]";
	}
	 
	 
}
