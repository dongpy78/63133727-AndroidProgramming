/* Nhập vào mảng 5 sản phẩm (mỗi sản phẩm gồm tên, giá và hãng). Xuất thông tin
các sản phẩm có hãng là Nokia. */

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_2 {
  public static void main(String[] args) {
    ArrayList <SanPham> dsSanPham = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    // Nhập thông tin 5 sản phẩm 
    for(int i = 0; i < 5; i++) {
      System.out.println("Nhập thông tin sản phẩm thứ: "+(i+1));
      SanPham sp = new SanPham();
      sp.nhap();
      dsSanPham.add(sp);
    }
    // Kiểm tra sản phẩm có phải là Nokia
    System.out.print("Thông tin sản phẩm có hãng là Nokia: ");
    for(SanPham sp : dsSanPham) {
      if("Nokia".equalsIgnoreCase(sp.hang)) {
        sp.xuat();
      }
    }
  }
}
