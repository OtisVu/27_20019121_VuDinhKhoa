package vudinhkhoa_20019121_nhadat_tuan2;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		Giao_dich[] g = new Giao_dich[6];
		g[0] = new Giao_dich_dat("001", LocalDate.of(2021, 10, 05), 1000000, 500, "C");
		g[1] = new Giao_dich_dat("002", LocalDate.of(2013, 9, 07), 1500000, 500, "B");
		g[2] = new Giao_dich_dat("003", LocalDate.of(2021, 10, 19), 1900000, 500, "A");
		g[3] = new Giao_dich_nha("004", LocalDate.of(2013, 9, 15), 2000000, 150, true, "12 NVB");
		g[4] = new Giao_dich_nha("005", LocalDate.of(2020, 07, 15), 1000000, 100, false, "13 NVB");
		g[5] = new Giao_dich_nha("006", LocalDate.of(2020, 07, 15), 1500000, 100, false, "14 NVB");
		for (Giao_dich giaoDich : g) {
			System.out.println(giaoDich);
		}
		System.out.printf("TB thành tiền giao dịch nhà đất: %10.1f\n",trungBinhGiaoDichDat(g));
		System.out.println("Những giao dịch trong tháng 9/2013");
		for (Giao_dich giaoDich : g) {
			if (kiemTraNgayGiaoDich(giaoDich))
				System.out.println(giaoDich);
		}
	}


	public static double trungBinhGiaoDichDat(Giao_dich[] g) {
		double s = 0;
		int d = 0;
		for (Giao_dich giaoDich : g) {
			if (giaoDich instanceof Giao_dich_dat)
				s += giaoDich.tinhThanhtien();
			d++;
		}
		return s / d;
	}

	public static boolean kiemTraNgayGiaoDich(Giao_dich g) {
		if (g.getNgayGiaoDich().isAfter(LocalDate.of(2013, 8, 31))
				&& g.getNgayGiaoDich().isBefore(LocalDate.of(2013, 10, 1)))
			return true;
		else
			return false;
	}

}

