package acd;
/*Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b
nhập từ bàn phím */

import java.util.Scanner;

public class Bai_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào hệ số a của phương trình: ");
    int a = scanner.nextInt();
    System.out.print("Nhập vào hệ số b của phương trình: ");
    int b = scanner.nextInt();
    
    if(a == 0 ) {
      if(b == 0) System.out.printf("Phương trình vô số nghiệm!");
      else System.out.printf("Phương trình vô nghiệm!");
    } else {
      double ket_qua = -b/(double)a;
      System.out.printf("Phương trình có 1 nghiệm là: %.1f", ket_qua);
    }
    scanner.close();
  }
}
