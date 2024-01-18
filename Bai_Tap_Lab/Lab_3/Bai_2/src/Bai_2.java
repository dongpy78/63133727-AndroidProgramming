/*Viết chương trình xuất ra màn hình bảng cửu chương */
import java.util.Scanner;

public class Bai_2 {  
  public static void bang_cuu_chuong(int n) {
    System.out.printf("Bảng cửu chương: " + n + ":");
    for(int i = 0; i <= 10; i++)
      System.out.printf("\n%d * %d = %d", n, i, n*i);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào bảng cửu chương bạn muốn hiển thị: ");
    int n = scanner.nextInt();
    bang_cuu_chuong(n);
    scanner.close();
  }
}