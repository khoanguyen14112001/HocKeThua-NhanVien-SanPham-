package nguyenhoanganhkhoa.com.model;

public class NhanVienChinhThuc extends NhanVien{
	@Override
	public String toString() {
		String s = super.toString(); //super là lớp cha của nó
		return "Đây là nhân viên chính thức, thông tin :\n " + s;
	}

}
