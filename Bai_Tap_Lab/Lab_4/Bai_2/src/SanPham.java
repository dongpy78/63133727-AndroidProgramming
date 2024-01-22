
import java.util.Scanner;

public class SanPham {
  private String tenSanPham;
  private String loaiSanPham;
  private Double giaSanPham;

  public void nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào tên sản phẩm: ");
    tenSanPham = scanner.nextLine();
    System.out.print("Nhập vào loại sản phẩm: ");
    loaiSanPham = scanner.nextLine();
    System.out.print("Nhập vào giá sản phẩm: ");
    giaSanPham = scanner.nextDouble();    
    scanner.nextLine();
  }

  public void xuat() {
    System.out.printf("Tên sản phẩm: %s - Loại sản phẩm: %s - Giá sản phẩm: %.0f", tenSanPham, loaiSanPham, giaSanPham);
  }
}
