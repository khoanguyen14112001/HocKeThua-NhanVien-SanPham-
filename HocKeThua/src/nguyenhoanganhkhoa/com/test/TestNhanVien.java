package nguyenhoanganhkhoa.com.test;

import nguyenhoanganhkhoa.com.model.NhanVien;
import nguyenhoanganhkhoa.com.model.NhanVienChinhThuc;
import nguyenhoanganhkhoa.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo = new NhanVienChinhThuc();
		teo.setMa("NV1");
		teo.setTen("Tèo damdang");
		System.out.println(teo);
		
		NhanVienThoiVu ty = new NhanVienThoiVu();
		ty.setMa("NV2");
		ty.setTen("pasdddd");
		System.out.println(ty);
		
		NhanVien an = new NhanVien();
		an.setMa("NV3");
		an.setTen("NguyenHiBinhán");
		System.out.println(an);
		
		an=new NhanVienThoiVu();
		an.setMa("NV4");
		an.setTen("Nguyenethiasdj");
		System.out.println(an);

	}

}
