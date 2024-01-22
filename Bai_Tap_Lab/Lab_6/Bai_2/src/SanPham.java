import java.util.Scanner;

public class SanPham {
  public String tenSP;
  public double giaSP;
  public String hang;
  
  // Phương thức nhập thông tin sản phẩm 
  public void nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào tên sản phẩm: ");
    tenSP = scanner.nextLine();
    System.out.print("Nhập vào giá sản phẩm: ");
    giaSP = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Nhập vào hãng của sản phẩm: ");
    hang = scanner.nextLine();
  }

  public void xuat() {
    System.out.print(" | " + "Tên sản phẩm: " + tenSP + " | " + "Giá sản phẩm: " + giaSP + " | " + "Hãng sản phẩm: " + hang + " | ");
  }

  // Kiểm tra phải nokia không
  public boolean laNokia() {
    return hang.equalsIgnoreCase("Nokia");
  }

}
