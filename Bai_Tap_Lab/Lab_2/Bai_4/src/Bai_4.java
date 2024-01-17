import java.util.Scanner;

public class Bai_4 {
  public static void giaiPTB1() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào hệ số a của phương trình: ");
    int a = scanner.nextInt();
    System.out.print("Nhập vào hệ số b của phương trình: ");
    int b = scanner.nextInt();

    if (a == 0) {
        if (b == 0)
            System.out.println("Phương trình vô số nghiệm!");
        else
            System.out.println("Phương trình vô nghiệm!");
    } else {
        double ket_qua = -b / (double) a;
        System.out.printf("Phương trình có 1 nghiệm là: %.1f%n", ket_qua);
    }
    scanner.close();
  }

  public static void giaiPTB2() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào hệ số a cho phương trình bậc 2: ");
    double a = scanner.nextDouble();
    System.out.print("Nhập vào hệ số b cho phương trình bậc 2: ");
    double b = scanner.nextDouble();
    System.out.print("Nhập vào hệ số c cho phương trình bậc 2: ");
    double c = scanner.nextDouble();

    if (a == 0)
      System.out.printf("Phương trình bậc 2 có 1 nghiệm: %.2f%n", -b / a);
    else {
      double delta = (b * b) - (4 * a * c);
      if (delta > 0)
        System.out.printf("Phương trình có 2 nghiệm phân biệt: x1 = %.2f và x2 = %.2f%n", (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a));
      else if (delta < 0)
        System.out.println("Phương trình vô nghiệm!");
      else
        System.out.printf("Phương trình có nghiệm kép: %.2f%n", -b / (2 * a));
    }
    scanner.close();
  }

  public static void tinhTienDien() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào số tiền điện của tháng này: ");
    double so_dien = scanner.nextDouble();
    double ket_qua = so_dien <= 50 ? so_dien * 1000 : 50 * 1000 + (so_dien - 50) * 1200;
    System.out.printf("Số tiền điện của tháng này là: %.0f%n", ket_qua);
    scanner.close();
  }

  public static void Menu() {
    int lua_chon;
    Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("\t+---------------------------------+");
        System.out.println("\t|====== LỰA CHỌN CHƯƠNG TRÌNH =====|");
        System.out.println("\t| 1. Giải phương trình bậc nhất    |");
        System.out.println("\t| 2. Giải phương trình bậc 2       |");
        System.out.println("\t| 3. Tính tiền điện                |");
        System.out.println("\t| 4. Thoát                         |");
        System.out.println("\t+---------------------------------+");
        System.out.print("Chọn chương trình (0-3): ");
        lua_chon = scanner.nextInt();

        switch (lua_chon) {
            case 1:
                giaiPTB1();
                break;
            case 2:
                giaiPTB2();
                break;
            case 3:
                tinhTienDien();
                break;
            case 4:
                System.out.println("Kết thúc ứng dụng. Tạm biệt!");
                break;
            default:
                System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại!");
        }
    } while (lua_chon < 1 || lua_chon > 4);

    scanner.close();
}

  public static void main(String[] args) {
    Menu();
  }
}
