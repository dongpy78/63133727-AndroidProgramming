/*Nhập danh sách số thực với số lượng tùy ý từ bàn phím sau đó xuất danh sách
vừa nhập và tổng của nó.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Bai_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<>();
    while(true) {
      System.out.print("Nhập số thực: ");
      double x = scanner.nextDouble();
      list.add(x);

      System.out.print("Nhập thêm (Y/N)?");
      scanner.nextLine();
      String input = scanner.nextLine();

      if(input.equalsIgnoreCase("N")) {
        break;
      }
    }

    System.out.println("Danh sách số thực đã nhập: ");
    for(double number : list) {
      System.out.print(number + " ");
    }

    double tong = 0; 
    for(double number : list) {
      tong += number;
    }

    System.out.printf("\nGiá trị tổng là: %.1f", tong);
  }
}

