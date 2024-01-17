/* Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo
phương pháp lũy tiến
✓ Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
✓ Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200 */

import java.util.Scanner;

public class Bai_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào số tiền điện của tháng này: ");
    double so_dien = scanner.nextDouble();
    double ket_qua = so_dien <= 50 ? so_dien*1000 : 50*1000 + (so_dien-50)*1200;
    System.out.printf("Số tiền điện của tháng này là: %.0f", ket_qua);
    scanner.close();
  }
}
