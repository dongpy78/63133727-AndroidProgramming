/*Nâng cấp lớp SanPham bằng cách bổ sung public cho các đặt tả truy xuất cho
phương thức xuat() và private cho getThueThuNhap(). Đồng thời bổ sung 2 hàm
tạo, hàm tạo thứ nhất gồm 3 tham số là tên, giá và giảm giá, hàm tạo thứ 2 gồm 2
tham số là tên và giá (ngầm hiểu không giảm giá).
Viết chương trình tạo 2 sản phẩm có giảm giá và không giảm giá sau đó xuất
thông tin 2 sản phẩm ra màn hình*/
public class Bai_3 {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham("Banh Kem", 50000, 100);
	    SanPham sp2 = new SanPham("Banh My" , 10000);
	    sp1.xuat();
	    sp2.xuat();
	}
}
