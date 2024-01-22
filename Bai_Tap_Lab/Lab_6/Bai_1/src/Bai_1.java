/* Nhập họ và tên từ bàn phím. Xuất tên, họ và tên đệm ra màn hình trong đó tên và
họ xuất IN HOA. */

import java.util.Scanner;

public class Bai_1 {
  public static String layHo(String hoTen) {
    // index lấy khoảng trắng đầu tiên trong chuỗi 
    int index = hoTen.indexOf(' ');
    // Sau đó lấy 1 phần của chuỗi họ tên bắt đầu từ vị trí đầu tiên của chuỗi đến vị trí khoảng trắng của index
    return hoTen.substring(0, index);
  }

  public static String layTenDem(String hoTen) {
    int vt_dautien = hoTen.indexOf(' ');
    int vt_cuoicung = hoTen.lastIndexOf(' ');
    return hoTen.substring(vt_dautien+1, vt_cuoicung);
  }

  public static String layTen(String hoTen) {
    int vt_cuoicung = hoTen.lastIndexOf(' ');
    return hoTen.substring(vt_cuoicung+1);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Nhập họ và tên 
    System.out.print("Nhập họ và tên: ");
    String hoTen = scanner.nextLine();
    // xử lý chuỗi 
    String ho = layHo(hoTen);
    String tenDem = layTenDem(hoTen);
    String ten = layTen(hoTen);

    System.out.println("Họ là: " + ho.toUpperCase());
    System.out.println("Tên đệm là: " + tenDem);
    System.out.println("Tên là: " + ten);
  }
}
