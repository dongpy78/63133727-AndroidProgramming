/*Viết chương trình tạo ra 2 sản phẩm thông tin được nhập từ bàn phím sau đó gọi
phương thức xuất để xuất thông tin 2 đối tượng sản phẩm đã tạo*/
public class Bai_2 {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
	    SanPham sp2 = new SanPham();
	    System.out.println("--- Sản phẩm thứ 1 --- ");
	    sp1.nhap();
	    sp1.xuat();
	    System.out.println("\n--- Sản phẩm thứ 2 --- ");
	    sp2.nhap();
	    sp2.xuat();

	}

}
