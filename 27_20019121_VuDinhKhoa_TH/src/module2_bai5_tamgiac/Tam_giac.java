package module2_bai5_tamgiac;
import java.util.Scanner;
public class Tam_giac {
		private int ma,mb,mc;
		
		
		public Tam_giac() {
			super();
			
		}

		public Tam_giac(int ma, int mb, int mc) {
			super();
			if (ma <0 ||mb <0 || mc < 0) 
				 ma=mb=mc=0;
			
		}
		
		public float getMa() {
			return ma;
		}


		public void setMa(int ma) {
			if (ma>0)
				this.ma=ma;
			else
				this.ma=0;
		}


		public float getMb() {
			return mb;
		}


		public void setMb(int mb) {
			if (mb>0)
				this.mb=mb;
			else
				this.mb=0;
		}


		public float getMc() {
			return mc;
		}


		public void setMc(int mc) {
			if (mc>0)
				this.mc=mc;
			else
				this.mc=0;
		}
		
		public double tinhDienTichTamGiac() {
			double p=(double)(ma+mb+mc)/2;
			return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
			
		}
		
		public int tinhChuViTamGiac() {
			return ma+mb+mc;
		}

		public void thongTinTamGiac() {
			if (( ma + mb > mc) || ( ma + mc > mb) || ( mb + mc > ma )) {
				System.out.println("Đây là tam giác ");
				}
				
				if (( ma== mb ) || ( mb == mc ) || ( mc == ma )) {
					System.out.println("Đây là tam giác cân ");
					}
				
				else if (( ma == mb) && ( mb == mc) && ( mc == ma )) {
					System.out.println("Đây là tam giác đều ");
					}
				
				else if (( ma * ma == mb * mb + mc * mc) || ( mb * mb == ma * ma + mc * mc ) || ( mc * mc == mb * mb + ma * ma)) {
					System.out.println("Đây là tam giác vuông ");
					}
				
				else {
					System.out.println("Đây không phải tam giác");
					}
			}
		
		@Override
		public String toString() {
			String str ="";
			str+=str.format("%,15.1f%,15.1f%,15.1f%15d%,15.1f%15s", getMa(),getMb(),getMc(),tinhChuViTamGiac(),tinhDienTichTamGiac());
			return str;
		}
		
	
		


	}