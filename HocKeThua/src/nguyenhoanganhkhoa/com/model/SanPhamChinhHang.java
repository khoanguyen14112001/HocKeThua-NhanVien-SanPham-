package nguyenhoanganhkhoa.com.model;

public class SanPhamChinhHang extends SanPham {
	@Override
	public String toString() {
		String s = super.toString();
		return "Đây là sản phẩm chính hãng, + 10% thuế VAT : " + s ;
	}

}
