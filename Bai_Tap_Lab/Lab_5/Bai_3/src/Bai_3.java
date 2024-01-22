import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.plaf.ScrollBarUI;

public class Bai_3 {
  private static void clearScreen() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } catch (Exception e) {
        System.out.print("Lỗi khi xóa màn hình!");
    }
  }

  public static void menu() {
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    clearScreen();

    System.out.println("\t+---------------------------------------------------+");
    System.out.println("\t|============== LỰA CHỌN CHƯƠNG TRÌNH ==============|");
    System.out.println("\t| 1. Nhập danh sách sản phẩm từ bàn phím            |");
    System.out.println("\t| 2. Sắp xếp giảm dần theo giá và xuất ra màn hình  |");
    System.out.println("\t| 3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím  |");
    System.out.println("\t| 4. Xuất giá trung bình của các sản phẩm           |");  
    System.out.println("\t| 5. Kết thúc                                       |");
    System.out.println("\t+---------------------------------------------------+");
  }

  public static void nhap(ArrayList<SanPham> product, Scanner scanner) {
    System.out.print("Nhập vào số lượng sản phẩm: ");
    int soluong = scanner.nextInt();    
    scanner.nextLine();
    for(int i = 1; i <= soluong; i++) {
      System.out.print("Nhập tên sản phẩm: ");
      String tenSP = scanner.nextLine();
      System.out.print("Nhập vào giá sản phẩm: ");
      Double giaSP = scanner.nextDouble();  
      scanner.nextLine();
      SanPham sp = new SanPham(tenSP, giaSP);
      product.add(sp);
    }
  }

  public static void sapXep(ArrayList<SanPham> product) {
    Comparator <SanPham> comp = new Comparator<SanPham>() {
      @Override
      public int compare(SanPham o1, SanPham o2) {
        return o2.giaSP.compareTo(o1.giaSP);
      }
    };
    Collections.sort(product, comp);
  }

  public static void in(ArrayList<SanPham> product) {
    System.out.print("Danh sách sản phẩm giảm dần theo giá: ");
    for(SanPham sp: product) {
      System.out.printf("|" + sp.tenSP + "|" + " " + "|" + sp.giaSP + "|");
    }
  }

  public static void xoa(ArrayList<SanPham> product, Scanner scanner) {
    System.out.print("Nhập tên sản phẩm cần xóa: ");
    String nametoDelete = scanner.nextLine();
    // boolean deleted = product.remove(nametoDelete);
    // if(deleted) System.out.print("Đã xóa!");
    // else System.out.print("Không tìm thấy!");
    product.removeIf(sp -> sp.tenSP.equals(nametoDelete));
    System.out.println("Đã xóa sản phẩm có tên: " + nametoDelete);
  }

  public static void tinhTB(ArrayList<SanPham> product) {
    if(product.isEmpty()) return;
    double tong = 0;
    for(SanPham sp : product) tong += sp.giaSP;
    System.out.printf("Giá trung bình của các sản phẩm là: %f", tong/product.size());
  }

  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);    
    ArrayList<SanPham> sp = new ArrayList<>();
    while(true) {
      menu();
      int luachon = scanner.nextInt();
      scanner.nextLine();

      switch (luachon) {
        case 1:
          nhap(sp, scanner);          
          break;
        case 2:
        sapXep(sp);
        in(sp);       
          break;
        case 3:
        xoa(sp, scanner);      
          break;
        case 4:
        tinhTB(sp);
          break;
        case 5:
        System.out.print("Chương trình của bạn đã kết thúc: ");        
        System.exit(0);
        break;
        default:
          System.out.println("\nChức năng không hợp lệ. Vui lòng chọn lại!");      
      }
    }
  }
}
