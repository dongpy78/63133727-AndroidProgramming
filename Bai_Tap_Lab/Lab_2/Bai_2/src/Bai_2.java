/* Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c
nhập từ bàn phím */

import java.util.Scanner;

public class Bai_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào hệ số a cho phương trình bậc 2: ");
    double a = scanner.nextDouble();
    System.out.print("Nhập vào hệ số b cho phương trình bậc 2: ");
    double b = scanner.nextDouble();
    System.out.print("Nhập vào hệ số c cho phương trình bậc 2: ");
    double c = scanner.nextDouble();
    if(a == 0) System.out.printf("Phương trình bậc 2 có 1 nghiệm: %f", -b/a);    
    else {
      double denta = (b*b)-(4*a*c);
      if(denta > 0) 
        System.out.printf("Phương trình có 2 nghiệm phân biệt: x1 = %.2f và x2 = %.2f", (-b+Math.sqrt(denta))/(2*a), (-b-Math.sqrt(denta))/(2*a));      
      if(denta < 0)
        System.out.printf("Phương trình vô nghiệm!"); 
      if(denta == 0)
        System.out.printf("Phương trình có nghiệm kép %f", -b/(2*a)); 
    }
    scanner.close();
  }
}
