package nguyenhoanganhkhoa.com.model;

public class NhanVien {
	protected String ma;
	protected String ten;
	protected int namSinh;
	protected boolean gioiTinh;
	protected String cmnd;
	protected String diaChi;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public NhanVien(String ma, String ten, int namSinh, boolean gioiTinh, String cmnd, String diaChi) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
		this.diaChi = diaChi;
	}
	public NhanVien() {
		super();
	}
	@Override
	public String toString() {
		return this.ma + "\t" + this.ten;
	}

}
