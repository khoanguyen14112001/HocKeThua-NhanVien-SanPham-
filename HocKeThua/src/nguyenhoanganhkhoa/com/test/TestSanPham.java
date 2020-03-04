package nguyenhoanganhkhoa.com.test;

import nguyenhoanganhkhoa.com.model.SanPhamChinhHang;
import nguyenhoanganhkhoa.com.model.SanPhamXachTay;

public class TestSanPham {

	public static void main(String[] args) {
		SanPhamChinhHang sp1 = new SanPhamChinhHang();
		sp1.setTen("CocaCola");
		sp1.setMa("4869");
		sp1.setSoLuong(100);
		sp1.setGia(5000);
		System.out.println(sp1);
		
		SanPhamXachTay sp2 = new SanPhamXachTay();
		sp2.setGia(6500);
		sp2.setMa("4333");
		sp2.setSoLuong(1000);
		sp2.setTen("Pepsi");
		System.out.println(sp2);

	}

}
