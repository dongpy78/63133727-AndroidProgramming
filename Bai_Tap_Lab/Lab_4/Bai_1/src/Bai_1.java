/*Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2
phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin ra màn
hình. Thông tin xuất ra màn hình gồm:
✓ Tên sản phẩm:
✓ Đơn giá:
✓ Giảm giá:
✓ Thuế nhập khẩu:*/
public class Bai_1 {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
	    sp1.nhap();
	    sp1.xuat();

	}

}
