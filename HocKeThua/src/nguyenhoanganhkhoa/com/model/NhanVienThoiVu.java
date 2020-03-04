package nguyenhoanganhkhoa.com.model;

public class NhanVienThoiVu extends NhanVien {
	@Override
	public String toString() {
		String s = super.toString(); //super là gọi cha
		return "Đây là nhân viên thời vụ, thông tin :\n" + s;
	}

}
