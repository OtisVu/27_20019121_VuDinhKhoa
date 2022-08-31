package module2_bai2_Point;
import java.util.Scanner;
public class Text_point extends point{

	public static void main(String[] args) {
		point p1Mem = nhapmem();

	}
	static point nhapmem(){
		String ten;
		int x,y,z;
		
		point p1 = new point ();
		
		System.out.println("Bạn nhập tên :");
		Scanner sc= new Scanner(System.in);
		ten=sc.next();
		
		System.out.println("Bạn nhập x :");
		x=sc.nextInt();
		
		System.out.println("Bạn nhập y :");
		y=sc.nextInt();
		
		System.out.println("Bạn nhập z :");
		z=sc.nextInt();
		
		p1.setTen(ten);
		p1.setX(x);
		p1.setY(y);
		p1.setZ(z);
		System.out.println(p1);
		return p1;

	}

}
