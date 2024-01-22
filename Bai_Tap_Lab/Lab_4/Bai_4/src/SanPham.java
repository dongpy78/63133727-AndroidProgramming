
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

  // Tạo getter và setter cho tenSP
  public String getTenSP() {
    return this.tenSP;
  }

  public void SetTenSP(String tenSP) {
    this.tenSP = tenSP;
  }

  // Tạo getter và setter cho don gia
  public Double getDonGia() {
    return this.donGia;
  }

  public void setDonGia(Double donGia) {
    this.donGia = donGia;
  }

  // tạo getter và setter cho giam gia
  public Double getGiamGia() {
    return this.giamGia;
  }

  public void setGiamGia(double giamGia) {
    this.giamGia = giamGia;
  }

  private double getThueNhapKhau() {
    return 0.1 * donGia;
  }

  public void xuat() {
    System.out.printf("\nTên sản phẩm: %s - Giá sản phẩm: %.0f - Giảm giá sản phẩm: %.0f", tenSP, donGia, giamGia);
  }
}
