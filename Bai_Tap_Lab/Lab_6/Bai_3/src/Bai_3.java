/* Nhập mảng 5 sinh viên (mỗi sinh viên gồm họ tên, email, số điện thoại, chứng
minh nhân dân). Kiểm tra và thông báo lỗi nếu nhập không đúng định dạng email,
số điện thoại và CMND. */

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_3 {
  public static void main(String[] args) {
    ArrayList <SinhVien> dsSV = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < 5; i++) {
      System.out.println("Nhập vào thông tin sinh viên thứ: " + (i+1));
      SinhVien sv = new SinhVien();
      sv.nhap();
      dsSV.add(sv);
    }
    for(SinhVien sv : dsSV) {
      System.out.println("Thông tin các sinh viên: ");
      sv.xuat();
    }
  }
}
