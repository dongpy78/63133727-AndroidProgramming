/*Viết chương trình thực hiện các chức năng sau
1. Nhập danh sách họ và tên
2. Xuất danh sách vừa nhập
3. Xuất danh sách ngẫu nhiên
4. Sắp xếp giảm dần và xuất danh sách
5. Tìm và xóa họ tên nhập từ bàn phím
6. Kết thúc
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Bai_2 {
  
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

    System.out.println("\t+-----------------------------------------+");
    System.out.println("\t|========= LỰA CHỌN CHƯƠNG TRÌNH =========|");
    System.out.println("\t| 1. Nhập danh sách họ và tên             |");
    System.out.println("\t| 2. Xuất danh sách vừa nhập              |");
    System.out.println("\t| 3. Xuất danh sách ngẫu nhiên            |");
    System.out.println("\t| 4. Sắp xếp giảm dần và xuất danh sách   |");
    System.out.println("\t| 5. Tìm và xóa họ tên                    |");
    System.out.println("\t| 6. Kết thúc                             |");
    System.out.println("\t+-----------------------------------------+");
  }

  public static void nhap(ArrayList<String> list, Scanner scanner) {
    System.out.print("Nhập họ tên: ");
    String fullName = scanner.nextLine();
    list.add(fullName);
  }

  public static void xuat(ArrayList<String> list) {
    System.out.println("Danh sách vừa nhập là: ");
    for(String ten:list) {
      System.out.printf(" | " + ten + " | ");
    }
  }

  public static void ngaunhien(ArrayList<String> list) {  
    System.out.print("Danh sách ngẫu nhiên là: ");
    Collections.shuffle(list);
    xuat(list);
  }

  public static void sapXep(ArrayList<String> list) {
    System.out.print("Danh sách sắp xếp giảm dần: ");
    Collections.sort(list);
    Collections.reverse(list);
    xuat(list);
  }

  public static void xoa(ArrayList<String> list, Scanner scanner) {
    System.out.print("Nhập họ và tên cần xóa: ");
    String nameToDelete = scanner.nextLine();
    boolean deleted = list.remove(nameToDelete);
    if(deleted) System.out.print("Đã xóa!");
    else System.out.print("Không tìm thấy!");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> nameList = new ArrayList<>();
    System.out.println("Nhấn Enter để bắt đầu: ");
    while (true) {
      menu();      
      int luachon = scanner.nextInt();
      scanner.nextLine();

      switch (luachon) {
        case 1:
          nhap(nameList, scanner);
          break;
        case 2:
          xuat(nameList); 
          break;
        case 3:
          ngaunhien(nameList);
        break;
        case 4:
          sapXep(nameList);   
        break;
        case 5:
        xoa(nameList, scanner);
        break;
        case 6:
        System.out.print("Chương trình của bạn đã kết thúc: ");        
        System.exit(0);
        break;
        default:
          System.out.println("\nChức năng không hợp lệ. Vui lòng chọn lại!");
      }
    }
        
  }
}
