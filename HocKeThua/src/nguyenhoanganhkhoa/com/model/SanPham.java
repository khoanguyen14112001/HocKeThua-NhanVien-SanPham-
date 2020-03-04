package nguyenhoanganhkhoa.com.model;

public class SanPham {
	protected String ma;
	protected String ten;
	protected double gia;
	protected int soLuong;
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
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public SanPham(String ma, String ten, double gia, int soLuong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
		this.soLuong = soLuong;
	}
	public SanPham() {
		super();
	}
	
	@Override
	public String toString() {
		return this.ma + "\t" + this.ten + "\t" + this.gia + "\t" + this.soLuong;
	}

}
