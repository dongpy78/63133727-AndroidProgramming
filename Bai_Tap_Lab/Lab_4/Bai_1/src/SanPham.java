import java.util.Scanner;

public class SanPham {
  // Khai báo thuộc tính 
  private String tenSP;
  private double donGia;
  private double giamGia;

  public double getThueNhapKhau() {
    return 0.1 * donGia;
  }

  // phuong thuc nhap thong tin 
  public void nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào tên sản phẩm: ");
    tenSP = scanner.nextLine();
    System.out.print("Nhập vào đơn giá sản phẩm: ");
    donGia = scanner.nextDouble();
    System.out.print("Nhập vào giảm giá sản phẩm: ");
    giamGia = scanner.nextDouble();
    scanner.close();
  }

  public void xuat() {
    System.out.print("Tên sản phẩm: " + tenSP + " - " + "Đơn giá: " + donGia + " - " + "Giảm giá: " + giamGia);
    System.out.print("\nThuế nhập khẩu là: " + getThueNhapKhau());
  }
}
