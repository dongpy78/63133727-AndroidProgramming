
public class SanPham {
  private String tenSP;
  private double donGia;
  private double giamGia;

  // Hàm tạo 3 tham số 
  public SanPham(String tenSP, double donGia, double giamGia) {
    this.tenSP = tenSP;
    this.donGia = donGia;
    this.giamGia = giamGia;
  }

  // Hàm tạo 2 tham số 
  public SanPham(String tenSP, double donGia) {
    this(tenSP, donGia, 0);
  }

  private double getThueNhapKhau() {
    return 0.1 * donGia;
  }

  public void xuat() {
    System.out.printf("\nTên sản phẩm: %s - Giá sản phẩm: %.0f - Giảm giá sản phẩm: %.0f", tenSP, donGia, giamGia);
  }
}
